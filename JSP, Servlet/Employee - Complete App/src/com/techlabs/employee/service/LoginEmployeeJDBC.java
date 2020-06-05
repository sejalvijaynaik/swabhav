package com.techlabs.employee.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.techlabs.employee.model.LoginEmployee;

public class LoginEmployeeJDBC {

	private DataSource dataSource;

	public LoginEmployeeJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<LoginEmployee> getLoginEmployees() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		List<LoginEmployee> loginEmployees = new ArrayList<LoginEmployee>();

		try {
			conn = dataSource.getConnection();
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
