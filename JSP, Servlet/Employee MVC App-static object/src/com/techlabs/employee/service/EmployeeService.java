package com.techlabs.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.employee.model.Employee;

public class EmployeeService {

	private static List<Employee> employees;

	public static void setEmployees() {
		employees = new ArrayList<Employee>();

		addEmployee("1", "abc", 20000, "manager");
		addEmployee("2", "xyz", 30000, "president");
		addEmployee("3", "mno", 10000, "developer");
		addEmployee("4", "def", 30000, "manager");
		addEmployee("5", "ghi", 10000, "developer");
	}
	
	public static List<Employee> getEmployees() {
		return employees;
	}

	public static Employee getEmployee(String id) {
		for (Employee tempEmployee : employees) {
			if (tempEmployee.getId().equals(id)) {
				return tempEmployee;
			}
		}
		return null;
	}

	public static void addEmployee(String id, String name, int salary, String designation) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		employees.add(employee);
	}

	public static void updateEmployee(String id, String name, int salary, String designation) {

		for (Employee tempEmployee : employees) {
			if (tempEmployee.getId().equals(id)) {
				tempEmployee.setName(name);
				tempEmployee.setSalary(salary);
				tempEmployee.setDesignation(designation);
				return;
			}
		}
	}
	
	public static void deleteEmployee(String id) {
		for (Employee tempEmployee : employees) {
			if (tempEmployee.getId().equals(id)) {
				employees.remove(tempEmployee);
				return;
			}
		}
	}
	
	public List<Employee> searchEmployees(String name){
		
		List<Employee> searchEmployees = new ArrayList<Employee>();
		for (Employee tempEmployee : employees) {
			if (tempEmployee.getName().contains(name)) {
				searchEmployees.add(tempEmployee);
			}
		}
		return searchEmployees;
	}
}
