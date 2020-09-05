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

	public void updateTaskInfo(String id, String title, Date date, boolean done, User user) {
		taskRepository.updateTaskInfo(id, title, date, done, user);
	}

	public void deleteTask(String id) {
		taskRepository.deleteTask(id);
	}

	public void updateTask(Task task, SubTask subTask) {
		taskRepository.updateTask(task, subTask);
	}

	public Set<SubTask> getSubTasks(String id) {
		return taskRepository.getSubTasks(id);
	}
}
