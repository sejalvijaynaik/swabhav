package com.techlabs.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Customer;

public class CustomerTest {

	public static void main(String[] args) {

		Configuration configConfiguration = new Configuration();
		SessionFactory sessionFactory = configConfiguration.configure("hibernate.cfg.xml").buildSessionFactory();

		Customer customer = new Customer();
		customer.setName("sejal");
		customer.setCgpa(4.6f);

		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
