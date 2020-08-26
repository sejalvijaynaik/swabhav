package com.techlabs.contact.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.contact.model.Contact;
import com.techlabs.contact.service.ContactService;

@WebServlet("/searchContact")
public class searchContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");

		ContactService contactService = ContactService.getContactService();
		List<Contact> searContacts = contactService.searchContacts(name);

		if (searContacts != null) {
			Cookie searchNameCookie = new Cookie("searchNameCookie", request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60 * 60 * 24);
			response.addCookie(searchNameCookie);
		}

		request.setAttribute("contacts", searContacts);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact.jsp");
		requestDispatcher.forward(request, response);
	}

}
