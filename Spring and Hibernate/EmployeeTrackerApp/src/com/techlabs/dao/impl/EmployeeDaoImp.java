package com.techlabs.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.techlabs.dao.EmployeeDao;
import com.techlabs.entities.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Employee> getEmployees() {

		Session currentSession = sessionFactory.getCurrentSession();

		List<Employee> employees = currentSession.createQuery("from Employee").getResultList();

		return employees;

	}

	@Override
	public void addEmployee(Employee employee) {

		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(employee);
	}

	@Override
	public Employee getEmployee(int employeeId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Employee employee = currentSession.get(Employee.class, employeeId);

		return employee;

	}

	@Override
	public void deleteEmployee(int employeeId) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query myQuery = currentSession.createQuery("delete from Employee where id=:employeeId");

		myQuery.setParameter("employeeId", employeeId);

		myQuery.executeUpdate();
	}

	@Override
	public List<Employee> searchEmployees(String searchName) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query myQuery = null;

		if (searchName != null && (searchName.trim().length() > 0)) {

			myQuery = currentSession.createQuery("from Employee where lower(name) like:searchName");

			myQuery.setParameter("searchName", "%" + searchName.toLowerCase() + "%");

		}

		else {

			myQuery = currentSession.createQuery("from Employee", Employee.class);
		}

		List<Employee> employees = myQuery.getResultList();

		return employees;

	}

}
