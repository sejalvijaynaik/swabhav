package com.techlabs.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techlabs.model.Employee;

public class EmployeeJDBCService {

	private DataSource dataSource;

	public EmployeeJDBCService(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Employee> getEmployees() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		List<Employee> employees = new ArrayList<Employee>();

		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from employees");

			while (res.next()) {
				int id = res.getInt("id");
				String name = res.getString("name");
				double salary = res.getLong("salary");
				String designation = res.getString("designation");

				Employee employee = new Employee(id, name, salary, designation);
				employees.add(employee);
			}

			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithStatement(conn, stmt, res);
		}
		return employees;
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
