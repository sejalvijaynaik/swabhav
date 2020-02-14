package com.techlabs.contact.options;

import java.io.*;
import java.util.*;

import com.techlabs.contact.Contact;

public class ContactManager {

	private List<Contact> contacts;

	public ContactManager() throws Exception {
		this.contacts = loadContacts();
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public int getCount() throws Exception {
		return contacts.size();
	}

	public void addContact(String name, long number) throws Exception {
		Contact contact = new Contact(name, number);
		contacts.add(contact);
		saveContacts();
	}

	public List<Contact> searchContact(String name) throws Exception {
		List<Contact> matchingContacts = new ArrayList<Contact>();
		for (Contact tempContact : contacts) {
			if (tempContact.getName().equals(name))
				matchingContacts.add(tempContact);
		}
		return matchingContacts;
	}

	public void removeContact(String name) throws Exception {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equalsIgnoreCase(name)) {
				contacts.remove(i);
				saveContacts();
				return;
			}
		}
	}

	private void saveContacts() throws Exception {
		Collections.sort(contacts);
		FileOutputStream file = new FileOutputStream("Contact list/contacts.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(contacts);

		out.close();
		file.close();
	}

	private List<Contact> loadContacts() throws Exception {
		File file = new File("Contact list/contacts.txt");
		if (!(file.exists())) {
			return new ArrayList<Contact>();
		}
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fileInputStream);

		List<Contact> contacts = (ArrayList<Contact>) in.readObject();

		in.close();
		fileInputStream.close();
		return contacts;
	}
}
