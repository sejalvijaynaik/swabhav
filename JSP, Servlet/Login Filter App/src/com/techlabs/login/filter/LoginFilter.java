package com.techlabs.login.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		if ((request.getParameter("username") != null) && (request.getParameter("password") != null)) {
			System.out.println("when parameters are not null");
			if ((request.getParameter("username").equals("admin"))
					&& (request.getParameter("password").equals("admin"))) {
				System.out.println("when parametsr are valid");
				chain.doFilter(request, response);
			} else {
				System.out.println("when parameters are nt valid");
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<h2>Please enter correct username and password</h2>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.include(request, response);
			}
		}
	}
}
