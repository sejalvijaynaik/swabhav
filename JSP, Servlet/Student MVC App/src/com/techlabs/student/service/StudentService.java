package com.techlabs.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.student.model.Student;

public class StudentService {

	private static StudentService studentService = null;
	private List<Student> students;
	private Student specificId = null;

	private StudentService() {
		students = new ArrayList<Student>();

		addStudent("rachel", "green", "malad", "15/11/1990", 8.9);
		addStudent("ross", "geller", "goregaon", "14/12/1994", 7.2);
		addStudent("monica", "geller", "virar", "06/11/1590", 6.5);
		addStudent("chandler", "bing", "kandivali", "22/08/1995", 9.0);
		addStudent("phoebe", "buffay", "vasai", "11/04/1997", 7.5);
	}
	
	public void setSpecificId(Student student) {
		specificId = student;
	}
	public Student getSpecificId() {
		return specificId;
	}

	public static StudentService getStudentService() {
		if (studentService == null) {
			studentService = new StudentService();

		}
		return studentService;
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudent(String id) {
		for (Student tempStudent : students) {
			if (tempStudent.getId().equals(id)) {
				return tempStudent;
			}
		}
		return null;
	}

	public void addStudent(String firstName, String lastName, String address, String dob, double cgpa) {
		Student student = new Student();
		UUID uuid = UUID.randomUUID();

		student.setId(uuid.toString());
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setAddress(address);
		student.setDob(dob);
		student.setCgpa(cgpa);
		students.add(student);
	}

	public void updateStudent(String id, String firstName, String lastName, String address, String dob, double cgpa) {

		for (Student tempStudent : students) {
			if (tempStudent.getId().equals(id)) {
				tempStudent.setFirstName(firstName);
				tempStudent.setLastName(lastName);
				tempStudent.setAddress(address);
				tempStudent.setCgpa(cgpa);
				return;
			}
		}
	}

	public void deleteStudent(String id) {
		for (Student tempStudent : students) {
			if (tempStudent.getId().equals(id)) {
				students.remove(tempStudent);
				return;
			}
		}
	}

	public List<Student> searchStudents(String name) {

		List<Student> searchStudents = new ArrayList<Student>();
		for (Student tempStudent : students) {
			if (tempStudent.getFirstName().contains(name)) {
				searchStudents.add(tempStudent);
			}
		}
		return searchStudents;
	}

	public void updateCgpa(String id, double cgpa) {
		for (Student tempStudent : students) {
			if (tempStudent.getId().equals(id)) {
				tempStudent.setCgpa(cgpa);
				return;
			}
		}
	}
	public void updateForStudent(String firstName, String lastName, String address, String dob) {
		specificId.setFirstName(firstName);
		specificId.setLastName(lastName);
		specificId.setAddress(address);
		specificId.setDob(dob);
	}
}

