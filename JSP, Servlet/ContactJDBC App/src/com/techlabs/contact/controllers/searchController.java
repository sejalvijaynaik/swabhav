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

import com.techlabs.contact.model.Contact;
import com.techlabs.contact.service.ContactJDBC;

@WebServlet("/searchController")
public class searchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactJDBC contactJDBC;
	@Resource(name = "jdbc/contact")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		contactJDBC = new ContactJDBC(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");

		List<Contact> searchContacts = contactJDBC.searchContacts(name);

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
