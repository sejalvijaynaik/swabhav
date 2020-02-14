package com.techlabs.customer;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private static int nextId = 1000;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		nextId++;
		id = nextId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
