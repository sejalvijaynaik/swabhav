package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.UserService;
import com.techlabs.viewModels.User;

public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private User user;

	public LoginAction() {

		user = new User();
	}

	@Override
	public String execute() throws Exception {

		UserService userService = new UserService();
		if (userService.isValidUser(user.getUsername(), user.getPassword())) {
			return "success";
		}

		user.setMessage("Username or passwrod incorrect");
		return "input";
	}

	public void validate() {

		System.out.println("validate running");
		if (user.getUsername() == null) {
			addFieldError("", "");
		} else {
			if (user.getUsername().equals("")) {
				addFieldError("firstName", "First name is required");
			}
			if (user.getPassword().equals("")) {
				addFieldError("lastName", "Last name is required");
			}
		}
	}

	@Override
	public User getModel() {

		return user;
	}
}
