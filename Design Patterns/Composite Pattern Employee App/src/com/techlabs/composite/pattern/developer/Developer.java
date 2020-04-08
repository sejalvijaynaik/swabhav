package com.techlabs.composite.pattern.developer;

import java.util.List;

import com.techlabs.composite.pattern.iemployee.IEmployee;

public class Developer implements IEmployee {
	private String name;
	private String designation;
	private double salary;

	public Developer(String name, String designation, double salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
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

	@Override
	public List<IEmployee> getEmployees() {
		return null;
	}
}
