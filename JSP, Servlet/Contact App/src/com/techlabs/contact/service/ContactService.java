package com.techlabs.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.contact.model.Contact;

public class ContactService {
	private static ContactService contactService = null;
	private List<Contact> employees;

	private ContactService() {
		employees = new ArrayList<Contact>();

		addEmployee("abc", 20000, "manager");
		addEmployee("xyz", 30000, "president");
		addEmployee("mno", 10000, "developer");
		addEmployee("def", 30000, "manager");
		addEmployee("ghi", 10000, "developer");
	}

	public static ContactService getEmployeeService() {
		if (contactService == null) {
			contactService = new ContactService();

		}
		return contactService;
	}

	public List<Contact> getEmployees() {
		return employees;
	}
	public void addEmployee(String name, int salary, String designation) {
		Contact employee = new Contact();
		UUID uuid = UUID.randomUUID();
		
		employee.setId(uuid.toString());
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		employees.add(employee);
	}
}
