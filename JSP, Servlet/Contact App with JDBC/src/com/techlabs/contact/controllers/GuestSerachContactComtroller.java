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
import com.techlabs.contact.service.ContactJDBC;

@WebServlet("/GuestSerachContactComtroller")
public class GuestSerachContactComtroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("searchName");

		ContactJDBC contactJDBC = new ContactJDBC();
		List<Contact> searchContacts = contactJDBC.searchContacts(name);

		if (searchContacts != null) {
			String cookieName = request.getParameter("searchName") + "Cookie";
			Cookie searchNameCookie = new Cookie(cookieName, request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60 * 60 * 24);
			response.addCookie(searchNameCookie);
		}

		request.setAttribute("searchContacts", searchContacts);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("guestSearch.jsp");
		requestDispatcher.forward(request, response);
	}
}
