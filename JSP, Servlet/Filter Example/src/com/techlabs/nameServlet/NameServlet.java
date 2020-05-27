package com.techlabs.nameServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		System.out.println("Servlet running");
		response.setContentType("text/html");

		String fullName = request.getParameter("firstName") + " " + request.getParameter("lastName");
		
		request.setAttribute("fullname", fullName);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("display.jsp");
		
		requestDispatcher.forward(request, response);
	}
}
