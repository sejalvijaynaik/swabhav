package com.techlabs.composite.pattern.manager;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.composite.pattern.iemployee.IEmployee;

public class Manager implements IEmployee {
	
	private String name;
	private String designation;
	private double salary;
	private List<IEmployee> employees;

	public Manager(String name, String designation, double salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		employees = new ArrayList<IEmployee>();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDesignation() {
		return designation;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}

	public void removeEmployee(IEmployee employee) {
		employees.remove(employee);
	}

	public List<IEmployee> getEmployees() {
		return employees;
	}
}
