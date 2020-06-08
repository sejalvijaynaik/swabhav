package com.techlabs.sql.injection.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/SQLInjectionTest")
public class SQLInjectionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/sql_injection_test")
	private DataSource dataSource;
	private Connection conn;
	private Statement stmt;
	private ResultSet res;

	@Override
	public void init() throws ServletException {
		super.init();
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			stmt = conn.createStatement();
			res = stmt.executeQuery(
					"select * from login_data where username = '" + username + "' and password = '" + password + "'");
			while (res.next()) {
				request.setAttribute("username", res.getString("username"));
				request.setAttribute("password", res.getString("password"));
				System.out.println(request.getAttribute("username"));
				System.out.println(request.getAttribute("password"));
			}

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");
			requestDispatcher.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
