package com.techlabs.employee.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.employee.service.EmployeeService;

@WebServlet("/deleteEmployee")
public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeService = new EmployeeService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getContentType();

		String idInstring = request.getParameter("employeeId");
		int id = Integer.parseInt(idInstring);

		employeeService.deleteEmployee(id);

		response.sendRedirect("listEmployees");
	}

}
