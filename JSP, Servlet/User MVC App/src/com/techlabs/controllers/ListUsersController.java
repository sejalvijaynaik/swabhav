package com.techlabs.controllers;

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
import com.techlabs.model.user.User;
import com.techlabs.service.UserService;

@WebServlet("/ListUsersController")
public class ListUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	@Resource(name = "jdbc/user")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();
		userService = new UserService(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		List<User> users = userService.getUsers();
		request.setAttribute("users", users);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
		requestDispatcher.forward(request, response);
	}

}
