package com.techlabs.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.techlabs.model.User;
import com.techlabs.service.UserService;

@WebServlet("/updateUser")
public class UpdateController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	User user = null;
	private UserService userService;

	@Override
	public void init() throws ServletException {
		super.init();
		userService = new UserService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("update post running");
		
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		userService.updateUser(user.getId(), username, password);

		response.sendRedirect("welcome");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		ServletContext application = getServletConfig().getServletContext();
		int id = Integer.parseInt((String) application.getAttribute("userId"));
		user = userService.getUser(id);

		request.setAttribute("username", user.getUsername());
		request.setAttribute("password", user.getPassword());

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
	}
}