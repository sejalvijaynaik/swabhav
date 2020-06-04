package com.techlabs.contact.controllers;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.techlabs.contact.model.Contact;
import com.techlabs.contact.service.ContactJDBC;

@WebServlet("/ListController")
public class ListController extends HttpServlet {
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
	
		response.setContentType("text/html");
		
		List<Contact> contacts = contactJDBC.getContacts();
		request.setAttribute("contacts", contacts);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact.jsp");
		requestDispatcher.forward(request, response);
	}
}
