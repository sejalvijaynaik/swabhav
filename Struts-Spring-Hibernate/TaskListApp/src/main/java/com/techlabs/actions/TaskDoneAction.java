package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.TaskService;
import com.techlabs.viewModel.UserLoginModel;

public class TaskDoneAction extends ActionSupport {

	@Autowired
	private TaskService taskService;
	@Autowired
	private UserLoginModel userLoginModel;
	private String taskId;
	private boolean done;

	@Override
	public String execute() throws Exception {

		System.out.println("task done action execute");

		System.out.println(taskId);
		System.out.println(done);

		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
