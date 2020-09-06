package com.techlabs.actions;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.service.SubTaskService;
import com.techlabs.service.TaskService;
import com.techlabs.service.UserService;
import com.techlabs.viewModel.UserLoginModel;

public class UpdateTaskAction extends ActionSupport {

	private String newTitle;
	private String taskId;
	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	@Autowired
	private UserLoginModel userLoginModel;
	private Set<Task> tasks;
	private Task task;
	@Autowired
	private SubTaskService subTaskService;

	@Override
	public String execute() throws Exception {

		System.out.println("update task execute running");

		task = taskService.getTask(taskId);
		newTitle = task.getTitle();

		tasks = userService.getTasks(userLoginModel.getUserId());

		return "input";
	}

	public String updateTaskDo() {

		System.out.println("update task updateDo running");
		System.out.println("taskid value :" + taskId);

		if (newTitle.equals("")) {
			return "input";
		}
		if (taskId.equals("")) {
			System.out.println("taskid value :" + taskId);
			return "success";
		}

		task = taskService.getTask(taskId);
		taskService.updateTaskInfo(task.getId().toString(), newTitle, task.getDate(), task.isDone(), task.getUser());

		return "success";
	}

	public String updateTaskDone() {

		System.out.println("updateTaskDone running");
		System.out.println("taskId :" + taskId);

		taskService.updateTaskDone(taskId);
		task = taskService.getTask(taskId);
		Set<SubTask> subTasks = task.getSubTasks();
		if (task.isDone() == true) {
			for (SubTask subTask : subTasks) {
				if (subTask.isDone() == false) {
					subTaskService.updateSubTask(subTask.getId().toString(), subTask.getTitle(), task.getDate(),
							task.isDone(), task);
				}
			}
		}

		else {
			for (SubTask subTask : subTasks) {
				subTaskService.updateSubTask(subTask.getId().toString(), subTask.getTitle(), null, task.isDone(), task);
			}
		}

		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	public String getNewTitle() {
		return newTitle;
	}

	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}
}
