package com.techlabs.actions.user;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserAddModel;
import com.techlabs.viewModel.UserLoginModel;

public class RegisterAction extends ActionSupport implements ModelDriven<UserAddModel> {

	@Autowired
	private UserService userService;
	@Autowired
	private UserAddModel userAddModel;
	@Autowired
	private UserLoginModel userLoginModel;

	@Override
	public String execute() throws Exception {

		System.out.println("register(execute) running");

		return "input";
	}

	public String registerDo() {

		System.out.println("register(registerDo) running");
		System.out.println("is admin??" + userLoginModel.isAdmin());
		System.out.println("first name" + userAddModel.getFirstName());
		System.out.println("last name" + userAddModel.getLastName());
		System.out.println("email" + userAddModel.getEmail());
		System.out.println("username" + userAddModel.getUsername());
		System.out.println("password" + userAddModel.getPassword());

		userService.addUser(userAddModel.getFirstName(), userAddModel.getLastName(), userAddModel.getEmail(),
				userAddModel.getUsername(), userAddModel.getPassword(), "normal");

		// admin is logged in
		if (userLoginModel.getUserType() == null) {
			userAddModel.setNextAction("home");
		} else {
			if (userLoginModel.getUserType().equals("admin")) {
				// go to users list
				userAddModel.setNextAction("userList");
			} else {
				// user is not admin go to tasks list
				userAddModel.setNextAction("home");
			}
		}

		// reset usserAddModel
		userAddModel.setFirstName(null);
		userAddModel.setLastName(null);
		userAddModel.setEmail(null);
		userAddModel.setUsername(null);
		userAddModel.setPassword(null);
		userAddModel.setConfirmPassword(null);
		return "success";
	}

	public String getEmails() {

		return "success";
	}

	@Override
	public UserAddModel getModel() {
		return userAddModel;
	}

	@Override
	public void validate() {

		System.out.println("validate running");
		if (userAddModel.getFirstName() == null) {
			addFieldError("", "");
		} else {
			if (userAddModel.getFirstName().equals("")) {
				addFieldError("firstName", "First name is required");
			}
			if (userAddModel.getLastName().equals("")) {
				addFieldError("lastName", "Last name is required");
			}
			if (userAddModel.getEmail().equals("")) {
				addFieldError("email", "Email is required");
			}
			if (userAddModel.getUsername().equals("")) {
				addFieldError("username", "Username is required");
			} else if (userAddModel.getUsername().equals("admin")) {
				addFieldError("username", "Username cant be admin");
			} else if (!userService.isUsernameUnique(userAddModel.getUsername())) {
				addFieldError("username", "Username is already taken");
			}
			if (userAddModel.getPassword().equals("")) {
				addFieldError("password", "Password is required");
			}
			if (userAddModel.getConfirmPassword().equals("")) {
				addFieldError("confirmPassword", "Confirm Password is required");
			} else if (!userAddModel.getPassword().equals(userAddModel.getConfirmPassword())) {
				System.out.println("password dont match");
				addFieldError("confirmPassword", "Passwords do not match");
			}
		}
	}
}
