package com.techlabs.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.apache.velocity.tools.generic.ClassTool.Sub;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;

@Repository
public class SubTaskRepository {

	@Autowired
	private SessionFactory sessionFactory;
	private Transaction transaction;
	private Session session;
	private List<SubTask> subTasks = new ArrayList<SubTask>();
	private SubTask subTask;
	private String subTaskId;

	public List<SubTask> getSubTasks() {

		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(SubTask.class);

		subTasks = criteria.list();

		session.close();

		return subTasks;
	}

	public SubTask getSubTask(String id) {

		subTask = new SubTask();
		session = sessionFactory.openSession();

		subTask = (SubTask) session.get(SubTask.class, UUID.fromString(id));

		session.close();
		return subTask;
	}

	public void updateSubTask(String id, String title, Date date, boolean done, Task task) {

		subTask = new SubTask(UUID.fromString(id), title, date, done, task);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.update(subTask);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void deleteSubTask(String id) {

		subTask = getSubTask(id);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.delete(subTask);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void deleteSubTasks(String taskId) {

		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			Query myQuery = session.createQuery("delete from SubTask where task.getId()=:taskId");
			myQuery.setParameter("taskId", taskId);
			myQuery.executeUpdate();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}

	}
}
