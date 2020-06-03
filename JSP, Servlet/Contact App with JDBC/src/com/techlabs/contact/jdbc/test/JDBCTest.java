package com.techlabs.contact.jdbc.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlabs.contact.model.Contact;
import com.techlabs.contact.service.ContactJDBC;

class JDBCTest {

	@Test
	void getContactsTest() throws SQLException {
		ContactJDBC contactJDBC = new ContactJDBC();
		List<Contact> contacts = contactJDBC.getContacts();

		for (Contact tempContact : contacts) {
			System.out.print(tempContact.getId() + ", ");
			System.out.print(tempContact.getFirstName() + ", ");
			System.out.print(tempContact.getLastName() + ", ");
			System.out.print(tempContact.getNumber() + ", ");
			System.out.print(tempContact.getEmail());
			System.out.println();
		}

	}

	/*@Test
	void getContactTest() throws SQLException {
		ContactJDBC contactJDBC = new ContactJDBC();
		Contact contact = contactJDBC.getContact(3);

		System.out.print(contact.getId() + ", ");
		System.out.print(contact.getFirstName() + ", ");
		System.out.print(contact.getLastName() + ", ");
		System.out.print(contact.getNumber() + ", ");
		System.out.print(contact.getEmail());

	}*/
	
	/*@Test
	void addContactTest() throws SQLException {
		ContactJDBC contactJDBC = new ContactJDBC();
		contactJDBC.addContact("sejal", "naik", 9876543212L, "sejal@gmail.com");
	}*/
	
	/*@Test
	void updateContactTest() throws SQLException {
		ContactJDBC contactJDBC = new ContactJDBC();
		contactJDBC.updateContact(7, "sejal", "naik", 6789876567L, "sejal@gmail.com");
	}*/
	
	/*@Test
	void deleteContactTest() throws SQLException {
		ContactJDBC contactJDBC = new ContactJDBC();
		contactJDBC.deleteContact(8);
	}*/
	
	/*@Test
	void searchContactsTest() throws SQLException {
		ContactJDBC contactJDBC = new ContactJDBC();
		List<Contact> searchContacts = contactJDBC.searchContacts("s");
		
		for(Contact tempContact : searchContacts) {
			System.out.print(tempContact.getId() + ", ");
			System.out.print(tempContact.getFirstName() + ", ");
			System.out.print(tempContact.getLastName() + ", ");
			System.out.print(tempContact.getNumber() + ", ");
			System.out.print(tempContact.getEmail());
			System.out.println();
		}
	}*/
	
	
	
}
