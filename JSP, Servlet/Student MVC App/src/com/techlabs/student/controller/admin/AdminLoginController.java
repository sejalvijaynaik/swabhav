package com.techlabs.student.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		if ((request.getParameter("username").equals("admin")) && (request.getParameter("password").equals("admin"))) {
			session.setAttribute("username", "username");
			session.setAttribute("password", "password");
			session.setMaxInactiveInterval(60*60*24);
			response.sendRedirect("AdminStudentController");
		} else {
			out.println("Wrong username or password");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminLogin.jsp");
			requestDispatcher.include(request, response);
		}
	}
}
