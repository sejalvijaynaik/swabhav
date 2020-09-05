package com.techlabs.actions;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.service.SubTaskService;
import com.techlabs.service.TaskService;
import com.techlabs.service.UserService;

public class TestAction extends ActionSupport {

	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	@Autowired
	private SubTaskService subTaskService;

	@Override
	public String execute() throws Exception {

		User user = userService.getUser("0a173059-ca44-424f-9630-80b99e332729");
		if(user.getTasks().size() == 0) {
			System.out.println("true");
		}
		

		return "success";
	}
}
