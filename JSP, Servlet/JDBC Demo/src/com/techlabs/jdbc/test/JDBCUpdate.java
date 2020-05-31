package com.techlabs.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			System.out.println("successful connection");

			stmt = conn.createStatement();

			System.out.println("Before update");
			res = stmt.executeQuery("select * from students where first_name = 'rachel' and last_name = 'green'");
			while (res.next()) {
				System.out.println(res.getString("first_name") + ", " + res.getString("last_name") + ", " + res.getInt("marks"));
			}

			int rows = stmt.executeUpdate(
					"update students set marks = 0 where first_name = \"rachel\" and last_name = \"green\";");

			System.out.println("After update");
			res = stmt.executeQuery("select * from students where first_name = 'rachel' and last_name = 'green'");

			while (res.next()) {
				System.out.println(res.getString("first_name") + ", " + res.getString("last_name") + ", " + res.getInt("marks"));
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
