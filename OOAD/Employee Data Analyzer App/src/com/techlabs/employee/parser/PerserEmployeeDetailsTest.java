package com.techlabs.employee.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.techlabs.employee.emplyeeclass.Employee;
import com.techlabs.employee.loader.LoadFromFile;

class PerserEmployeeDetailsTest {

	@Test
	void test() {

		EmployeeParser parserEmployeeDetails = new EmployeeParser(new LoadFromFile());
		parserEmployeeDetails.parsingDetails();

		List<Employee> employees = parserEmployeeDetails.getEmployees();

		for (Employee tempEmployee : employees) {
			System.out.print(tempEmployee.getEmployeeId() + " ");
			System.out.print(tempEmployee.getEmployeeName() + " ");
			System.out.print(tempEmployee.getEmployeeDesignation() + " ");
			System.out.print(tempEmployee.getManagerId() + " ");
			System.out.print(tempEmployee.getDateOfJoining() + " ");
			System.out.print(tempEmployee.getSalary() + " ");
			System.out.print(tempEmployee.getCommission() + " ");
			System.out.print(tempEmployee.getDepartmentNumber() + " ");
			System.out.println();
		}
	}
}
