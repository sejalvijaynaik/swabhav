package com.techlabs.controllers;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.techlabs.service.UserService;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	@Resource(name = "jdbc/user")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		userService = new UserService(dataSource);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		userService.addUser(username, password);

		response.sendRedirect("ListUsersController");
	}

}