package com.techlabs.contact.model;

public class Contact {
	private String firstName;
	private String lastName;
	private long number;
	private String email;
	private int id;
	
	public Contact(String firstName, String lastName, long number, String email, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.email = email;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
