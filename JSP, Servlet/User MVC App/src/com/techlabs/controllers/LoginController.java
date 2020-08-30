package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.techlabs.service.UserService;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService;

	@Override
	public void init() throws ServletException {
		super.init();
		userService = new UserService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();

		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));

		if ((request.getParameter("username") != null) && (request.getParameter("password") != null)) {
			if (userService.isValid(request.getParameter("username"), request.getParameter("password"))) {

				session.setAttribute("username", request.getParameter("username"));
				session.setAttribute("password", request.getParameter("password"));
				session.setMaxInactiveInterval(60 * 60 * 24);

				ServletContext application = getServletConfig().getServletContext();
				int id = userService.getUserId(request.getParameter("username"), request.getParameter("password"));
				String idInString = String.valueOf(id);
				application.setAttribute("userId", idInString);

				response.sendRedirect("welcome");
			} else {
				out.println("<h2 style = 'color:red'>Username or password entered is wrong</h2>");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
				requestDispatcher.include(request, response);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
		requestDispatcher.include(request, response);
	}
}
