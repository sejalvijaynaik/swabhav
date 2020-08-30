package com.techlabs.employee.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.employee.service.EmployeeService;

@WebServlet("/AddEmployee")
public class AddController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeService = new EmployeeService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		double salary;

		// --------To type check for number-----------------------
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("salary", request.getParameter("salary"));
		request.setAttribute("designation", request.getParameter("designation"));

		for (char c : request.getParameter("salary").toCharArray()) {
			if (!Character.isDigit(c)) {
				out.println("<h2 style = 'color:red'>Enter number in salary</h2>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("add.jsp");
				requestDispatcher.include(request, response);
				return;
			}
		}

		// --------------------------------------------------------------

		String name = request.getParameter("name");
		salary = Double.parseDouble(request.getParameter("salary"));
		String designation = request.getParameter("designation");

		employeeService.addEmployee(name, salary, designation);

		response.sendRedirect("listEmployees");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("add.jsp");
		requestDispatcher.forward(request, response);
	}
}
