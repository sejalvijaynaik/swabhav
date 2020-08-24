package com.techlabs.service;

import java.util.List;
import com.techlabs.dao.StudentDao;
import com.techlabs.model.Student;

public class StudentService {

	private StudentDao studentDao;

	public StudentService() {

		studentDao = StudentDao.getStudentService();
	}

	public Student getStudent(String rollNo) {

		return studentDao.getStudent(rollNo);
	}

	public List<Student> getStudents() {

		return studentDao.getStudents();
	}

	public void addStudent(String name, String address, int age) {

		studentDao.addStudent(name, address, age);
	}

	public void updateStudent(String rollNo, String name, String address, int age) {

		studentDao.updateStudent(rollNo, name, address, age);
	}

	public void deleteStudent(String rollNo) {

		studentDao.deleteStudent(rollNo);
	}

	public List<Student> searchStudents(String name) {

		return studentDao.searchStudents(name);
	}
}
