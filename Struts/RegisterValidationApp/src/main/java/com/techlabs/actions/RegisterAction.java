package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	String address;
	String selectedColor;
	Boolean subscription;

	@Override
	public String execute() {
		System.out.println("execute method running");
		return "success";
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public Boolean getSubscription() {
		return subscription;
	}

	public void setSubscription(Boolean subscription) {
		this.subscription = subscription;
	}

	/*@Override
	public void validate() {

		if (firstName.equals("")) {
			addFieldError("firstName", "First Name is required");
		}
		if (lastName.equals("")) {
			addFieldError("lastName", "Last Name is required");
		}
		if (gender == null) {
			addFieldError("gender", "Gender is required");
		}
		if (age == null) {
			addFieldError("age", "Age is required");
		} else if (age < 18) {
			addFieldError("age", "Age should be above 18");
		}
		if (email.equals("")) {
			addFieldError("email", "Email is required");
		}
	}*/

}
