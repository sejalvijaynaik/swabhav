package com.techlabs.employee.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.techlabs.employee.model.LoginEmployee;
import com.techlabs.employee.service.LoginEmployeeJDBC;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginEmployeeJDBC loginEmployeeJDBC;
	@Resource(name = "jdbc/employee")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		loginEmployeeJDBC = new LoginEmployeeJDBC(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		List<LoginEmployee> loginEmployees = loginEmployeeJDBC.getLoginEmployees();
		for (LoginEmployee tempLoginEmployee : loginEmployees) {
			if ((tempLoginEmployee.getUsername().equals(request.getParameter("username")))
					&& (tempLoginEmployee.getPassword().equals(request.getParameter("password")))) {

				response.sendRedirect("ListController");
				return;
			}
			else {
				out.println("Wrong username or password");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.include(request, response);
				return;
			}
		}
	}
}
