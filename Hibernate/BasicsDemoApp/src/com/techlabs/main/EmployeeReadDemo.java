package com.techlabs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Employee;

public class EmployeeReadDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Employee newEmployee = new Employee("lolo", 5000.00, "manager");

			session.beginTransaction();
			session.save(newEmployee);
			session.getTransaction().commit();

			System.out.println("New employee created Id :" + newEmployee.getId());

			session = factory.getCurrentSession();
			session.beginTransaction();
			Employee employee = session.get(Employee.class, newEmployee.getId());
			System.out.println(employee);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
}
