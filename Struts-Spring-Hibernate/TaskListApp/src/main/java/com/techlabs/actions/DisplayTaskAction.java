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

	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginModel userLoginModel;
	private Set<Task> tasks;

	@Override
	public String execute() throws Exception {

		String userId = userLoginModel.getUserId();
		User user = userService.getUser(userId);
		System.out.println("In task action" + user.getTasks());
		tasks = user.getTasks();

		return "success";
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
}
