package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.TaskService;

public class DeleteTaskAction extends ActionSupport {

	@Autowired
	private TaskService taskService;
	private String taskId;

	@Override
	public String execute() throws Exception {

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
