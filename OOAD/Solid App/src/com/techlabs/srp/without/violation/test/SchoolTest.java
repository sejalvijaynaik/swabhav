package com.techlabs.srp.without.violation.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.srp.violation.School;
import com.techlabs.srp.violation.Student;

public class SchoolTest {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(1, "abc", 10);
		Student student2 = new Student(2, "xyz", 11);
		Student student3 = new Student(3, "mno", 12);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		School school = new School(students);
		
		Student findStudent = new Student(1, "abc", 10);
		
		Student foundStudent = school.searchStudent(findStudent);
		
		if(foundStudent == null) {
			System.out.println("no such student found");
			return;
		}
		System.out.println("Student found");
	}
}
