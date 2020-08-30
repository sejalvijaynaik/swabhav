package com.techlabs.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.UserService;

@WebServlet("/addUser")
public class AddController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService;

	@Override
	public void init() throws ServletException {
		super.init();
		userService = new UserService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		userService.addUser(username, password);

		session.setAttribute("username", request.getParameter("username"));
		session.setAttribute("password", request.getParameter("password"));
		session.setMaxInactiveInterval(60 * 60 * 24);

		ServletContext application = getServletConfig().getServletContext();
		int id = userService.getUserId(username, password);
		String idInString = String.valueOf(id);
		application.setAttribute("userId", idInString);

		response.sendRedirect("welcome");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("add.jsp");
		requestDispatcher.forward(request, response);
	}
}