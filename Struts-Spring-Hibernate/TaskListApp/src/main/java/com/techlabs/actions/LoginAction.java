package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;

public class LoginAction extends ActionSupport implements ModelDriven<UserLoginModel> {

	@Autowired
	private UserLoginModel userLoginModel;
	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {

		System.out.println("login execute running");
		return "input";
	}

	public String loginDo() {

		userLoginModel.setMessage("");
		System.out.println("logindo is running");
		System.out.println("value of is Admin :" + userLoginModel.isAdmin());
		System.out.println("value of is username :" + userLoginModel.getUsername());
		System.out.println("value of is password :" + userLoginModel.getPassword());

		// admin logged in chcekbox is true
		if (userLoginModel.isAdmin() == true) {
			if ((userLoginModel.getUsername().equals("admin")) && (userLoginModel.getPassword().equals("admin"))) {
				// go to users list
				userLoginModel.setNextAction("userList");
				return "success";
			} else {
				userLoginModel.setMessage("Username or password is incorrect");
				return "input";
			}
		}

		// user is not admin
		String userId = userService.getUserId(userLoginModel.getUsername(), userLoginModel.getPassword());
		System.out.println(userId);
		if (userId != null) {
			userLoginModel.setUserId(userId);
			// go to tasks list
			userLoginModel.setNextAction("taskList");
			return "success";
		}
		userLoginModel.setMessage("Username or password is incorrect");
		return "input";
	}

	@Override
	public void validate() {

		System.out.println("validate running");
		if (userLoginModel.getUsername() == null) {
			addFieldError("", "");
		} else {
			if (userLoginModel.getUsername().equals("")) {
				userLoginModel.setMessage("");
				addFieldError("username", "Username is required");
			}
			if (userLoginModel.getPassword().equals("")) {
				userLoginModel.setMessage("");
				addFieldError("password", "Password is required");
			}
		}
	}

	@Override
	public UserLoginModel getModel() {
		return userLoginModel;
	}
}
