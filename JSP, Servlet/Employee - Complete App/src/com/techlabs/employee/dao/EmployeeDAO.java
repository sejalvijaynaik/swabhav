package com.techlabs.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.techlabs.employee.model.Employee;

public class EmployeeDAO {

	public List<Employee> getEmployees() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		List<Employee> employees = new ArrayList<Employee>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithStatement(conn, stmt, res);
		}
		return employees;
	}

	public Employee getEmployee(int id) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		Employee employee = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			pstmt = conn.prepareStatement("select * from employees where id = ?");
			pstmt.setInt(1, id);
			res = pstmt.executeQuery();

			while (res.next()) {
				String name = res.getString("name");
				double salary = res.getLong("salary");
				String designation = res.getString("designation");

				employee = new Employee(id, name, salary, designation);
			}

			return employee;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
		return employee;
	}

	public void updateEmployee(int id, String name, double salary, String designation) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			pstmt = conn.prepareStatement("update employees set name = ?, salary = ?, designation = ? where id = ?");
			pstmt.setString(1, name);
			pstmt.setDouble(2, salary);
			pstmt.setString(3, designation);
			pstmt.setInt(4, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
	}

	public void deleteEmployee(int id) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			pstmt = conn.prepareStatement("delete from employees where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}

	}

	public void addEmployee(String name, double salary, String designation) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			pstmt = conn.prepareStatement("insert into employees(name, salary, designation) values(?, ?, ?)");
			pstmt.setString(1, name);
			pstmt.setDouble(2, salary);
			pstmt.setString(3, designation);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}

	}

	public List<Employee> searchEmployees(String name) {

		List<Employee> searchEmployees = new ArrayList<Employee>();
		for (Employee tempEmployee : getEmployees()) {
			if (tempEmployee.getName().contains(name)) {
				searchEmployees.add(tempEmployee);
			}
		}
		return searchEmployees;
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

	public void closeWithPreparedStatement(Connection conn, PreparedStatement pstmt, ResultSet res) {
		try {
			if (res != null) {
				res.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
