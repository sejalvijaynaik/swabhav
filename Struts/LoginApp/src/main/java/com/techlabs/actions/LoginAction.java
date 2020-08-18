package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.UsernamePassword;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	private boolean message;

	@Override
	public String execute() throws Exception {

		System.out.println("Execute executing");
		return "success";
	}

	public String loginDo() throws Exception {

		System.out.println("Login do executing");

		UsernamePassword usernamePassword = new UsernamePassword();

		if ((password.equals(usernamePassword.getPassword())) && (username.equals(usernamePassword.getUsername()))) {
			message = true;
		} else {
			message = false;
		}
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getMessage() {
		return message;
	}

	public void setMessage(boolean message) {
		this.message = message;
	}

}
