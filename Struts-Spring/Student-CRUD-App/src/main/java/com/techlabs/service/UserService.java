package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import com.techlabs.model.User;

public class UserService {

	private List<User> users;

	public UserService() {
		users = new ArrayList<User>();
		loadUsers();
	}

	private void loadUsers() {

		users.add(new User("admin", "admin"));
		users.add(new User("sejal", "sejal"));
	}

	public boolean isValidUser(String username, String password) {
		for (User tempUser : users) {
			if ((tempUser.getUsername().equals(username)) && (tempUser.getPassword().equals(password))) {
				return true;
			}
		}
		return false;
	}

}
