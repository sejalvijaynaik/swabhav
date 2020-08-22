package com.techlabs.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Employee;

public class EmployeeQueryDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			List<Employee> employees = session.createQuery("from Employee").getResultList();
			displayEmployees(employees);

			employees = session.createQuery("from Employee s where s.name = 'sejal'").getResultList();
			displayEmployees(employees);

			employees = session.createQuery("from Employee s where s.name = 'sejal' or s.name = 'lolo'")
					.getResultList();
			displayEmployees(employees);

			employees = session.createQuery("from Employee s where s.designation like '%loper'").getResultList();
			displayEmployees(employees);

			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

	private static void displayEmployees(List<Employee> employees) {
		for (Employee tempEmployee : employees) {
			System.out.println(tempEmployee);
		}
	}
}
