package com.techlabs.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.techlabs.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public void addEmployee(Employee employee);

	public Employee getEmployee(int employeeId);

	public void deleteEmplyee(int employeeId);

	public List<Employee> searchEmployees(String searchName);

}
