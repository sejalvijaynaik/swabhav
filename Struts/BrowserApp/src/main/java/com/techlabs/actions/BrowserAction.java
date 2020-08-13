package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class BrowserAction extends ActionSupport {

	private String message;

	public String execute() {

		message = "GOOD MORNING!!!";
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
