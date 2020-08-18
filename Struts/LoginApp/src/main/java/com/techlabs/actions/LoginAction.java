package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.UsernamePassword;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	private String message;

	@Override
	public String execute() throws Exception {

		System.out.println("Execute executing");

		UsernamePassword usernamePassword = new UsernamePassword();
		
		System.out.println(usernamePassword.getUsername());
		System.out.println(usernamePassword.getPassword());
		System.out.println(username);
		System.out.println(password);

		if (!username.equals(usernamePassword.getUsername())) {
			System.out.println("Username is incorrect");
			message = "Username is incorrect";
			return "input";
		}

		if (!password.equals(usernamePassword.getPassword())) {
			System.out.println("Password is incorrect");
			message = "Password is incorrect";
			return "input";
		}

		message = "hello";
		return "success";
	}

	public String loginDo() throws Exception {

		System.out.println("Login do executing");

		if (username.equals("")) {
			System.out.println("Username is empty");
			message = "Username is required";
			return "input";
		}
		if (password.equals("")) {
			System.out.println("Password is empty");
			message = "Password is required";
			return "input";
		}

		execute();

		return "input";
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
