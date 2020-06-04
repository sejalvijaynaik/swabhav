package com.techlabs.contact.controllers;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.techlabs.contact.service.ContactJDBC;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactJDBC contactJDBC;
	@Resource(name = "jdbc/contact")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		contactJDBC = new ContactJDBC(dataSource);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		long number = Long.parseLong(request.getParameter("number"));
		String email = request.getParameter("email");

		contactJDBC.addContact(firstName, lastName, number, email);

		response.sendRedirect("ListController");
	}
}
