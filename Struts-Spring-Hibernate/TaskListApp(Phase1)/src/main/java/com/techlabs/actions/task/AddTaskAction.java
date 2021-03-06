package com.techlabs.actions.task;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;

public class AddTaskAction extends ActionSupport {

	@Autowired
	private UserLoginModel userLoginModel;
	@Autowired
	private UserService userService;
	private String title;

	@Override
	public String execute() throws Exception {

		User user = userService.getUser(userLoginModel.getUserId());
		Task task = new Task(title, null, false, user);
		userService.updateUser(user, task);

		return "success";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void validate() {

		if (title.equals("")) {
			addFieldError("", "");
		}
	}
}
