package com.techlabs.actions.task;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
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

		task = taskService.getTask(taskId);
		// prepopulate with previous title
		newTitle = task.getTitle();
		User user = userService.getUser(userLoginModel.getUserId());
		tasks = user.getTasks();

		return "input";
	}

	public String updateTaskDo() {

		// if title is blank
		if (newTitle.equals("")) {
			return "input";
		}
		// if title is entered without updating
		if (taskId.equals("")) {
			return "success";
		}

		task = taskService.getTask(taskId);
		taskService.updateTaskInfo(task.getId().toString(), newTitle, task.getDate(), task.isDone(), task.getUser(),
				task.getSubTasks());

		return "success";
	}

	public String updateTaskDone() {

		// marking task as done
		taskService.updateTaskDone(taskId);
		task = taskService.getTask(taskId);
		Set<SubTask> subTasks = task.getSubTasks();

		// to update subtasks of the task
		if (task.isDone() == true) {
			for (SubTask subTask : subTasks) {
				if (subTask.isDone() == false) {
					// if subtask is not done then mark as done
					subTaskService.updateSubTask(subTask.getId().toString(), subTask.getTitle(), task.getDate(),
							task.isDone(), task);
				}
			}
		}

		else {
			// if task is undone then mark all its subtasks as undone
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
