package com.techlabs.controllers;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.techlabs.model.Employee;
import com.techlabs.service.EmployeeDAO;
import com.techlabs.service.EmployeeJDBC;

@WebServlet("/GuestController")
public class GuestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDAO employeeJDBC;
	@Resource(name = "jdbc/employee")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeJDBC = new EmployeeJDBC(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		List<Employee> employees = employeeJDBC.getEmployees();
		request.setAttribute("employees", employees);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestList.jsp");
		requestDispatcher.forward(request, response);
	}
}
