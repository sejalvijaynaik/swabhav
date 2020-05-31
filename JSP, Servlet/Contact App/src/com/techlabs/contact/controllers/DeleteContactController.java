package com.techlabs.contact.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.contact.service.ContactService;

@WebServlet("/DeleteContactController")
public class DeleteContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getContentType();

		String id = request.getParameter("contactId");

		ContactService contactService = ContactService.getContactService();
		contactService.deleteContact(id);

		response.sendRedirect("ContactController");
	}

}
