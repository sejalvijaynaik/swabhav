package com.techlabs.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		String oldValue = "0";
		String newValue ="1";

		if((session.getAttribute("oldValue") == null)&&(session.getAttribute("newValue") == null)){
			session.setAttribute("oldValue", oldValue);
			session.setAttribute("newValue", newValue);
		}

		else{
			oldValue = (String)(session.getAttribute("oldValue"));
			newValue = (String)(session.getAttribute("newValue"));
			int oldValueInInt = Integer.parseInt(oldValue) + 1;
			int newVlaueInInt = Integer.parseInt(newValue) + 1;
			oldValue = String.valueOf(oldValueInInt);
			newValue = String.valueOf(newVlaueInInt);
			session.setAttribute("oldValue", oldValue);
			session.setAttribute("newValue", newValue);
		}

		out.println("Old Value :" + session.getAttribute("oldValue"));
		out.println("New Value :" + session.getAttribute("newValue"));
		out.print(" Session Id : " + session.getId());
	}
}
