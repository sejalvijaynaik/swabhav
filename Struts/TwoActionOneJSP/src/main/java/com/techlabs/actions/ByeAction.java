package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ByeAction extends ActionSupport {

	private String message;

	@Override
	public String execute() throws Exception {

		message = "bye";
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
