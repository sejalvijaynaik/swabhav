package com.techlabs.service;

import java.util.List;
import com.techlabs.dao.UserDAO;
import com.techlabs.model.User;

public class UserService {

	private UserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}

	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	public User getUser(int id) {
		return userDAO.getUser(id);
	}

	public void updateUser(int id, String username, String password) {
		userDAO.updateUser(id, username, password);
	}

	public void deleteUser(int id) {
		userDAO.deleteUser(id);
	}

	public void addUser(String username, String password) {
		userDAO.addUser(username, password);
	}

	public List<User> searchUsers(String name) {
		return userDAO.searchUsers(name);
	}

	public boolean isValid(String username, String password) {

		List<User> users = userDAO.getUsers();

		for (User user : users) {
			if ((username.equals(user.getUsername())) && (password.equals(user.getPassword()))) {
				return true;
			}
		}
		return false;
	}

	public int getUserId(String username, String password) {
		List<User> users = userDAO.getUsers();

		for (User user : users) {
			if ((username.equals(user.getUsername())) && (password.equals(user.getPassword()))) {
				return user.getId();
			}
		}
		return 0;
	}
}
