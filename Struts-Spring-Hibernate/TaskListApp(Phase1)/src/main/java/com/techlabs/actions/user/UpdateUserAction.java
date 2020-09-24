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

		// check if admin is logged in
		if (userLoginModel.getUserType().equals("admin")) {
			userId = userUpdateModel.getUserId();
		} else {
			// admin is not logged in
			userId = userLoginModel.getUserId();
		}

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

		System.out.println("update user do running");
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

		if (userUpdateModel.getImageFile() == null) {
			userService.updateUserForAdmin(userId, userUpdateModel.getFirstName(), userUpdateModel.getLastName(),
					userUpdateModel.getEmail(), userUpdateModel.getUsername(), userUpdateModel.getPassword(),
					user.getUserType(), user.getTasks(), user.isLocked(), user.getImage());
		} else {
			userService.updateUserForAdmin(userId, userUpdateModel.getFirstName(), userUpdateModel.getLastName(),
					userUpdateModel.getEmail(), userUpdateModel.getUsername(), userUpdateModel.getPassword(),
					user.getUserType(), user.getTasks(), user.isLocked(), userUpdateModel.getImageFile());
		}

		return "success";
	}

	@Override
	public UserUpdateModel getModel() {
		return userUpdateModel;
	}

	@Override
	public void validate() {

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
