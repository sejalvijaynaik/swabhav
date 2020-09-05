package com.techlabs.actions;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.service.SubTaskService;
import com.techlabs.service.TaskService;

public class DeleteTaskAction extends ActionSupport {

	@Autowired
	private TaskService taskService;
	private String taskId;
	@Autowired
	private SubTaskService subTaskService;

	@Override
	public String execute() throws Exception {

		System.out.println("In delete task action");
		System.out.println(taskId);

		Task task = taskService.getTask(taskId);
		
		System.out.println("size of subtasks :" + task.getSubTasks().size());

		if (task.getSubTasks().size() == 0) {
			System.out.println("task - subtasks is 0");
			taskService.deleteTask(taskId);
		} else {
			System.out.println("task - subtasks is not 0");
			for (Iterator<SubTask> iterator = task.getSubTasks().iterator(); iterator.hasNext();) {
				SubTask subTask = iterator.next();
				System.out.println(subTask);
				subTaskService.deleteSubTask(subTask.getId().toString());
			}
			taskService.deleteTask(taskId);
		}

		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
}
