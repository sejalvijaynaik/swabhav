package com.techlabs.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public List<Task> getTasks() {
		return taskRepository.getTasks();
	}

	public Task getTask(String id) {
		return taskRepository.getTask(id);
	}

	public void updateTaskInfo(String id, String title, Date date, boolean done, User user, Set<SubTask> subTasks) {
		taskRepository.updateTaskInfo(id, title, date, done, user, subTasks);
	}

	public void deleteTask(String id) {
		taskRepository.deleteTask(id);
	}

	public void updateTask(Task task, SubTask subTask) {
		taskRepository.updateTask(task, subTask);
	}

	public void updateTaskDone(String id) {

		Task task = taskRepository.getTask(id);
		boolean doneValue = task.isDone();
		Date date;
		if (doneValue == true) {
			doneValue = false;
			date = null;
		} else {
			doneValue = true;
			date = new Date();
		}
		taskRepository.updateTaskInfo(id, task.getTitle(), date, doneValue, task.getUser(), task.getSubTasks());
	}
}
