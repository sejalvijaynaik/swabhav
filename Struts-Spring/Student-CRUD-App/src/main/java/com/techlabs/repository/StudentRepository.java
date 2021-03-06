package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {

	private static StudentRepository studentService = null;
	private List<Student> students;

	private StudentRepository() {
		students = new ArrayList<Student>();

		addStudent("sejal", "mumbai", 25);
		addStudent("ross", "new york", 20);
		addStudent("monica", "new york", 30);
		addStudent("rachel", "mumbai", 26);
	}

	public static StudentRepository getStudentService() {
		if (studentService == null) {
			studentService = new StudentRepository();

		}
		return studentService;
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student getStudent(String rollNo) {
		for (Student tempStudent : students) {
			if (tempStudent.getRollNo().equals(rollNo)) {
				return tempStudent;
			}
		}
		return null;
	}

	public void addStudent(String name, String address, int age) {

		UUID uuid = UUID.randomUUID();
		Student student = new Student(uuid.toString(), name, address, age);
		students.add(student);
	}

	public void updateStudent(String rollNo, String name, String address, int age) {

		for (Student tempStudent : students) {
			if (tempStudent.getRollNo().equals(rollNo)) {
				tempStudent.setName(name);
				tempStudent.setAddress(address);
				tempStudent.setAge(age);
				return;
			}
		}
	}

	public void deleteStudent(String rollNo) {
		for (Student tempStudent : students) {
			if (tempStudent.getRollNo().equals(rollNo)) {
				students.remove(tempStudent);
				return;
			}
		}
	}

	public List<Student> searchStudents(String name) {

		List<Student> searchStudents = new ArrayList<Student>();
		for (Student tempStudent : students) {
			if (tempStudent.getName().contains(name)) {
				searchStudents.add(tempStudent);
			}
		}
		return searchStudents;
	}
}