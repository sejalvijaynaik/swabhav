package com.techlabs.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			System.out.println("successful connection");

			stmt = conn.createStatement();

			int rows = stmt.executeUpdate(
					"insert into students(first_name, last_name, marks)\r\n" + "values(\"sejal\", \"naik\", 100);");

			res = stmt.executeQuery("select * from students");

			while (res.next()) {
				System.out.println(res.getString("first_name") + ", " + res.getString("last_name"));
			}

		} catch (SQLException e) {
			System.out.println("unsuccessful");
			e.printStackTrace();
		}

		finally {
			if (res != null) {
				res.close();
			}
		}
	}
}
