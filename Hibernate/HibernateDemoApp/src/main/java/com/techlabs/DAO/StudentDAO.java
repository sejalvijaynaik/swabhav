package com.techlabs.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Student;

public class StudentDAO {

	Configuration configConfiguration = null;
	SessionFactory sessionFactory = null;

	public StudentDAO() {

		configConfiguration = new Configuration();
		sessionFactory = configConfiguration.configure("hibernate.cfg.xml").buildSessionFactory();
	}

	public void createStuddent(String name, float cgpa) {

		UUID uuid = UUID.randomUUID();
		Student student = new Student(uuid.toString(), name, cgpa);
		System.out.println(student);
		Session session = sessionFactory.openSession();
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

	public void printAllStudents() {

		List<Student> students = new ArrayList<Student>();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			students = session.createQuery("from Student").list();
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}

		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void printStudent(String id) {

		Student student = new Student();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			student = (Student) session.get(Student.class, id);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
		System.out.println(student);
	}

	public void updateStudent(String id, String name, float cgpa) {

		Student student = new Student(id, name, cgpa);
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			session.update(student);
			transaction.commit();

			/*transaction = session.beginTransaction();
			Student student = (Student) session.get(Student.class, id);
			student.setName(name);
			student.setCgpa(cgpa);
			transaction.commit();*/

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public void deleteStudent(String id) {

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			Student student = (Student) session.get(Student.class, id);
			session.delete(student);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
