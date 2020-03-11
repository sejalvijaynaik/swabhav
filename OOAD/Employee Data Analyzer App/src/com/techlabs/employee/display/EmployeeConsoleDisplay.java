package com.techlabs.employee.display;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlabs.employee.analyzer.EmployeeAnalyzer;
import com.techlabs.employee.emplyeeclass.Employee;
import com.techlabs.employee.loader.ILoadable;
import com.techlabs.employee.loader.LoadFromFile;
import com.techlabs.employee.parser.EmployeeParser;
import com.techlabs.employee.parser.IParseable;

public class EmployeeConsoleDisplay {

	ILoadable iLoadable;
	IParseable iParseable;
	EmployeeAnalyzer employeeAnalyzer;

	public EmployeeConsoleDisplay(ILoadable iLoadable, IParseable iParseable, EmployeeAnalyzer employeeAnalyzer) {
		this.iLoadable = iLoadable;
		this.iParseable = iParseable;
		this.employeeAnalyzer = employeeAnalyzer;
	}
	
	public EmployeeConsoleDisplay() {
	}
	
	public void start() {

		iLoadable = new LoadFromFile();
		// iLoadable = new LoadFromUrl();
		IParseable iParseable = new EmployeeParser(iLoadable);
		EmployeeAnalyzer employeeAnalyzer = new EmployeeAnalyzer(iParseable);
		EmployeeConsoleDisplay employeeConsoleDisplay = new EmployeeConsoleDisplay(iLoadable, iParseable,
				employeeAnalyzer);

		employeeConsoleDisplay.diplayAllEmployeeDetails(employeeAnalyzer.getAllEmployees());
		employeeConsoleDisplay.displayEmployeeCountByDepartment();
		employeeConsoleDisplay.diplayEmployeeCountByDesignation();
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

	public void displayEmployeeCountByDepartment() {

		Map<Integer, Integer> designationCount = employeeAnalyzer.employeeCountByDepartment();

		for (Map.Entry<Integer, Integer> entry : designationCount.entrySet()) {
			System.out.print("Department :" + entry.getKey() + " ");
			System.out.println("Count :" + entry.getValue());
		}
	}
	
	public void diplayEmployeeCountByDesignation() {
		
		Map<String, Integer> departmentCount = employeeAnalyzer.employeeCountByDesignation();

		for (Map.Entry<String, Integer> entry : departmentCount.entrySet()) {
			System.out.print("Designation :" + entry.getKey() + " ");
			System.out.println("Count :" + entry.getValue());
		}
	}
}
