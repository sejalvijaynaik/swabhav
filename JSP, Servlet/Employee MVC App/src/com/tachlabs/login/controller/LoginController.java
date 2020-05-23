package com.tachlabs.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		if((session.getAttribute("username") != null)&&(session.getAttribute("password") != null)){
			response.sendRedirect("EmployeeController");
		}
		
		else if ((request.getParameter("username").equals("admin")) && (request.getParameter("password").equals("admin"))) {

			session.setAttribute("username", request.getParameter("username"));
			session.setAttribute("password", request.getParameter("password"));
			response.sendRedirect("EmployeeController");
		} else {
			response.sendRedirect("GuestEmployeeController");
		}
	}
}
