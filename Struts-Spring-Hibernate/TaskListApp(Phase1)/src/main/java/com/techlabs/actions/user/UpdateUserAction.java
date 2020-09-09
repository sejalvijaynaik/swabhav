package com.techlabs.actions.user;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;
import com.techlabs.viewModel.UserUpdateModel;

public class UpdateUserAction extends ActionSupport implements ModelDriven<UserUpdateModel> {

	@Autowired
	private UserUpdateModel userUpdateModel;
	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginModel userLoginModel;
	private User user;
	private String userId;

	@Override
	public String execute() throws Exception {

		System.out.println("user update execute running");

		// check if admin is logged in
		if (userLoginModel.getUserType().equals("admin")) {
			System.out.println("it is admin");
			System.out.println("user id " + userId);
			userId = userUpdateModel.getUserId();
		} else {
			// admin is not logged in
			userId = userLoginModel.getUserId();
		}

		System.out.println(userId);
		user = userService.getUser(userId);

		// prepopulate the user details
		userUpdateModel.setUserId(userId);
		userUpdateModel.setFirstName(user.getFirstName());
		userUpdateModel.setLastName(user.getLastName());
		userUpdateModel.setEmail(user.getEmail());
		userUpdateModel.setUsername(user.getUsername());
		userUpdateModel.setPassword(user.getPassword());

		return "input";
	}

	public String updateUserDo() {

		System.out.println("user update updateUserDo running");

		// to check if admin is logged in
		if (userLoginModel.getUserType().equals("admin")) {
			userId = userUpdateModel.getUserId();
			userUpdateModel.setNextAction("userList");
		} else {
			// admin is not logged in
			userId = userLoginModel.getUserId();
			userUpdateModel.setNextAction("taskList");
		}

		user = userService.getUser(userId);

		userService.updateUserForAdmin(userId, userUpdateModel.getFirstName(), userUpdateModel.getLastName(),
				userUpdateModel.getEmail(), userUpdateModel.getUsername(), userUpdateModel.getPassword(),
				user.getUserType(), user.getTasks());

		return "success";
	}

	@Override
	public UserUpdateModel getModel() {
		return userUpdateModel;
	}

	@Override
	public void validate() {

		System.out.println("validate running");
		if (userUpdateModel.getFirstName() == null) {
			try {
				execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
			addFieldError("", "");
		} else {
			if (userUpdateModel.getFirstName().equals("")) {
				addFieldError("firstName", "First name is required");
			}
			if (userUpdateModel.getLastName().equals("")) {
				addFieldError("lastName", "Last name is required");
			}
			if (userUpdateModel.getEmail().equals("")) {
				addFieldError("email", "Email is required");
			}
			if (userUpdateModel.getUsername().equals("")) {
				addFieldError("username", "Username is required");
			}
			if (userUpdateModel.getPassword().equals("")) {
				addFieldError("password", "Password is required");
			}
		}
	}
}
