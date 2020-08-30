package com.techlabs.employee.service;

import java.util.List;
import com.techlabs.employee.dao.EmployeeDAO;
import com.techlabs.employee.model.Employee;

public class EmployeeService {

	private EmployeeDAO employeeDAO;

	public EmployeeService() {
		employeeDAO = new EmployeeDAO();
	}

	public List<Employee> getEmployees() {
		return employeeDAO.getEmployees();
	}

	public Employee getEmployee(int id) {
		return employeeDAO.getEmployee(id);
	}

	public void updateEmployee(int id, String name, double salary, String designation) {
		employeeDAO.updateEmployee(id, name, salary, designation);
	}

	public void deleteEmployee(int id) {
		employeeDAO.deleteEmployee(id);
	}

	public void addEmployee(String name, double salary, String designation) {
		employeeDAO.addEmployee(name, salary, designation);
	}

	public List<Employee> searchEmployees(String name) {
		return employeeDAO.searchEmployees(name);
	}
}
