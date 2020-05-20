package com.techlabs.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.login.model.LoginModel;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		LoginModel loginModel = new LoginModel();
		loginModel.setUsername("admin");
		loginModel.setPassword("admin");
		
		String result;

		if ((request.getParameter("username").equals(loginModel.getUsername()))
				&& (request.getParameter("password").equals(loginModel.getPassword()))) {
			result = "Login successful";
			request.setAttribute("resultMessage", result);
			Cookie usernameCookie = new Cookie("usernameCookie", request.getParameter("username"));
			usernameCookie.setMaxAge(60*60*24);
			response.addCookie(usernameCookie);
		}
		else {
			result = "Login unsucessful";
			request.setAttribute("resultMessage", result);
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}
}
