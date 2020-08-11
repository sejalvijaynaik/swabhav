package com.techlabs.controllers;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.techlabs.service.EmployeeDAO;
import com.techlabs.service.EmployeeJDBC;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDAO employeeDAO;
	@Resource(name = "jdbc/employee")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		employeeDAO = new EmployeeJDBC(dataSource);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String designation = request.getParameter("designation");

		employeeDAO.addEmployee(name, salary, designation);

		response.sendRedirect("ListController");
	}
}
