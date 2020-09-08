package com.techlabs.actions.subtask;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.service.SubTaskService;
import com.techlabs.service.TaskService;
import com.techlabs.viewModel.TaskSelectedModel;

public class UpdateSubTaskAction extends ActionSupport {

	private String newTitle;
	private String subTaskId;
	@Autowired
	private SubTaskService subTaskService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private TaskSelectedModel taskSelectedModel;
	private Set<SubTask> subTasks;
	private SubTask subTask;

	@Override
	public String execute() throws Exception {

		System.out.println("update subtask execute running");

		subTask = subTaskService.getSubTask(subTaskId);
		//prepopulate title
		newTitle = subTask.getTitle();
		Task task = taskService.getTask(taskSelectedModel.getTaskId());
		subTasks = task.getSubTasks();

		return "input";
	}

	public String updateSubTaskDo() {

		System.out.println("update task updateDo running");

		//if title is left blank
		if (newTitle.equals("")) {
			return "input";
		}
		//if title is entered without update
		if (subTaskId.equals("")) {
			return "success";
		}

		subTask = subTaskService.getSubTask(subTaskId);
		subTaskService.updateSubTask(subTask.getId().toString(), newTitle, subTask.getDate(), subTask.isDone(),
				subTask.getTask());

		return "success";
	}

	public String updateSubTaskDone() {

		System.out.println("updateSubTaskDone running");
		System.out.println("subtask id" + subTaskId);
		//marking subtask as done
		subTaskService.updateSubTaskDone(subTaskId);

		return "success";
	}

	public String getSubTaskId() {
		return subTaskId;
	}

	public void setSubTaskId(String subTaskId) {
		this.subTaskId = subTaskId;
	}

	public Set<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(Set<SubTask> subTasks) {
		this.subTasks = subTasks;
	}

	public String getNewTitle() {
		return newTitle;
	}

	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}

}
