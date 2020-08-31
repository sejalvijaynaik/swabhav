package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;

public class LoginStudentAction extends ActionSupport implements ModelDriven<UserLoginModel>, SessionAware {

	private UserLoginModel userLoginModel;
	private SessionMap<String, Object> sessionMap;

	public LoginStudentAction() {
		userLoginModel = new UserLoginModel();
	}

	@Override
	public String execute() throws Exception {

		System.out.println("execute running");
		return "input";
	}

	public String loginDo() {

		System.out.println("logindo is running");
		UserService userService = new UserService();
		if (userService.isValidUser(userLoginModel.getUsername(), userLoginModel.getPassword())) {
			sessionMap.put("username", "username");
			sessionMap.put("password", "password");
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
				addFieldError("username", "Username is required");
			}
			if (userLoginModel.getPassword().equals("")) {
				addFieldError("password", "Password is required");
			}
		}
	}

	@Override
	public UserLoginModel getModel() {
		return userLoginModel;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}
}
