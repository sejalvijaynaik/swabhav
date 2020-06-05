package com.techlabs.employee.controllers;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.techlabs.employee.service.EmployeeJDBC;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeJDBC employeeJDBC;
	@Resource(name = "jdbc/employee")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeJDBC = new EmployeeJDBC(dataSource);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");

		int id = Integer.parseInt(request.getParameter("ID"));
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String designation = request.getParameter("designation");
		
		employeeJDBC.updateEmployee(id, name, salary, designation);
		
		response.sendRedirect("ListController");
	}

}
