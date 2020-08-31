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

@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeController() {
		System.out.println("WelcomeController constructor running");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("welcome controller get running");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		ServletContext context = getServletContext();

		String username = request.getParameter("username");
		int totalUsers = (Integer) context.getAttribute("totalUsers");
		int activeUsers = (Integer) context.getAttribute("activeUsers");

		System.out.println("WelcomeController setting session");
		
		session.setAttribute("username", username);
		System.out.println("Total Users : " + totalUsers);
		System.out.println("Active Users : " + activeUsers);

		out.println("Welcome" + username);
		out.println("Total Users : " + totalUsers);
		out.println("Active Users : " + activeUsers);
		out.print("<br><a href='logout'>logout</a>");  
        
	}
}
