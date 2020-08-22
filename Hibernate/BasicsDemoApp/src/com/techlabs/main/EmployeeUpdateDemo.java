package com.techlabs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Employee;

public class EmployeeUpdateDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			int id = 7;

			session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			employee.setName("sej");
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("update Employee set designation = 'manager'").executeUpdate();
			session.getTransaction().commit();
			

		} finally {
			factory.close();
		}
	}

}
