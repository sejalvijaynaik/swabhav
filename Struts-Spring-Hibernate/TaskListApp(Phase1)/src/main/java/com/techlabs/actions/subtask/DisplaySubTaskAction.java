package com.techlabs.actions.subtask;

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

	@Override
	public String execute() throws Exception {

		Task task = null;

		// subtask selected by admin
		if (taskId != null) {
			taskSelectedModel.setTaskId(taskId);
			task = taskService.getTask(taskSelectedModel.getTaskId());
		} else {
			// subtask selected by user
			task = taskService.getTask(taskSelectedModel.getTaskId());
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
