package com.techlabs.employee.display;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.employee.emplyeeclass.Employee;
import com.techlabs.employee.loader.ILoadable;
import com.techlabs.employee.loader.LoadFromFile;
import com.techlabs.employee.loader.LoadFromUrl;
import com.techlabs.employee.parser.IParseable;
import com.techlabs.employee.parser.EmployeeParser;

public class EmployeeAnalyzer {

	ILoadable iLoadable = new LoadFromFile();
	// ILoadable iLoadable = new LoadFromUrl();
	IParseable iParseable = new EmployeeParser(iLoadable);

	public void AnalyzeEmployees() {

		iParseable.parsingDetails();

		List<Employee> employees = iParseable.getEmployees();
		// diplayAllEmployeeDetails(employees);
		// maxSalaryEmployee(employees);
		employeeCountByDesignation(employees);
		// employeeCountByDepartment(employees);
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

		Map<Integer, Integer> departmentCount = new HashMap<Integer, Integer>();
		for (Employee tempEmployee : employees) {

			if (departmentCount.containsKey(tempEmployee.getDepartmentNumber())) {
				departmentCount.put(tempEmployee.getDepartmentNumber(),
						departmentCount.get(tempEmployee.getDepartmentNumber()) + 1);

			} else {
				departmentCount.put(tempEmployee.getDepartmentNumber(), 1);

			}
		}

		for (Map.Entry<Integer, Integer> entry : departmentCount.entrySet()) {

			int departmentNumber = entry.getKey();
			Map<String, Integer> designationCount = new HashMap<>();
			Map<String, Double> maxSalaryCount = new HashMap<String, Double>();
			System.out.println("Department Number :" + departmentNumber);

			for (Employee tempEmployee : employees) {

				if (departmentNumber == tempEmployee.getDepartmentNumber()) {

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
				}
			for (Map.Entry<String, Integer> designationEntry : designationCount.entrySet()) {
				System.out.println(designationEntry.getKey());
				System.out.print("Count : " + designationEntry.getValue() + " | ");
				System.out.println("Highest salary : " + maxSalaryCount.get(designationEntry.getKey()));
				System.out.println();
			}
		}
	}
}
