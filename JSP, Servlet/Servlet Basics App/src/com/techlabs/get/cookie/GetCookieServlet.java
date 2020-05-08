package com.techlabs.get.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getContentType();
		PrintWriter out = response.getWriter();
		
		String cookieColor = "white";

		Cookie[] cookies = request.getCookies();

		if(cookies != null){
			for(Cookie tempCookie : cookies){
				if("redCookie".equals(tempCookie.getName())){
					cookieColor = tempCookie.getValue();
					break;
				}
			}
		}
		
		out.println("<body bgcolor = " + cookieColor);
		RequestDispatcher rd = request.getRequestDispatcher("getCookie.html");
		rd.include(request, response);
		


	}

}
