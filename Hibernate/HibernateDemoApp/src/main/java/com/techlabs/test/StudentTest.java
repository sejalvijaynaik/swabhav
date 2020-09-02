package com.techlabs.test;

import com.techlabs.DAO.StudentDAO;

public class StudentTest {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();

		/*
		 * studentDAO.createStuddent("sejal", 4.5f); studentDAO.createStuddent("rachel",
		 * 7.8f); studentDAO.createStuddent("ross", 4.7f);
		 * studentDAO.createStuddent("monica", 8.9f); studentDAO.createStuddent("joey",
		 * 5.8f);
		 */

		// studentDAO.printAllStudents();

		// studentDAO.printStudent("1c4e75a7-5ce6-4f85-ba97-3ae6e0e57025");

		studentDAO.updateStudent("1c4e75a7-5ce6-4f85-ba97-3ae6e0e57025", "sejal naik", 9.0f);

		studentDAO.deleteStudent("1c4e75a7-5ce6-4f85-ba97-3ae6e0e57025");
	}
}
