package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class TestAction implements Action {
	public String message;
	public String firstName;

	public String execute() {
		System.out.println("testaction execute is running");
		message = "success message!!!";
		System.out.println("Name is : " + firstName);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
