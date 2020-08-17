package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ResgisterAction extends ActionSupport {

	private String myName;

	@Override
	public String execute() throws Exception {

		return "success";
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}
