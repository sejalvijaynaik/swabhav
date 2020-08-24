package com.techlabs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.dao.EmployeeDao;
import com.techlabs.entities.Employee;
import com.techlabs.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	@Transactional
	public List<Employee> getEmployees() {

		return employeeDao.getEmployees();
	}

	@Override
	@Transactional
	public void addEmployee(Employee employee) {

		employeeDao.addEmployee(employee);
	}

	@Override
	@Transactional
	public Employee getEmployee(int employeeId) {

		return employeeDao.getEmployee(employeeId);
	}

	@Override
	@Transactional
	public void deleteEmplyee(int employeeId) {

		employeeDao.deleteEmployee(employeeId);
	}

	@Override
	@Transactional
	public List<Employee> searchEmployees(String searchName) {

		return employeeDao.searchEmployees(searchName);
	}
}
