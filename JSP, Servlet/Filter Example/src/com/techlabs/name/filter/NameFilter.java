package com.techlabs.name.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/NameFilter")
public class NameFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String fullName = request.getParameter("firstName") + " " + request.getParameter("lastName");
		
		System.out.println(fullName);
		
		chain.doFilter(request, response);
	}
}
