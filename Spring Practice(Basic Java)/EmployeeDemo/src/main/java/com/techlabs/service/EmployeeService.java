package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Employee;
import com.techlabs.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeService() {
		System.out.println("EmployeeService constructor");
	}

	public List<Employee> getEmployees() {
		return employeeRepository.get();
	}
}
