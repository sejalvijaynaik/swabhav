package com.techlabs.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPreparedStatement {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			System.out.println("successful connection");

			stmt = conn.prepareStatement(
					"select * from students where first_name = ? and marks = ?");
			stmt.setString(1, "rachel");
			stmt.setInt(2, 0);

			res = stmt.executeQuery();

			while (res.next()) {
				System.out.println(
						res.getString("first_name") + ", " + res.getString("last_name") + ", " + res.getInt("marks"));
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
