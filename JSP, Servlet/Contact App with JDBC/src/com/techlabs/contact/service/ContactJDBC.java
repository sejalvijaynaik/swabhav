package com.techlabs.contact.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techlabs.contact.model.Contact;

public class ContactJDBC {

	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet res = null;
	List<Contact> contacts = null;

	public ContactJDBC(DataSource dataSource) {
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		contacts = new ArrayList<Contact>();
	}

	public List<Contact> getContacts() {
		try {
			stmt = conn.prepareStatement("select * from contacts");
			res = stmt.executeQuery();

			while (res.next()) {
				int id = res.getInt("id");
				String firstName = res.getString("first_name");
				String lastName = res.getString("last_name");
				long number = res.getLong("number");
				String email = res.getString("email");
				Contact contact = new Contact(firstName, lastName, number, email, id);
				contacts.add(contact);
				
			}
			return contacts;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Contact getContact(int id) {
		try {
			stmt = conn.prepareStatement("select * from contacts where id = ?");
			stmt.setInt(1, id);
			res = stmt.executeQuery();

			res.next();

			String firstName = res.getString("first_name");
			String lastName = res.getString("last_name");
			long number = res.getLong("number");
			String email = res.getString("email");
			Contact contact = new Contact(firstName, lastName, number, email, id);
			return contact;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void addContact(String firstName, String lastName, long number, String email) {

		try {
			stmt = conn
					.prepareStatement("insert into contacts(first_name, last_name, number, email) values(?, ?, ?, ?)");
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setLong(3, number);
			stmt.setString(4, email);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateContact(int id, String firstName, String lastName, long number, String email) {

		try {
			stmt = conn.prepareStatement(
					"update contacts set first_name = ?, last_name = ?, number = ?, email = ? where id = ?");
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setLong(3, number);
			stmt.setString(4, email);
			stmt.setInt(5, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteContact(int id) {
		try {
			stmt = conn.prepareStatement("delete from contacts where id = ?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Contact> searchContacts(String name) {

		List<Contact> searchContacts = new ArrayList<Contact>();
		for (Contact tempContact : getContacts()) {
			if (tempContact.getFirstName().contains(name)) {
				searchContacts.add(tempContact);
			}
		}
		return searchContacts;
	}
}
