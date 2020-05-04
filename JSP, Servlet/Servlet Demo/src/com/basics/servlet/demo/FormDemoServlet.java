package com.basics.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormDemoServlet")
public class FormDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Form Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Name entered is : " + request.getParameter("firstName")+ " " + request.getParameter("lastName") + "</p>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
