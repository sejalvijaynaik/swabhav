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

		User user = userService.getUser("cbf6eaca-1ae6-46d4-9dee-5550d8f3dfde");
		System.out.println(user.getTasks().size());
		
		return "success";
	}
}
