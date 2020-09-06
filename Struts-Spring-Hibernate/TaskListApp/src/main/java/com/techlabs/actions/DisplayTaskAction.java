package com.techlabs.actions;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.TaskService;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;

public class DisplayTaskAction extends ActionSupport {

	private String userId;
	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginModel userLoginModel;
	private Set<Task> tasks;

	@Override
	public String execute() throws Exception {

		System.out.println("task display");
		User user = null;

		if (userId != null) {
			System.out.println("userId is there");
			userLoginModel.setUserId(userId);
			user = userService.getUser(userLoginModel.getUserId());
			System.out.println(user);
		} else {
			System.out.println("userId is not there");
			user = userService.getUser(userLoginModel.getUserId());
			System.out.println(user);
		}

		tasks = user.getTasks();

		return "success";
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
