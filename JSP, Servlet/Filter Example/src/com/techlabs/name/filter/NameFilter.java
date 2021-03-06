package com.techlabs.name.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/NameFilter")
public class NameFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletResponse res = (HttpServletResponse) response;
		System.out.println("Filter running");
		if ((request.getParameter("firstName") != null) && (request.getParameter("lastName") != null)) {
			if ((request.getParameter("firstName").equals("sejal"))
					&& (request.getParameter("lastName").equals("naik"))) {
				System.out.println("correct name");
				chain.doFilter(request, response);

			} else {
				System.out.println("wrong name");
				res.sendRedirect("Name.jsp");
			}
		}
	}
}
