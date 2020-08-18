package com.techlab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.techlab.model.Employee;

public class EmployeeDao {
	private Connection connection;
	private PreparedStatement preparedStatement;

	public EmployeeDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Employee> getEmployees() {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		try {
			preparedStatement = connection.prepareStatement("Select * from employees");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				emps.add(new Employee(resultSet.getString("id"), resultSet.getString("name"), resultSet.getInt("age"),
						resultSet.getString("designation")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;

	}

	public void addEmployee(Employee emp) {
		try {
			preparedStatement = connection.prepareStatement("Insert into contacts values(?,?,?,?)");
			preparedStatement.setString(1, emp.getId());
			preparedStatement.setString(2, emp.getName());
			preparedStatement.setString(3, emp.getDesignation());
			preparedStatement.setInt(4, emp.getSalary());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
