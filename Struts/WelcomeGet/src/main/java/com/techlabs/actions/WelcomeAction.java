package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {

	private String myName;

	@Override
	public String execute() throws Exception {

		myName = "sejal";
		return "success";
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}
