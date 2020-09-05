package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.service.TaskService;
import com.techlabs.viewModel.TaskSelectedModel;

public class AddSubTaskAction extends ActionSupport {

	@Autowired
	private TaskSelectedModel taskSelectedModel;
	private String title;
	@Autowired
	private TaskService taskService;

	@Override
	public String execute() throws Exception {

		System.out.println("addSubTask execute running");
		System.out.println("name" + title);
		System.out.println(taskSelectedModel.getTaskId());

		Task task = taskService.getTask(taskSelectedModel.getTaskId());
		SubTask subTask = new SubTask(title, null, false, task);
		taskService.updateTask(task, subTask);

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
