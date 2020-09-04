package com.techlabs.actions;

import java.util.Date;
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

		System.out.println("addStudent(addTaskDo) running");
		System.out.println("name" + title);

		User user = userService.getUser(userLoginModel.getUserId());
		Task task = new Task(title, new Date(), false, user);
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

		System.out.println("validate running");

		if (title.equals("")) {
			addFieldError("", "");
		}
	}
}
