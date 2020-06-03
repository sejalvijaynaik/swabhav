package com.techlabs.contact.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.contact.model.Contact;
import com.techlabs.contact.service.ContactJDBC;

@WebServlet("/PrepopulateContactController")
public class PrepopulateContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("contactId"));
		
		ContactJDBC contactJDBC = new ContactJDBC();
		Contact contact = contactJDBC.getContact(id);
		
		request.setAttribute("contact", contact);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
	}

}
