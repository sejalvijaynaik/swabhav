package com.techlabs.actions;

import java.util.Iterator;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.SubTaskService;
import com.techlabs.service.TaskService;
import com.techlabs.service.UserService;

public class DeleteUserAction extends ActionSupport {

	private String userId;
	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private SubTaskService subTaskService;

	@Override
	public String execute() throws Exception {

		User user = userService.getUser(userId);
		String taskId;

		if (user.getTasks().size() == 0) {
			System.out.println("user - tasks is 0");
			userService.deleteUser(userId);
		} else {
			System.out.println("user - tasks is not 0");
			for (Iterator<Task> iteratorTask = user.getTasks().iterator(); iteratorTask.hasNext();) {
				Task task = iteratorTask.next();
				taskId = task.getId().toString();
				System.out.println(task);

				if (task.getSubTasks().size() == 0) {
					System.out.println("task - subtasks is 0");
					taskService.deleteTask(taskId);
				} else {
					System.out.println("task - subtasks is not 0");
					for (Iterator<SubTask> iteratorSubTask = task.getSubTasks().iterator(); iteratorSubTask
							.hasNext();) {
						SubTask subTask = iteratorSubTask.next();
						System.out.println(subTask);
						subTaskService.deleteSubTask(subTask.getId().toString());
					}
					taskService.deleteTask(taskId);
				}
			}
			userService.deleteUser(userId);
		}
		return "success";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
