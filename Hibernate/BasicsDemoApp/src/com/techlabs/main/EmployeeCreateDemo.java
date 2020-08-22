package com.techlabs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Employee;

public class EmployeeCreateDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Employee employee = new Employee("sej", 400.00, "developer");

			session.beginTransaction();

			session.save(employee);

			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}
}
