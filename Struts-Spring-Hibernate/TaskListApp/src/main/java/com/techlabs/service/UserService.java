package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void addUser(String firstName, String lastName, String email, String username, String password) {
		userRepository.addUser(firstName, lastName, email, username, password);
	}

	public List<User> getUsers() {
		return userRepository.getUsers();
	}

	public User getUser(String id) {
		return userRepository.getUser(id);
	}

	public void updateUserForAdmin(String id, String firstName, String lastName, String email, String username,
			String password) {
		userRepository.updateUserForAdmin(id, firstName, lastName, email, username, password);
	}

	public void updateUser(User user, Task task) {
		userRepository.updateUser(user, task);
	}

	public void deleteUser(String id) {
		userRepository.deleteUser(id);
	}

	public String getUserId(String username, String password) {
		return userRepository.getUserId(username, password);
	}
}
