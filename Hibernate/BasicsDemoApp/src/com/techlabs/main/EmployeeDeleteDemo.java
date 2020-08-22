package com.techlabs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Employee;

public class EmployeeDeleteDemo {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			/*int id = 7;
			session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			session.delete(employee);
			session.getTransaction().commit();*/
			
			session.beginTransaction();
			session.createQuery("delete from Employee where id = 13").executeUpdate();
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
}
