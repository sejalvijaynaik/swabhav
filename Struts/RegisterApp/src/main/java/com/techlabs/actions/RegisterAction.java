package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.viewModels.Person;

public class RegisterAction extends ActionSupport {

	private Person person;
	private String message;

	public RegisterAction() {
		person = new Person();
	}

	public String registerShow() {

		message = "First Name : " + person.getFirstName() + " | Last Name : " + person.getLastName() + " | Address : "
				+ person.getAddress() + " | Age : " + person.getAge();

		return "input";
	}

	public String registerDo() {
		System.out.println("registerDo running");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAddress());
		System.out.println(person.getAge());

		registerShow();

		return "input";
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void validate() {

		if (person.getFirstName().equals("")) {
			addFieldError("person.firstName", "First Name is required");
		}
		if (person.getLastName().equals("")) {
			addFieldError("person.lastName", "Last Name is required");
		}
		if (person.getAddress().equals("")) {
			addFieldError("person.address", "Address is required");
		}
		if (person.getAge() == null) {
			addFieldError("person.age", "Age is required");
		}
	}
}
