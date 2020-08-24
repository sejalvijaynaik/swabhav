package com.techlabs.dao;

import java.util.List;
import com.techlabs.entities.Employee;

public interface EmployeeDao {

	public List<Employee> getEmployees();

	public void addEmployee(Employee employee);

	public Employee getEmployee(int employeeId);

	public void deleteEmployee(int employeeId);

	public List<Employee> searchEmployees(String searchName);

}
