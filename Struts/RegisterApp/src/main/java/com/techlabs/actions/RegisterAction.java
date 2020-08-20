package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.viewModels.Person;

public class RegisterAction extends ActionSupport {

	private String firstName;
	private String lastName;
	private String address;
	private Integer age;

	public String execute() {

		System.out.println("execute running");

		return "success";
	}

	public String registerDo() {
		System.out.println("registerDo running");

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

	@Override
	public void validate() {

		if ((firstName.equals(""))) {
			System.out.println("first name if null");
			addFieldError("firstName", "First Name is required");
		}
		if (lastName.equals("")) {
			addFieldError("lastName", "Last Name is required");
		}
		if (address.equals("")) {
			addFieldError("address", "Adsress is required");
		}
		if (age == null) {
			addFieldError("age", "Age is required");
		}
	}
}
