package com.techlabs.actions.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;

public class DisplayUserAction extends ActionSupport {

	@Autowired
	private UserService userService;
	private List<User> users;

	@Override
	public String execute() throws Exception {

		System.out.println("diplay user action running");
		users = userService.getUsers();
		System.out.println(users.size());
		return "success";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
