package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.viewModel.TaskSelectedModel;
import com.techlabs.viewModel.UserAddModel;
import com.techlabs.viewModel.UserLoginModel;
import com.techlabs.viewModel.UserUpdateModel;

public class LogoutAction extends ActionSupport {

	@Autowired
	private TaskSelectedModel taskSelectedModel;
	@Autowired
	private UserAddModel userAddModel;
	@Autowired
	private UserLoginModel userLoginModel;

	@Override
	public String execute() throws Exception {

		// reset all session scoped beans
		taskSelectedModel.setTaskId(null);

		userAddModel.setFirstName(null);
		userAddModel.setLastName(null);
		userAddModel.setEmail(null);
		userAddModel.setUsername(null);
		userAddModel.setPassword(null);
		userAddModel.setNextAction(null);

		userLoginModel.setUsername(null);
		userLoginModel.setPassword(null);
		userLoginModel.setMessage(null);
		userLoginModel.setAdmin(false);
		userLoginModel.setUserId(null);
		userLoginModel.setNextAction(null);

		return "success";
	}
}
