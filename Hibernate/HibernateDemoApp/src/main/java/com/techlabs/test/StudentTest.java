package com.techlabs.test;

import com.techlabs.DAO.StudentDAO;

public class StudentTest {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();

		studentDAO.printStudent(1);
		studentDAO.deleteStudent(1);
		studentDAO.printStudent(1);
	}
}
