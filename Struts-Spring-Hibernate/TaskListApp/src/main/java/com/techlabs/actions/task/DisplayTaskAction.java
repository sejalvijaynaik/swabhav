package com.techlabs.actions.task;

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
	private boolean usersButtonShow;

	@Override
	public String execute() throws Exception {

		System.out.println("task display running");
		System.out.println("userLoginModel.isAdmin()" + userLoginModel.isAdmin());

		// to show users button
		if (userLoginModel.isAdmin() == true) {
			usersButtonShow = true;
		} else {
			// to hide users button
			usersButtonShow = false;
		}

		User user = null;

		// task is selected by admin
		if (userId != null) {
			System.out.println("userId is there");
			userLoginModel.setUserId(userId);
			user = userService.getUser(userLoginModel.getUserId());
			System.out.println(user);
		} else {
			// task is selected by user
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

	public boolean isUsersButtonShow() {
		return usersButtonShow;
	}

	public void setUsersButtonShow(boolean usersButtonShow) {
		this.usersButtonShow = usersButtonShow;
	}
}
