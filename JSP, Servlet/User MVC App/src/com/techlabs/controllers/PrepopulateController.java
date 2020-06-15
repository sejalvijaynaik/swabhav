package com.techlabs.controllers;

import java.io.IOException;
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

@WebServlet("/PrepopulateController")
public class PrepopulateController extends HttpServlet {
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
		int id = Integer.parseInt(request.getParameter("userId"));

		User user = userService.getUser(id);

		request.setAttribute("user", user);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("update.jsp");
		requestDispatcher.forward(request, response);
	}

}
