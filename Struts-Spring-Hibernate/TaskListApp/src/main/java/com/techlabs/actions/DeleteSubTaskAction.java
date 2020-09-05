package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.SubTaskService;
import com.techlabs.service.TaskService;

public class DeleteSubTaskAction extends ActionSupport {

	@Autowired
	private SubTaskService subTaskService;
	private String subTaskId;

	@Override
	public String execute() throws Exception {

		subTaskService.deleteSubTask(subTaskId);
		return "success";
	}

	public String getSubTaskId() {
		return subTaskId;
	}

	public void setSubTaskId(String subTaskId) {
		this.subTaskId = subTaskId;
	}
}
