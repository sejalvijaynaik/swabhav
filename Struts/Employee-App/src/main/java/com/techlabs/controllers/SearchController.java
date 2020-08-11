package com.techlabs.controllers;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.techlabs.model.Employee;
import com.techlabs.service.EmployeeDAO;
import com.techlabs.service.EmployeeJDBC;

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDAO employeeDAO;
	@Resource(name = "jdbc/employee")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeDAO = new EmployeeJDBC(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");

		List<Employee> searchEmployees = employeeDAO.searchEmployees(name);

		if (searchEmployees != null) {
			Cookie searchNameCookie = new Cookie("searchNameCookie", request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60 * 60 * 24);
			response.addCookie(searchNameCookie);
		}

		request.setAttribute("employees", searchEmployees);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
		requestDispatcher.forward(request, response);
	}
}
