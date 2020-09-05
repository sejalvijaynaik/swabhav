package com.techlabs.actions;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.SubTaskService;
import com.techlabs.service.TaskService;
import com.techlabs.service.UserService;

public class TestAction extends ActionSupport {

	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	@Autowired
	private SubTaskService subTaskService;

	@Override
	public String execute() throws Exception {

		String taskId = "37a4081d-0dac-4698-86e3-fc2725629211";
		Task task = taskService.getTask(taskId);

		if (task.getSubTasks().size() == 0) {
			subTaskService.deleteSubTask(taskId);
		}

		return "success";
	}
}
