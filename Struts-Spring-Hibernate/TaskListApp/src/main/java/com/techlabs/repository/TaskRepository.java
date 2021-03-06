package com.techlabs.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.techlabs.entity.SubTask;
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

	public List<Task> getTasks() {

		session = sessionFactory.openSession();
		tasks = session.createQuery("from Task").list();

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

	public void updateTaskInfo(String id, String title, Date date, boolean done, User user, Set<SubTask> subTasks) {

		task = new Task(UUID.fromString(id), title, date, done, user, subTasks);
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

	public void updateTask(Task task, SubTask subTask) {

		Set<SubTask> subTasks = task.getSubTasks();
		subTasks.add(subTask);
		task.setSubTasks(subTasks);

		this.task = new Task(task.getId(), task.getTitle(), task.getDate(), task.isDone(), task.getUser(),
				task.getSubTasks());
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.update(this.task);
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
