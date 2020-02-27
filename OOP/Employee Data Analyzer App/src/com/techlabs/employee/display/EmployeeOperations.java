package com.techlabs.employee.display;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.io.TempDir;

import com.techlabs.employee.emplyeeclass.Employee;
import com.techlabs.employee.loader.LoadFromFile;
import com.techlabs.employee.loader.LoadFromUrl;
import com.techlabs.employee.parser.ParserEmployeeDetails;

public class EmployeeOperations {

	public void loadAndParseEmployees() {

		// ParserEmployeeDetails parserEmployeeDetails = new ParserEmployeeDetails(new
		// LoadFromFile());
		ParserEmployeeDetails parserEmployeeDetails = new ParserEmployeeDetails(new LoadFromUrl());
		parserEmployeeDetails.parsingDetails();

		Set<Employee> employees = parserEmployeeDetails.getEmployees();
		//diplayAllEmployeeDetails(employees);
		//maxSalaryEmployee(employees);
		employeeCountByDesignation(employees);
		employeeCountByDepartment(employees);
	}

	public void diplayAllEmployeeDetails(Set<Employee> employees) {

		for (Iterator<Employee> i = employees.iterator(); i.hasNext();) {
			displayEmployeeDetails(i.next());
		}
	}

	public void displayEmployeeDetails(Employee employee) {

		System.out.println("-----Employee Details-----");
		System.out.println("Employee Id :" + employee.getEmployeeId());
		System.out.println("Employee Name :" + employee.getEmployeeName());
		System.out.println("Employee designation :" + employee.getEmployeeDesignation());
		System.out.println("Manager Id :" + employee.getManagerId());
		System.out.println("Date of Joining :" + employee.getDateOfJoining());
		System.out.println("Salary : " + employee.getSalary());
		System.out.println("Commission :" + employee.getCommission());
		System.out.println("Department Number :" + employee.getDepartmentNumber());
		System.out.println();
	}

	public void maxSalaryEmployee(Set<Employee> employees) {

		double maxSalary = 0.0;
		Employee employee = null;

		for (Iterator<Employee> i = employees.iterator(); i.hasNext();) {

			if (i.next().getSalary() > maxSalary) {
				maxSalary = i.next().getSalary();
				employee = i.next();
			}
		}
		System.out.println("-----Employee with highest salary-----");
		displayEmployeeDetails(employee);
	}

	public void employeeCountByDesignation(Set<Employee> employees) {

		Map<String, Integer> designationCount = new HashMap<>();

		for (Employee tempEmployee : employees) {
			if (designationCount.containsKey(tempEmployee.getEmployeeDesignation())) {
				designationCount.put(tempEmployee.getEmployeeDesignation(),
						designationCount.get(tempEmployee.getEmployeeDesignation())+1);
				
			}
			else {
				designationCount.put(tempEmployee.getEmployeeDesignation(), 1);
			}
		}
		
		System.out.println("-----Employees Count by Designation-----");
		
		for(Map.Entry<String, Integer> entry : designationCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();
	}
	
	public void employeeCountByDepartment(Set<Employee> employees) {
		
		Map<Integer, Integer> departmentCount = new HashMap<>();

		for (Employee tempEmployee : employees) {
			if (departmentCount.containsKey(tempEmployee.getDepartmentNumber())) {
				departmentCount.put(tempEmployee.getDepartmentNumber(),
						departmentCount.get(tempEmployee.getDepartmentNumber())+1);
				
			}
			else {
				departmentCount.put(tempEmployee.getDepartmentNumber(), 1);
			}
		}
		
		System.out.println("-----Employees Count by Department-----");

		for(Map.Entry<Integer, Integer> entry : departmentCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();
	}
}