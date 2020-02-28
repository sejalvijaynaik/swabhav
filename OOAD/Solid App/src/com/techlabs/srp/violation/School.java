package com.techlabs.srp.violation;

import java.util.List;

public class School {

	private List<Student> students;

	public School(List<Student> students) {
		this.students = students;
	}

	public Student searchStudent(Student student) {
		for (Student tempStudent : students) {
			if ((tempStudent.getAge() == student.getAge())
					&& (tempStudent.getName().equalsIgnoreCase(student.getName()))
					&& (tempStudent.getRollNo() == student.getRollNo())) {
				return tempStudent;
			}
		}
		return null;
	}
}
