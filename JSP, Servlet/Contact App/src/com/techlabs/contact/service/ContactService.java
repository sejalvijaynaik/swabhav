package com.techlabs.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.contact.model.Contact;

public class ContactService {
	private static ContactService contactService = null;
	private List<Contact> contacts;

	private ContactService() {
		contacts = new ArrayList<Contact>();

		addContact("rachel", "green", 7493748393L, "rachel@gmail.com");
		addContact("ross", "geller", 7294736484L, "ross@gmail.com");
		addContact("monica", "geller", 6798076567L, "monica@gmail.com");
		addContact("phoebe", "buffay", 9087678987L, "phoebe@gmail.com");
		addContact("chandler", "bing", 8976543456L, "chandler@gmail.com");
	}

	public static ContactService getContactService() {
		if (contactService == null) {
			contactService = new ContactService();
		}
		return contactService;
	}

	public List<Contact> getContacts() {
		return contacts;
	}
	public void addContact(String firstName, String lastName, long number, String email) {
		Contact contact = new Contact();
		UUID uuid = UUID.randomUUID();
		
		contact.setId(uuid.toString());
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setNumber(number);
		contact.setEmail(email);
		contacts.add(contact);
	}
	public Contact getContact(String id) {
		for (Contact tempContact : contacts) {
			if (tempContact.getId().equals(id)) {
				return tempContact;
			}
		}
		return null;
	}
	public void updateContact(String id, String firstName, String lastName, long number, String email) {

		for (Contact tempContact : contacts) {
			if (tempContact.getId().equals(id)) {
				tempContact.setFirstName(firstName);
				tempContact.setLastName(lastName);
				tempContact.setNumber(number);
				tempContact.setEmail(email);
				return;
			}
		}
	}
	
	public void deleteContact(String id) {
		for (Contact tempContact : contacts) {
			if (tempContact.getId().equals(id)) {
				contacts.remove(tempContact);
				return;
			}
		}
	}
	
	public List<Contact> searchContacts(String name){
		
		List<Contact> searchContacts = new ArrayList<Contact>();
		for (Contact tempContact : contacts) {
			if (tempContact.getFirstName().contains(name)) {
				searchContacts.add(tempContact);
			}
		}
		return searchContacts;
	}
}
