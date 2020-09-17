package com.techlabs.actions.user;

import javax.jws.soap.SOAPBinding.Use;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;

public class UpdateUserLockAction extends ActionSupport {

	private String userId;
	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {

		User user = userService.getUser(userId);
		boolean locked = false;
		if (user.isLocked() == false) {
			locked = true;
		}

		userService.updateUserForAdmin(userId, user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getUsername(), user.getPassword(), user.getUserType(), user.getTasks(), locked);

		System.out.println("user locked or not" + userService.getUser(userId).isLocked());
		return "success";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
