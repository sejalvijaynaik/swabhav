package com.techlabs.contact.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.spi.ResolveResult;

public class ContactJDBC {
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResolveResult res = null;
	
	public ContactJDBC() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav", "root", "root");
	}
	
	

}
