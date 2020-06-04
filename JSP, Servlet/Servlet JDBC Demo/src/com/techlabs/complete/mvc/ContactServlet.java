package com.techlabs.complete.mvc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DbUtil dbUtil;
	@Resource(name = "jdbc/contact")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dbUtil = new DbUtil(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		List<Contact> contacts = dbUtil.getContacts();
		if(contacts != null) {
			System.out.println("yaehhhhhhhhhhhhhhhhhhhhhhh");
		}
	}
}
