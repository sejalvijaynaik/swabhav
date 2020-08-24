package com.techlabs.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/contact?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";

		PrintWriter out = response.getWriter();
		out.println("Connecting to database url :" + url);

		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			out.println("SUCCESS");
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
