package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	private String myName;

	@Override
	public String execute() throws Exception {

		System.out.println("WelcomeAction execute running");
		System.out.println(myName);
		return "success";
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		System.out.println("SETTER CALLED");
		this.myName = myName;
	}

}
