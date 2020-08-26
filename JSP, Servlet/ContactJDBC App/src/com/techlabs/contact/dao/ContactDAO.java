package com.techlabs.contact.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.techlabs.contact.model.Contact;

public class ContactDAO {

	public List<Contact> getContacts() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		List<Contact> contacts = new ArrayList<Contact>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from contacts");

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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithStatement(conn, stmt, res);
		}
		return contacts;
	}

	public Contact getContact(int id) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		Contact contact = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "root");
			pstmt = conn.prepareStatement("select * from contacts where id = ?");
			pstmt.setInt(1, id);
			res = pstmt.executeQuery();

			while (res.next()) {
				String firstName = res.getString("first_name");
				String lastName = res.getString("last_name");
				long number = res.getLong("number");
				String email = res.getString("email");

				contact = new Contact(firstName, lastName, number, email, id);
			}

			return contact;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
		return contact;
	}

	public void updateContact(int id, String firstName, String lastName, long number, String email) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "root");
			pstmt = conn.prepareStatement(
					"update contacts set first_name = ?, last_name = ?, number = ?, email = ? where id = ?");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setLong(3, number);
			pstmt.setString(4, email);
			pstmt.setInt(5, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		closeWithPreparedStatement(conn, pstmt, res);
	}

	public void deleteContact(int id) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "root");
			pstmt = conn.prepareStatement("delete from contacts where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		closeWithPreparedStatement(conn, pstmt, res);
	}

	public void addContact(String firstName, String lastName, long number, String email) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "root");
			pstmt = conn
					.prepareStatement("insert into contacts(first_name, last_name, number, email) values(?, ?, ?, ?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setLong(3, number);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		closeWithPreparedStatement(conn, pstmt, res);
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

	public void closeWithStatement(Connection conn, Statement stmt, ResultSet res) {
		try {
			if (res != null) {
				res.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeWithPreparedStatement(Connection conn, PreparedStatement pstmt, ResultSet res) {
		try {
			if (res != null) {
				res.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
