package com.techlabs.contact.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.contact.service.ContactJDBC;

@WebServlet("/UpdateContactController")
public class UpdateContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		int id = Integer.parseInt(request.getParameter("ID"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		long number = Long.parseLong(request.getParameter("number"));
		String email = request.getParameter("email");
		
		ContactJDBC contactJDBC = new ContactJDBC();
		contactJDBC.updateContact(id, firstName, lastName, number, email);
		
		response.sendRedirect("ContactController");
	}

}
