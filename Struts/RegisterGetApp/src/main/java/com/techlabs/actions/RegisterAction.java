package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private String firstName;
	private String lastName;
	private String address;
	private Integer age;
	private String message;

	@Override
	public String execute() throws Exception {

		System.out.println("execute running");
		
		message = "Thanks for registeration, your details are as follows | First Name : " + firstName
				+ " | Last Name : " + lastName + " | Address : " + address + " | Age : " + age;

		return "success";
	}

	@Override
	public void validate() {

		if (firstName.equals("")) {
			addFieldError("firstName", "First Name is required");
		}
		if (lastName.equals("")) {
			addFieldError("lastName", "Last Name is required");
		}
		if (address.equals("")) {
			addFieldError("address", "address is required");
		}
		if (age == null) {
			addFieldError("age", "Age is required");
		}
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
