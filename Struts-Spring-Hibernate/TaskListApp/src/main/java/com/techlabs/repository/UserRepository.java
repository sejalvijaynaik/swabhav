package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Task;
import com.techlabs.entity.User;

@Repository
public class UserRepository {

	@Autowired
	private SessionFactory sessionFactory;
	private Transaction transaction;
	private Session session;
	private List<User> users = new ArrayList<User>();
	private User user;

	public List<User> getUsers() {

		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);

		users = criteria.list();

		session.close();

		return users;
	}

	public void addUser(String firstName, String lastName, String email, String username, String password) {

		user = new User(firstName, lastName, email, username, password);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public User getUser(String id) {

		user = new User();
		session = sessionFactory.openSession();

		user = (User) session.get(User.class, UUID.fromString(id));

		session.close();
		return user;
	}

	public void updateUserForAdmin(String id, String firstName, String lastName, String email, String username,
			String password) {

		user = new User(UUID.fromString(id), firstName, lastName, email, username, password);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.update(user);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void updateUser(User user, Task task) {

		Set<Task> tasks = user.getTasks();
		tasks.add(task);
		user.setTasks(tasks);

		this.user = new User(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getUsername(),
				user.getPassword(), user.getTasks());
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.update(this.user);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void deleteUser(String id) {

		user = getUser(id);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.delete(user);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public String getUserId(String username, String password) {

		List<User> users = getUsers();

		for (User tempUser : users) {
			if ((tempUser.getUsername().equals(username)) && (tempUser.getPassword().equals(password))) {
				return tempUser.getId().toString();
			}
		}
		return null;
	}
}
