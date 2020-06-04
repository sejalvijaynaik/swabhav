package com.techlabs.servlet.jdbc.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/ServletJDBCTest")
public class ServletJDBCTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc/contact")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		
		try {
			conn = dataSource.getConnection();
			System.out.println("connection succesful");
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from contacts");
			
			while(res.next()) {
				System.out.print("\n" + res.getInt("id"));
				System.out.print(res.getString("first_name"));
				System.out.print(res.getString("last_name"));
				System.out.print(res.getLong("number"));
				System.out.print(res.getString("email"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
