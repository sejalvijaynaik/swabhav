package com.techlabs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.techlabs.model.user.User;

public class UserService {
	private DataSource dataSource;

	public UserService(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<User> getUsers() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		List<User> users = new ArrayList<User>();

		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			res = stmt.executeQuery("select * from users");

			while (res.next()) {
				int id = res.getInt("id");
				String username = res.getString("username");
				String password = res.getString("password");

				User user = new User(id, username, password);
				users.add(user);
			}

			return users;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithStatement(conn, stmt, res);
		}
		return users;
	}

	public User getUser(int id) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		User user = null;

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("select * from users where id = ?");
			pstmt.setInt(1, id);
			res = pstmt.executeQuery();

			while (res.next()) {
				String username = res.getString("username");
				String password = res.getString("password");

				user = new User(id, username, password);
			}

			return user;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
		return user;
	}

	public void updateUser(int id, String username, String password) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("update users set username = ?, password = ? where id = ?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}
	}

	public void deleteUser(int id) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("delete from users where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}

	}

	public void addUser(String username, String password) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement("insert into users(username, password) values(?, ?)");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeWithPreparedStatement(conn, pstmt, res);
		}

	}

	public List<User> searchUsers(String name) {

		List<User> searchUsers = new ArrayList<User>();
		for (User tempUser : getUsers()) {
			if (tempUser.getUsername().contains(name)) {
				searchUsers.add(tempUser);
			}
		}
		return searchUsers;
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
