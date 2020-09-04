package com.techlabs.actions;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.TaskAddModel;
import com.techlabs.viewModel.UserLoginModel;

public class AddTaskAction extends ActionSupport implements ModelDriven<TaskAddModel> {

	@Autowired
	private UserLoginModel userLoginModel;
	@Autowired
	private TaskAddModel taskAddModel;
	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {

		System.out.println("addtask(execute) running");
		
		return "input";
	}

	public String addTaskDo() {

		System.out.println("addStudent(addTaskDo) running");
		System.out.println("name" + taskAddModel.getTitle());

		User user = userService.getUser(userLoginModel.getUserId());
		Task task = new Task(taskAddModel.getTitle(), new Date(), false, user);
		userService.updateUser(user, task);

		return "success";
	}

	@Override
	public TaskAddModel getModel() {
		return taskAddModel;
	}

	@Override
	public void validate() {

		System.out.println("validate running");
		System.out.println(taskAddModel);
		if (taskAddModel.getTitle() == null) {
			addFieldError("", "");
		} else {
			if (taskAddModel.getTitle().equals("")) {
				addFieldError("title", "Title is required");
			}
		}
	}
}
