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

		String userId = "27219f1b-642a-41e8-b414-f7c6259cfa8b";

		userService.deleteUser(userId);

		return "success";
	}
}
