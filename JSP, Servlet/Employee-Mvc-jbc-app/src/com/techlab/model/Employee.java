package com.techlab.model;

public class Employee {
	private String id = "";
	private String name = "";
	private int salary;
	private String designation;

	public Employee(String id, String name, int salary, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + designation + "]";
	}
}
