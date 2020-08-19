package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.UserService;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	private String message;

	@Override
	public String execute() throws Exception {

		System.out.println("Execute executing");
		
		if((username == null)&&(password == null)){
			return "input";
		}

		UserService userService = new UserService();
		if (userService.isValidUser(username, password)) {
			message = "hello";
			return "success";
		}

		message = "Username or passwrod incorrect";
		return "input";
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
