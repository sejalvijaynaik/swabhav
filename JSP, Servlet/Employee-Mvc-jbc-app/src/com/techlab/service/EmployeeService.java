package com.techlab.service;

import java.util.List;

import com.techlab.dao.EmployeeDao;
import com.techlab.model.Employee;

public class EmployeeService {

	private EmployeeDao empdao;

	public EmployeeService() {
		empdao = new EmployeeDao();
	}

	public List<Employee> getEmployees() {
		return empdao.getEmployees();
	}

	public void addEmployee(Employee emp) {
		empdao.addEmployee(emp);
	}
}
