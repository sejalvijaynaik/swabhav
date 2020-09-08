package com.techlabs.actions.user;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.UserService;

public class DeleteUserAction extends ActionSupport {

	private String userId;
	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {

		userService.deleteUser(userId);

		return "success";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
