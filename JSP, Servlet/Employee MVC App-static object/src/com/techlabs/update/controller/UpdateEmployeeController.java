package com.techlabs.update.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.employee.model.Employee;
import com.techlabs.employee.service.EmployeeService;

@WebServlet("/UpdateEmployeeController")
public class UpdateEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String id = request.getParameter("employeeId");
		String name = request.getParameter("employeeName");
		int salary = Integer.parseInt(request.getParameter("employeeSalary"));
		String designation = request.getParameter("employeeDesignation");
		
		EmployeeService.updateEmployee(id, name, salary, designation);
		
		response.sendRedirect("EmployeeController");
	}
}
