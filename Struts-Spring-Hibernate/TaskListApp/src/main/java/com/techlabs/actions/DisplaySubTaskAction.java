package com.techlabs.actions;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.service.TaskService;
import com.techlabs.viewModel.TaskSelectedModel;

public class DisplaySubTaskAction extends ActionSupport {

	private String taskId;
	@Autowired
	private TaskSelectedModel taskSelectedModel;
	@Autowired
	private TaskService taskService;
	private Set<SubTask> subTasks;

	public DisplaySubTaskAction() {
		System.out.println("DisplaySubTaskAction constructor");
	}

	@Override
	public String execute() throws Exception {

		System.out.println("sub task display");
		Task task = null;

		if (taskId != null) {
			System.out.println("taskId is there");
			taskSelectedModel.setTaskId(taskId);
			task = taskService.getTask(taskSelectedModel.getTaskId());
			System.out.println(task);
		} else {
			System.out.println("task id is not there");
			task = taskService.getTask(taskSelectedModel.getTaskId());
			System.out.println(task);
		}

		subTasks = task.getSubTasks();

		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Set<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(Set<SubTask> subTasks) {
		this.subTasks = subTasks;
	}

}
