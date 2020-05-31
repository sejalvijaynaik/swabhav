package com.techlabs.contact.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.contact.service.ContactService;

@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		ContactService contactService = ContactService.getContactService();
		request.setAttribute("contacts", contactService.getContacts());
		System.out.println("contacts in contact controler " + contactService.getContacts().get(0).getFirstName());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact.jsp");
		requestDispatcher.forward(request, response);
	}

}
