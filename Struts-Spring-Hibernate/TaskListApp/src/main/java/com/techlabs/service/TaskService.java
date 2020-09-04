package com.techlabs.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

	public void updateTask(String id, String title, Date date, boolean done) {
		taskRepository.updateTask(id, title, date, done);
	}

	public void deleteTask(String id) {
		taskRepository.deleteTask(id);
	}
}
