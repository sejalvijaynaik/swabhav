package com.techlabs.controllers;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.techlabs.model.user.User;
import com.techlabs.service.UserService;

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
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

		String name = request.getParameter("searchName");

		List<User> searchUsers = userService.searchUsers(name);

		if (searchUsers != null) {
			Cookie searchNameCookie = new Cookie("searchNameCookie", request.getParameter("searchName"));
			searchNameCookie.setMaxAge(60 * 60 * 24);
			response.addCookie(searchNameCookie);
		}

		request.setAttribute("users", searchUsers);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("list.jsp");
		requestDispatcher.forward(request, response);
	}

}
