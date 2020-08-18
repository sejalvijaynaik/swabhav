package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class WishAction extends ActionSupport {

	private String name;
	private String message;

	@Override
	public String execute() throws Exception {

		return "success";
	}

	public String wishDo() {

		if (name == null) {
			name = "!";
		}

		message = "Struts welcomes you, " + name;
		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
