package com.techlabs.srp.without.violation;

import java.util.List;

public class School {

	private List<Student> students;

	public School(List<Student> students) {
		this.students = students;
	}

	public Student searchStudent(Student student) {
		for (Student tempStudent : students) {
			if (tempStudent.matches(student)) {
				return tempStudent;
			}
		}
		return null;
	}
}
