package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutController() {
		System.out.println("logoutcontroller constructor running");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("logoutcontroller do get running");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		ServletContext context = getServletContext();

		System.out.println("logoutcontroller invalidating session");

		session.invalidate();

		System.out.println("logoutcontroller users info :");
		System.out.println("total users : " + context.getAttribute("totalUsers"));
		System.out.println("active users : " + context.getAttribute("activeUsers"));

		out.print("You are successfully logged out");
	}
}
