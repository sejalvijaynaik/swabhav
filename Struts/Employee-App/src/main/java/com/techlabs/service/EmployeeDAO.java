package com.techlabs.service;

import java.util.List;
import com.techlabs.model.Employee;

public interface EmployeeDAO {
	public List<Employee> getEmployees();
	public Employee getEmployee(int id);
	public void updateEmployee(int id, String name, double salary, String designation);
	public void deleteEmployee(int id);
	public void addEmployee(String name, double salary, String designation);
	public List<Employee> searchEmployees(String name);
}
