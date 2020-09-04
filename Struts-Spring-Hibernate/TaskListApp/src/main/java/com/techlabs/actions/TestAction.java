package com.techlabs.actions;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.TaskService;
import com.techlabs.service.UserService;

public class TestAction extends ActionSupport {

	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {

		/*User user = userService.getUser("cbf6eaca-1ae6-46d4-9dee-5550d8f3dfde");
		
		String taskId = taskService.addTask("study", new Date(), true, user);
		Task task = taskService.getTask(taskId);
		
		Set<Task> tasks = user.getTasks();
		tasks.add(task);
		user.setTasks(tasks);
		userService.updateUser(user.getId().toString(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getUsername(), user.getPassword(), user.getTasks());
		*/
		/*User user = userService.getUser("cbf6eaca-1ae6-46d4-9dee-5550d8f3dfde");
		Task task = new Task("study", new Date(), true, user);
		
		Set<Task> tasks = user.getTasks();
		tasks.add(task);
		user.setTasks(tasks);
		userService.updateUser(user.getId().toString(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getUsername(), user.getPassword(), user.getTasks());
		
		//System.out.println(task.getUser());
		System.out.println(user.getTasks().size());
		*/
		Task task = taskService.getTask("b1d75cfd-0837-4516-ad43-f8f50bc186a8");
		System.out.println(task.getUser());
		
		
				
		
		return "success";
	}
}
