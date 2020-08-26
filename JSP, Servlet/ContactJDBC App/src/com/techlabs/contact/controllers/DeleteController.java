package com.techlabs.contact.controllers;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.techlabs.contact.dao.ContactDAO;
import com.techlabs.contact.service.ContactService;

@WebServlet("/deleteContact")
public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ContactService contactService;

	@Override
	public void init() throws ServletException {
		super.init();
		contactService = new ContactService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getContentType();

		String idInstring = request.getParameter("contactId");
		int id = Integer.parseInt(idInstring);

		contactService.deleteContact(id);

		response.sendRedirect("listContacts");
	}

}
