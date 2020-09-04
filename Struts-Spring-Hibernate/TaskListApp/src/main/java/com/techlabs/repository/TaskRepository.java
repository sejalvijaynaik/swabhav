package com.techlabs.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class TaskRepository {

	@Autowired
	private SessionFactory sessionFactory;
	private Transaction transaction;
	private Session session;
	private List<Task> tasks = new ArrayList<Task>();
	private Task task;
	private String taskId;

	public List<Task> getTasks() {

		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Task.class);

		tasks = criteria.list();

		session.close();

		return tasks;
	}

	public Task getTask(String id) {

		task = new Task();
		session = sessionFactory.openSession();

		task = (Task) session.get(Task.class, UUID.fromString(id));

		session.close();
		return task;
	}

	public void updateTask(String id, String title, Date date, boolean done, User user) {

		task = new Task(UUID.fromString(id), title, date, done, user);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.update(task);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void deleteTask(String id) {

		task = getTask(id);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.delete(task);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
