package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.models.User;

public class RegisterAction extends ActionSupport implements ModelDriven {

	private User user;
	private String mainMessage;

	public RegisterAction() {
		user = new User();
	}

	@Override
	public String execute() throws Exception {

		return "success";
	}

	public String registerDo() {

		user.setMessage("Thanks for registration");
		System.out.println(user.getMessage());
		mainMessage = user.getMessage() + " | First Name : " + user.getFirstName() + " | Last Name : "
				+ user.getLastName() + " | Address" + user.getAddress() + " | Age : " + user.getAge();
		System.out.println(mainMessage);
		user.setMessage(mainMessage);
		return "success";
	}

	@Override
	public void validate() {
		if (user.getFirstName().equals("")) {
			addFieldError("firstName", "First Name is required");
		}
		if (user.getLastName().equals("")) {
			addFieldError("lastName", "Last Name is required");
		}
		if (user.getAddress().equals("")) {
			addFieldError("address", "Address is required");
		}
		if (user.getAge() == null) {
			addFieldError("age", "Age is required");
		}
	}

	@Override
	public Object getModel() {
		return user;
	}
}
