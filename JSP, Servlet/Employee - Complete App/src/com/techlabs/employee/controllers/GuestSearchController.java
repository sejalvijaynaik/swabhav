package com.techlabs.employee.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlabs.employee.model.Employee;
import com.techlabs.employee.service.EmployeeService;

@WebServlet("/searchGuestEmployee")
public class GuestSearchController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeService = new EmployeeService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");
		if (name == null) {
			name = "";
		}

		List<Employee> searchEmployees = employeeService.searchEmployees(name);
		System.out.println(searchEmployees.size());

		if (searchEmployees != null) {
			String cookieName = request.getParameter("searchName") + "Cookie";
			Cookie searchNameCookie = new Cookie(cookieName, request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60 * 60 * 24);
			response.addCookie(searchNameCookie);
		}

		request.setAttribute("contacts", searchEmployees);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestEmployee.jsp");
		requestDispatcher.forward(request, response);
	}
}
