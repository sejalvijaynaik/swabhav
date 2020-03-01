package com.techlabs.employee.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.employee.emplyeeclass.Employee;
import com.techlabs.employee.loader.ILoadable;

public class EmployeeParser implements IParseable {

	ILoadable iLoadable;
	List<Employee> employees;
	List<String> lines;

	public EmployeeParser(ILoadable iLoadable) {
		this.iLoadable = iLoadable;
		employees = new ArrayList<Employee>();
		lines = iLoadable.loadEmployeeDetails();
	}

	public ILoadable getiLoadable() {
		return iLoadable;
	}

	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public void parsingDetails() {

		String[] splitString = null;

		for (Iterator<String> i = lines.iterator(); i.hasNext();) {

			splitString = i.next().split("\\,");
			int employeeId = Integer.parseInt(splitString[0]);
			String employeeName = splitString[1].substring(1, splitString[1].length() - 1);
			String employeeDesignation = splitString[2].substring(1, splitString[2].length() - 1);
			String managerId = splitString[3];
			String dateOfJoining = splitString[4].substring(1, splitString[4].length() - 1);
			double salary = Double.parseDouble(splitString[5]);
			String commission = splitString[6];
			int departmentNumber = Integer.parseInt(splitString[7]);
			Employee employee = new Employee(employeeId, employeeName, employeeDesignation, managerId, dateOfJoining,
					salary, commission, departmentNumber);

			if (employees.contains(employee)) {
				continue;
			}
			employees.add(employee);
		}
	}
}
