package com.techlabs.repository;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
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

		users = session.createQuery("from User").list();

		session.close();

		return users;
	}

	public void addUser(String firstName, String lastName, String email, String username, String password,
			String userType, boolean locked, Blob image) {

		user = new User(UUID.randomUUID(), firstName, lastName, email, username, password, userType,
				new HashSet<Task>(), false, image);
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
		System.out.println("Inside user repo get User");
		session = sessionFactory.openSession();

		user = (User) session.get(User.class, UUID.fromString(id));

		session.close();
		return user;
	}

	public void updateUserForAdmin(String id, String firstName, String lastName, String email, String username,
			String password, String userType, Set<Task> tasks, boolean locked, Blob image) {

		user = new User(UUID.fromString(id), firstName, lastName, email, username, password, userType, tasks, locked,
				image);
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
				user.getPassword(), user.getUserType(), user.getTasks(), user.isLocked(), user.getImage());
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
}
