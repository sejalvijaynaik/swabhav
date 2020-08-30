package com.techlabs.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.techlabs.employee.model.LoginEmployee;

public class LoginEmployeeDAO {

	public List<LoginEmployee> getLoginEmployees() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		List<LoginEmployee> loginEmployees = new ArrayList<LoginEmployee>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from loginEmployees");

			while (res.next()) {
				int id = res.getInt("id");
				String username = res.getString("username");
				String password = res.getString("password");
				int empid = res.getInt("empid");

				LoginEmployee loginEmployee = new LoginEmployee(id, username, password, empid);
				loginEmployees.add(loginEmployee);
			}

			return loginEmployees;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithStatement(conn, stmt, res);
		}
		return loginEmployees;
	}

	public void closeWithStatement(Connection conn, Statement stmt, ResultSet res) {
		try {
			if (res != null) {
				res.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
