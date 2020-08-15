package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class AgeAction implements Action {
	String age;

	public AgeAction() {

		System.out.println("age action constructor is running");
	}

	@Override
	public String execute() throws Exception {

		System.out.println("age action execute running");
		return SUCCESS;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
