package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private String message = "hello";

	@Override
	public String execute() throws Exception {

		message = "hello";
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
