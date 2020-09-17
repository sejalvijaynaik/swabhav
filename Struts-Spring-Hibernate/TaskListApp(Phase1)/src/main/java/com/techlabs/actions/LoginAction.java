package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;

public class LoginAction extends ActionSupport implements ModelDriven<UserLoginModel> {

	@Autowired
	private UserLoginModel userLoginModel;
	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {

		return "input";
	}

	public String loginDo() {

		userLoginModel.setMessage("");

		// admin logged in chcekbox is true
		if (userLoginModel.isAdmin() == true) {
			if ((userLoginModel.getUsername().equals("admin")) && (userLoginModel.getPassword().equals("admin"))) {
				// go to users list
				userLoginModel.setUserType("admin");
				userLoginModel.setNextAction("userList");
				return "success";
			} else {
				userLoginModel.setMessage("Username or password is incorrect");
				return "input";
			}
		}

		// user is not admin
		String userId = userService.getUserId(userLoginModel.getUsername(), userLoginModel.getPassword());
		if (userId != null) {
			User user = userService.getUser(userId);
			// if user is locked
			if (user.isLocked() == true) {
				userLoginModel.setMessage("Your account has been locked by admin");
				return "input";
			}
			// if user is not locked
			userLoginModel.setUserId(userId);
			userLoginModel.setUserType(user.getUserType());
			// go to tasks list
			userLoginModel.setNextAction("taskList");
			return "success";
		}
		userLoginModel.setMessage("Username or password is incorrect");
		return "input";
	}

	@Override
	public void validate() {

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
