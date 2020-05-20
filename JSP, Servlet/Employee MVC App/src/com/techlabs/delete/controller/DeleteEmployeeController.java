package com.techlabs.delete.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.employee.service.EmployeeService;

@WebServlet("/DeleteEmployeeController")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getContentType();
		
		String id = request.getParameter("employeeId");
		
		EmployeeService employeeService = EmployeeService.getEmployeeService();
		employeeService.deleteEmployee(id);
		
		response.sendRedirect("EmployeeController");
	}
}
