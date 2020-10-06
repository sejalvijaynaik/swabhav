package com.techlabs.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.techlabs.student.model.Student;

@Service
public class StudentService {

	private static StudentService studentService = null;
	private List<Student> students;

	private StudentService() {
		students = new ArrayList<Student>();

		addStudent(new Student(null, "sejal", "mumbai", 25));
		addStudent(new Student(null, "ross", "new york", 20));
		addStudent(new Student(null, "monica", "new york", 30));
		addStudent(new Student(null, "rachel", "mumbai", 26));
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

	public Student getStudent(String rollNo) {
		for (Student tempStudent : students) {
			if (tempStudent.getRollNo().equals(rollNo)) {
				return tempStudent;
			}
		}
		return null;
	}

	public void addStudent(Student student) {

		UUID uuid = UUID.randomUUID();
		student.setRollNo(uuid.toString());
		students.add(student);
	}

	public void updateStudent(Student student) {

		for (Student tempStudent : students) {
			if (tempStudent.getRollNo().equals(student.getRollNo())) {
				tempStudent.setName(student.getName());
				tempStudent.setAddress(student.getAddress());
				tempStudent.setAge(student.getAge());
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