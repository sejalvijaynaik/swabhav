package com.techlabs.employee.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.employee.service.EmployeeService;

@WebServlet("/guestListEmployees")
public class GuestController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeService = new EmployeeService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		request.setAttribute("employees", employeeService.getEmployees());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestEmployee.jsp");
		requestDispatcher.forward(request, response);
	}

}