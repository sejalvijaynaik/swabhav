package com.techlabs.controllers;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlabs.service.UserService;

@WebServlet("/deleteUser")
public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService;

	@Override
	public void init() throws ServletException {
		super.init();
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getContentType();

		ServletContext application = getServletConfig().getServletContext();
		int id = Integer.parseInt((String) application.getAttribute("userId"));
		userService.deleteUser(id);

		response.sendRedirect("logout");
	}

}