package com.techlabs.actions;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.TaskService;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;

public class UpdateTaskAction extends ActionSupport {

	private String newTitle;
	private String taskId;
	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginModel userLoginModel;
	private Set<Task> tasks;
	private Task task;
	private User user;

	public UpdateTaskAction() {

		System.out.println("update task action constriuror");
	}

	@Override
	public String execute() throws Exception {

		System.out.println("update task execute running");

		task = taskService.getTask(taskId);
		newTitle = task.getTitle();

		tasks = userService.getTasks(userLoginModel.getUserId());

		return "input";
	}

	public String updateDo() {

		System.out.println("update task updateDo running");
		
		if(newTitle.equals("")) {
			return "input";
		}

		task = taskService.getTask(taskId);
		taskService.updateTask(task.getId().toString(), newTitle, task.getDate(), task.isDone(), task.getUser());

		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	public String getNewTitle() {
		return newTitle;
	}

	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}

}
