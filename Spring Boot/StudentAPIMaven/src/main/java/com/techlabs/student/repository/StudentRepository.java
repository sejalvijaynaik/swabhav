package com.techlabs.student.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.student.entity.Student;

@Repository
public class StudentRepository {

	@Autowired
	private EntityManager entityManager;

	public List<Student> getStudents() {

		List<Student> students = new ArrayList<Student>();
		Session session = entityManager.unwrap(Session.class);
		students = session.createQuery("from Student").list();

		session.close();

		return students;
	}

	public void addStuddent(Student student) {

		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public Student getStudent(String id) {

		Session session = entityManager.unwrap(Session.class);
		Student student = (Student) session.get(Student.class, UUID.fromString(id));

		session.close();

		return student;
	}

	public void deleteStudent(String id) {

		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			Student student = (Student) session.get(Student.class, UUID.fromString(id));
			session.delete(student);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void updateStudent(Student student) {

		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.update(student);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
