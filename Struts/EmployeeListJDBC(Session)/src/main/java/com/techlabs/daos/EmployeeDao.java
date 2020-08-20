package com.techlabs.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.viewModels.Employee;

public class EmployeeDao {

	private String URL;
	Connection conn = null;

	public EmployeeDao() throws ClassNotFoundException, SQLException {
		URL = "jdbc:mysql://localhost:3306/struts_employee?useSSL=false";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(URL, "root", "root");
	}

	public List<Employee> getEmployees() {

		Statement stmt = null;
		ResultSet res = null;
		List<Employee> employees = new ArrayList<Employee>();

		try {
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
