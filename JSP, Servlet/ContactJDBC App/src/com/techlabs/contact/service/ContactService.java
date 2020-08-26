package com.techlabs.contact.service;

import java.util.List;
import javax.annotation.Resource;
import javax.sql.DataSource;
import com.techlabs.contact.dao.ContactDAO;
import com.techlabs.contact.model.Contact;

public class ContactService {

	private ContactDAO contactDAO;

	public ContactService() {

		contactDAO = new ContactDAO();
	}

	public List<Contact> getContacts() {

		return contactDAO.getContacts();
	}

	public Contact getContact(int id) {

		return contactDAO.getContact(id);
	}

	public void updateContact(int id, String firstName, String lastName, long number, String email) {

		contactDAO.updateContact(id, firstName, lastName, number, email);
	}

	public void deleteContact(int id) {

		contactDAO.deleteContact(id);
	}

	public void addContact(String firstName, String lastName, long number, String email) {

		contactDAO.addContact(firstName, lastName, number, email);
	}

	public List<Contact> searchContacts(String name) {

		return contactDAO.searchContacts(name);
	}

}
