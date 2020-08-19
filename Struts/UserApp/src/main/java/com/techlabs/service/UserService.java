package com.techlabs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.viewModels.User;

public class UserService {

	private Map<String, String> users;

	public UserService() {
		users = new HashMap<String, String>();
		loadUsers();
	}

	private void loadUsers() {

		users.put("admin", "admin");
		users.put("sejal", "sejal");
	}

	public boolean isValidUser(String username, String password) {
		for (Map.Entry<String, String> entry : users.entrySet()) {
			if ((entry.getKey().equals(username)) && (entry.getValue().equals(password))) {
				return true;
			}
		}
		return false;
	}
}
