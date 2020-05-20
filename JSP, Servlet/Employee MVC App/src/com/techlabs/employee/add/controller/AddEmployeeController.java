package com.techlabs.employee.add.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.employee.service.EmployeeService;

@WebServlet("/AddEmployeeController")
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		
		String name = request.getParameter("employeeName");
		int salary = Integer.parseInt(request.getParameter("employeeSalary"));
		String designation = request.getParameter("employeeDesignation");

		EmployeeService employeeService = EmployeeService.getEmployeeService();
		employeeService.addEmployee(name, salary, designation);
		
		response.sendRedirect("EmployeeController");
	}
}
