package com.techlabs.actions.user;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;

public class DisplayUserAction extends ActionSupport {

	@Autowired
	private UserService userService;
	private List<User> users;
	private InputStream inputStream;
	private String userId;

	@Override
	public String execute() throws Exception {

		users = userService.getUsers();
		return "success";
	}

	public String displayImage() {

		User user = userService.getUser(userId);
		Blob image = user.getImage();
		byte[] imageBytes = null;

		try {
			imageBytes = image.getBytes(1l, (int) image.length());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		inputStream = new ByteArrayInputStream(imageBytes);

		return "success";

	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
