package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Employee;

@Repository
public class EmployeeRepository {

	private static EmployeeRepository employeeService = null;
	private List<Employee> employees;

	private EmployeeRepository() {
		
		System.out.println("EmployeeRepository constructor");
		
		employees = new ArrayList<Employee>();

		addEmployee("abc", 20000, "manager");
		addEmployee("xyz", 30000, "president");
		addEmployee("mno", 10000, "developer");
		addEmployee("def", 30000, "manager");
		addEmployee("ghi", 10000, "developer");
	}

	public static EmployeeRepository getEmployeeService() {
		if (employeeService == null) {
			employeeService = new EmployeeRepository();

		}
		return employeeService;
	}

	public List<Employee> get() {
		return employees;
	}

	public Employee getEmployee(String id) {
		for (Employee tempEmployee : employees) {
			if (tempEmployee.getId().equals(id)) {
				return tempEmployee;
			}
		}
		return null;
	}

	public void addEmployee(String name, int salary, String designation) {
		Employee employee = new Employee();
		UUID uuid = UUID.randomUUID();

		employee.setId(uuid.toString());
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		employees.add(employee);
	}

	public void updateEmployee(String id, String name, int salary, String designation) {

		for (Employee tempEmployee : employees) {
			if (tempEmployee.getId().equals(id)) {
				tempEmployee.setName(name);
				tempEmployee.setSalary(salary);
				tempEmployee.setDesignation(designation);
				return;
			}
		}
	}

	public void deleteEmployee(String id) {
		for (Employee tempEmployee : employees) {
			if (tempEmployee.getId().equals(id)) {
				employees.remove(tempEmployee);
				return;
			}
		}
	}

	public List<Employee> searchEmployees(String name) {

		List<Employee> searchEmployees = new ArrayList<Employee>();
		for (Employee tempEmployee : employees) {
			if (tempEmployee.getName().contains(name)) {
				searchEmployees.add(tempEmployee);
			}
		}
		return searchEmployees;
	}
}
