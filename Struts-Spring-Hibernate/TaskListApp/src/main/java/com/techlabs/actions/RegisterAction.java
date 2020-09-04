package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserAddModel;

public class RegisterAction extends ActionSupport implements ModelDriven<UserAddModel> {

	@Autowired
	private UserService userService;

	@Autowired
	private UserAddModel userAddModel;

	@Override
	public String execute() throws Exception {

		System.out.println("register(execute) running");
		System.out.println("first name" + userAddModel.getFirstName());
		System.out.println("last name" + userAddModel.getLastName());
		System.out.println("email" + userAddModel.getEmail());
		System.out.println("username" + userAddModel.getUsername());
		System.out.println("password" + userAddModel.getPassword());

		return "input";
	}

	public String registerDo() {

		System.out.println("register(registerDo) running");
		System.out.println("first name" + userAddModel.getFirstName());
		System.out.println("last name" + userAddModel.getLastName());
		System.out.println("email" + userAddModel.getEmail());
		System.out.println("username" + userAddModel.getUsername());
		System.out.println("password" + userAddModel.getPassword());

		userService.addUser(userAddModel.getFirstName(), userAddModel.getLastName(), userAddModel.getEmail(),
				userAddModel.getUsername(), userAddModel.getPassword());

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
			}
			if (userAddModel.getPassword().equals("")) {
				addFieldError("password", "Password is required");
			}
		}
	}
}
