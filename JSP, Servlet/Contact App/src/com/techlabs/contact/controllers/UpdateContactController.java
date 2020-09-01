package com.techlabs.contact.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlabs.contact.model.Contact;
import com.techlabs.contact.service.ContactService;

@WebServlet("/updateContact")
public class UpdateContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Contact contact = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		long number;

		// --------To type check for number-----------------------
		request.setAttribute("firstName", request.getParameter("firstName"));
		request.setAttribute("lastName", request.getParameter("lastName"));
		request.setAttribute("number", request.getParameter("number"));
		request.setAttribute("email", request.getParameter("email"));

		for (char c : request.getParameter("number").toCharArray()) {
			if (!Character.isDigit(c)) {
				out.println("<h2 style = 'color:red'>Enter number in phone number</h2>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
				requestDispatcher.include(request, response);
				return;
			}
		}

		// --------------------------------------------------------------

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		number = Long.parseLong(request.getParameter("number"));
		String email = request.getParameter("email");

		ContactService contactService = ContactService.getContactService();
		contactService.updateContact(contact.getId(), firstName, lastName, number, email);

		response.sendRedirect("listContacts");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String id = request.getParameter("contactId");

		ContactService contactService = ContactService.getContactService();
		contact = contactService.getContact(id);

		request.setAttribute("contact", contact);

		// -------------To pre-populate form -------------------------------
		request.setAttribute("firstName", contact.getFirstName());
		request.setAttribute("lastName", contact.getLastName());
		request.setAttribute("number", contact.getNumber());
		request.setAttribute("email", contact.getEmail());
		// --------------------------------------------------------------

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
	}

}
