package com.techlabs.department.csv.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartamentCSVLoad {
	public static void main(String[] args) throws IOException, SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet res = null;

		File file = new File("files/dept.csv");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String line;
		br.readLine();

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root", "root");
			stmt = conn.prepareStatement(
					"insert into dept (deptid, deptname, empid, empname, salary) values(?, ?, ?, ?, ?)");

			while ((line = br.readLine()) != null) {

				if (line.isEmpty()) {
					continue;
				}
				String[] split = line.split(",");
				stmt.setInt(1, Integer.parseInt(split[0]));
				stmt.setString(2, split[1]);
				stmt.setInt(3, Integer.parseInt(split[2]));
				if(split[3].equals("null")) {
					split[3] = "unspecified";
				}
				stmt.setString(4, split[3]);
				stmt.setDouble(5, Double.parseDouble(split[4]));
				
				stmt.executeUpdate();

			}
			br.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (res != null) {
				res.close();
			}
		}
	}
}
