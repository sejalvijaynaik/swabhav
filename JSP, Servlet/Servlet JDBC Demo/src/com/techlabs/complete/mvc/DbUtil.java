package com.techlabs.complete.mvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class DbUtil {

	private DataSource dataSource;

	public DbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Contact> getContacts() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		List<Contact> contacts = new ArrayList<Contact>();

		try {
			conn = dataSource.getConnection();
			System.out.println("connection succesful");
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from contacts");

			while (res.next()) {
				int id = res.getInt("id");
				String firstName = res.getString("first_name");
				String lastName = res.getString("last_name");
				long number = res.getLong("number");
				String email = res.getString("email");

				System.out.print("\n" + id);
				System.out.print(firstName);
				System.out.print(lastName);
				System.out.print(number);
				System.out.print(email);

				Contact contact = new Contact(firstName, lastName, number, email, id);
				contacts.add(contact);
			}

			return contacts;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close(conn, stmt, res);
		}
		return contacts;
	}

	public void close(Connection conn, Statement stmt, ResultSet res) {
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
}
