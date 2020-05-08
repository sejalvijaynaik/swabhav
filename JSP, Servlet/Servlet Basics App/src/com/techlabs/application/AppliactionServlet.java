package com.techlabs.application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppliactionServlet")
public class AppliactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		ServletContext application = config.getServletContext();
		
		String oldValue = "0";
		String newValue ="1";

		if((application.getAttribute("oldValue") == null)&&(application.getAttribute("newValue") == null)){
			application.setAttribute("oldValue", oldValue);
			application.setAttribute("newValue", newValue);
		}

		else{
			oldValue = (String)(application.getAttribute("oldValue"));
			newValue = (String)(application.getAttribute("newValue"));
			int oldValueInInt = Integer.parseInt(oldValue) + 1;
			int newVlaueInInt = Integer.parseInt(newValue) + 1;
			oldValue = String.valueOf(oldValueInInt);
			newValue = String.valueOf(newVlaueInInt);
			application.setAttribute("oldValue", oldValue);
			application.setAttribute("newValue", newValue);
		}

		out.println("Old Value :" + application.getAttribute("oldValue"));
		out.println("New Value :" + application.getAttribute("newValue"));
	}
}
