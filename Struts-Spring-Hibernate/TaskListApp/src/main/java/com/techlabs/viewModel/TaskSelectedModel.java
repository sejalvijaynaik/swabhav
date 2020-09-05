package com.techlabs.viewModel;

import org.springframework.stereotype.Component;

@Component
public class TaskSelectedModel {

	private String taskId;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
}
