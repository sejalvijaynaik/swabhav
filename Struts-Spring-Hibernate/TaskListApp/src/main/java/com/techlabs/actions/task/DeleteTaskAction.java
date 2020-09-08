package com.techlabs.actions.task;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.TaskService;

public class DeleteTaskAction extends ActionSupport {

	@Autowired
	private TaskService taskService;
	private String taskId;

	@Override
	public String execute() throws Exception {

		System.out.println("In delete task action");
		System.out.println(taskId);

		taskService.deleteTask(taskId);

		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
}
