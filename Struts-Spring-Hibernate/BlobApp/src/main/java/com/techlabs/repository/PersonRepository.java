package com.techlabs.repository;

import java.sql.Blob;
import java.util.List;
import java.util.UUID;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.techlabs.entity.Person;

@Repository
public class PersonRepository {

	@Autowired
	private SessionFactory sessionFactory;
	private Transaction transaction;
	private Session session;

	public void addPersom(String name, Blob image) {

		Person perosn = new Person(image, name);
		session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			session.save(perosn);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

	public Person getPerson(String id) {

		Person person = new Person();
		session = sessionFactory.openSession();

		person = (Person) session.get(Person.class, UUID.fromString(id));

		session.close();
		return person;
	}

	public List<Person> getPersons() {

		session = sessionFactory.openSession();

		List<Person> persons = session.createQuery("from Person").list();

		session.close();

		return persons;
	}
}
