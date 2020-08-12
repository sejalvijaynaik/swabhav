package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class AgeAction implements Action {
	String age;

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
