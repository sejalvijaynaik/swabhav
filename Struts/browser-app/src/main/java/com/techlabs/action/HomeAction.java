package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {

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
