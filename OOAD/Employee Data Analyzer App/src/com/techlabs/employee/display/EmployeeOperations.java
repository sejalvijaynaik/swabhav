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

		ParserEmployeeDetails parserEmployeeDetails = new ParserEmployeeDetails(new LoadFromFile());
		// ParserEmployeeDetails parserEmployeeDetails = new ParserEmployeeDetails(new
		// LoadFromUrl());
		parserEmployeeDetails.parsingDetails();

		List<Employee> employees = parserEmployeeDetails.getEmployees();
		// diplayAllEmployeeDetails(employees);
		// maxSalaryEmployee(employees);
		//employeeCountByDesignation(employees);
		 employeeCountByDepartment(employees);
	}

	public void diplayAllEmployeeDetails(List<Employee> employees) {

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

	public void maxSalaryEmployee(List<Employee> employees) {

		double maxSalary = 0.0;
		Employee employee = null;

		for (Employee tempEmployee : employees) {

			if (tempEmployee.getSalary() > maxSalary) {
				maxSalary = tempEmployee.getSalary();
				employee = tempEmployee;
			}
		}
		System.out.println("-----Employee with highest salary-----");
		displayEmployeeDetails(employee);
	}

	public void employeeCountByDesignation(List<Employee> employees) {

		Map<String, Integer> designationCount = new HashMap<>();
		Map<String, Double> maxSalaryCount = new HashMap<String, Double>();

		for (Employee tempEmployee : employees) {
			if (designationCount.containsKey(tempEmployee.getEmployeeDesignation())) {
				designationCount.put(tempEmployee.getEmployeeDesignation(),
						designationCount.get(tempEmployee.getEmployeeDesignation()) + 1);
				if (tempEmployee.getSalary() > maxSalaryCount.get(tempEmployee.getEmployeeDesignation())) {
					maxSalaryCount.put(tempEmployee.getEmployeeDesignation(), tempEmployee.getSalary());
				}

			} else {
				designationCount.put(tempEmployee.getEmployeeDesignation(), 1);
				maxSalaryCount.put(tempEmployee.getEmployeeDesignation(), tempEmployee.getSalary());
			}
		}

		System.out.println("-----Employees Count and highest salary by Designation-----");

		for (Map.Entry<String, Integer> entry : designationCount.entrySet()) {
			System.out.println(entry.getKey() + " Count : " + entry.getValue());
		}
		System.out.println();

		for (Map.Entry<String, Double> entry : maxSalaryCount.entrySet()) {
			System.out.println(entry.getKey() + " Highest salary : " + entry.getValue());
		}

		System.out.println();
	}

	public void employeeCountByDepartment(List<Employee> employees) {

		Map<Integer, Integer> departmentCount = new HashMap<>();
		Map<Integer, Double> maxSalaryCount = new HashMap<>();

		for (Employee tempEmployee : employees) {
			if (departmentCount.containsKey(tempEmployee.getDepartmentNumber())) {
				departmentCount.put(tempEmployee.getDepartmentNumber(),
						departmentCount.get(tempEmployee.getDepartmentNumber()) + 1);
				if (tempEmployee.getSalary() > maxSalaryCount.get(tempEmployee.getDepartmentNumber())) {
					maxSalaryCount.put(tempEmployee.getDepartmentNumber(), tempEmployee.getSalary());
				}
			} else {
				departmentCount.put(tempEmployee.getDepartmentNumber(), 1);
				maxSalaryCount.put(tempEmployee.getDepartmentNumber(), tempEmployee.getSalary());

			}
		}

		System.out.println("-----Employees Count by Department-----");

		for (Map.Entry<Integer, Integer> entry : departmentCount.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();

		for (Map.Entry<Integer, Double> entry : maxSalaryCount.entrySet()) {
			System.out.println(entry.getKey() + " Highest salary : " + entry.getValue());
		}
		System.out.println();
	}
}