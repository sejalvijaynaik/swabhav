package com.techlabs.employee.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.employee.service.LoginEmployeeService;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginEmployeeService loginEmployeeService;

	@Override
	public void init() throws ServletException {
		super.init();
		loginEmployeeService = new LoginEmployeeService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();

		if ((request.getParameter("username") != null) && (request.getParameter("password") != null)) {
			if (loginEmployeeService.isValid(request.getParameter("username"), request.getParameter("password"))) {
				session.setAttribute("username", request.getParameter("username"));
				session.setAttribute("password", request.getParameter("password"));
				session.setMaxInactiveInterval(60 * 60 * 24);
				response.sendRedirect("listEmployees");
			} else {
				out.println("<h2 style = 'color:red'>Username or password entered is wrong</h2>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.include(request, response);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
		requestDispatcher.include(request, response);
	}

}
