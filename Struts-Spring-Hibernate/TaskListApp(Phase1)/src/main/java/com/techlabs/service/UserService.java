package com.techlabs.service;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.sql.rowset.serial.SerialBlob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public Blob fileToBlob(File imageFile) {

		Blob image = null;
		byte[] bFile = new byte[(int) imageFile.length()];

		try {
			FileInputStream fileInputStream = new FileInputStream(imageFile);
			fileInputStream.read(bFile);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			image = new SerialBlob(bFile);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}

	public void addUser(String firstName, String lastName, String email, String username, String password,
			String userType, boolean locked, File imageFile) {

		userRepository.addUser(firstName, lastName, email, username, password, userType, locked, fileToBlob(imageFile));
	}

	public List<User> getUsers() {
		return userRepository.getUsers();
	}

	public User getUser(String id) {
		return userRepository.getUser(id);
	}

	public void updateUserForAdmin(String id, String firstName, String lastName, String email, String username,
			String password, String userType, Set<Task> tasks, boolean locked, File imageFile) {

		userRepository.updateUserForAdmin(id, firstName, lastName, email, username, password, userType, tasks, locked,
				fileToBlob(imageFile));
	}
	
	public void updateUserForAdmin(String id, String firstName, String lastName, String email, String username,
			String password, String userType, Set<Task> tasks, boolean locked, Blob image) {

		userRepository.updateUserForAdmin(id, firstName, lastName, email, username, password, userType, tasks, locked,
				image);
	}

	public void updateUser(User user, Task task) {
		userRepository.updateUser(user, task);
	}

	public void deleteUser(String id) {
		userRepository.deleteUser(id);
	}

	public String getUserId(String username, String password) {

		List<User> users = userRepository.getUsers();

		for (User tempUser : users) {
			if ((tempUser.getUsername().equals(username)) && (tempUser.getPassword().equals(password))) {
				return tempUser.getId().toString();
			}
		}
		return null;
	}

	public boolean isUsernameUnique(String username) {

		List<User> users = userRepository.getUsers();

		for (User tempUser : users) {
			if (tempUser.getUsername().equals(username)) {
				return false;
			}
		}
		return true;
	}

	public List<String> getEmails() {

		List<User> users = userRepository.getUsers();
		if(users == null) {
			return null;
		}
		List<String> emails = new ArrayList<String>();

		for (User tempUser : users) {
			emails.add(tempUser.getEmail());
		}

		return emails;
	}
}
