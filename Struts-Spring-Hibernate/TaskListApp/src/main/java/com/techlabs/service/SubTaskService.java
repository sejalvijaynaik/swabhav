package com.techlabs.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.repository.SubTaskRepository;

@Service
public class SubTaskService {

	@Autowired
	private SubTaskRepository subTaskRepository;

	public List<SubTask> getSubTasks() {
		return subTaskRepository.getSubTasks();
	}

	public SubTask getSubTask(String id) {
		return subTaskRepository.getSubTask(id);
	}

	public void updateSubTask(String id, String title, Date date, boolean done, Task task) {
		subTaskRepository.updateSubTask(id, title, date, done, task);
	}

	public void deleteSubTask(String id) {
		subTaskRepository.deleteSubTask(id);
	}

	public void deleteSubTasks(String taskId) {
		subTaskRepository.deleteSubTask(taskId);
	}
}
