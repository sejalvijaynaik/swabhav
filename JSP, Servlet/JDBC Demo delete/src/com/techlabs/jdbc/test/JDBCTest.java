package com.techlabs.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void msin(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_shop", "root", "root");
			
			System.out.println("successful connection");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
