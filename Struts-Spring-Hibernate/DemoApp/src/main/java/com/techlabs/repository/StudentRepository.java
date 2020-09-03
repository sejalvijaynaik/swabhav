package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
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

	List<Student> students = new ArrayList<Student>();

	private StudentRepository() {
		System.out.println("In Student repository");
	}

	public List<Student> get() {

		Session session = sessionFactory.openSession();
		System.out.println(session.getClass());

		Transaction transaction = session.beginTransaction();
		Criteria cr = session.createCriteria(Student.class);
		students = cr.list();
		transaction.commit();

		session.close();
		return students;
	}

}
