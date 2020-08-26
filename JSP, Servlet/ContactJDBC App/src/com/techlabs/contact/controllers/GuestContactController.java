package com.techlabs.contact.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlabs.contact.service.ContactService;

@WebServlet("/guestListContacts")
public class GuestContactController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ContactService contactService;

	@Override
	public void init() throws ServletException {
		super.init();
		contactService = new ContactService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		request.setAttribute("contacts", contactService.getContacts());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestContact.jsp");
		requestDispatcher.forward(request, response);
	}

}
