package com.techlabs.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.techlabs.entity.Department;
import com.techlabs.entity.Employee;

public class AppTest {

	public static void main(String[] args) {

		Department d1 = new Department();
		d1.setId(1);
		d1.setName("IT");

		Department d2 = new Department();
		d2.setId(2);
		d2.setName("HR");

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("sejal");
		e1.setDept(d1);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("ross");
		e2.setDept(d1);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("rachel");
		e3.setDept(d2);

		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("joey");
		e4.setDept(d2);

		Set<Employee> employees1 = new HashSet<Employee>();
		employees1.add(e1);
		employees1.add(e2);

		Set<Employee> employees2 = new HashSet<Employee>();
		employees2.add(e3);
		employees2.add(e4);

		d1.setEmployees(employees1);
		d2.setEmployees(employees2);

		Configuration configConfiguration = new Configuration();
		SessionFactory sessionFactory = configConfiguration.configure("hibernate.cfg.xml").buildSessionFactory();
		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {

			transaction = session.beginTransaction();
			Department department = (Department) session.get(Department.class, 1);
			session.delete(department);
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
		} finally {
			session.close();
		}

	}

	public static void printDepartments(Session session) {

		Criteria criteria = session.createCriteria(Department.class);
		List<Department> departments = criteria.list();

		for (Department department : departments) {
			System.out.println(department);
		}

	}

}
