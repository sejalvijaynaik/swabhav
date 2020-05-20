package com.basics.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletBasic")
public class ServletBasic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>This is a heading</h1>");
		out.println("<p>This is a paragraph</p>");
		out.println("<p>Current date and time : " + new java.util.Date() + "</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
