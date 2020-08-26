package com.techlabs.contact.controllers;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.techlabs.contact.dao.ContactDAO;
import com.techlabs.contact.model.Contact;
import com.techlabs.contact.service.ContactService;

@WebServlet("/searchContact")
public class searchController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ContactService contactService;

	@Override
	public void init() throws ServletException {
		super.init();
		contactService = new ContactService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");

		List<Contact> searchContacts = contactService.searchContacts(name);

		if (searchContacts != null) {
			Cookie searchNameCookie = new Cookie("searchNameCookie", request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60 * 60 * 24);
			response.addCookie(searchNameCookie);
		}

		request.setAttribute("contacts", searchContacts);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact.jsp");
		requestDispatcher.forward(request, response);
	}

}

