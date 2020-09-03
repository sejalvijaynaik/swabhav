package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.techlabs.entity.Student;

@Repository
public class StudentRepository {

	@Autowired
	private SessionFactory sessionFactory;
	Session session;
	Transaction transaction;
	List<Student> students = new ArrayList<Student>();

	private StudentRepository() {
		System.out.println("In Student repository");
	}

	public List<Student> getStudnets() {

		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Student.class);

		students = criteria.list();

		session.close();

		return students;
	}

	public void addStudent(String name, String address, int age) {

		Student student = new Student(name, address, age);
		session = sessionFactory.openSession();

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

	public Student getStudent(String rollNo) {

		Student student = new Student();
		session = sessionFactory.openSession();

		student = (Student) session.get(Student.class, UUID.fromString(rollNo));

		session.close();
		return student;
	}

	public void updateStudent(String rollNo, String name, String address, int age) {

		Student student = new Student(UUID.fromString(rollNo), name, address, age);
		session = sessionFactory.openSession();

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

	public void deleteStudent(String rollNo) {

		Student student = getStudent(rollNo);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.delete(student);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
