package com.techlabs.student.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.student.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student1 = new Student(2, "abc", 10);
		Student student2 = new Student(1, "xyz", 12);
		Student student3 = new Student(4, "pqr", 15);
		Student student4 = new Student(3, "mno", 9);

		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		Collections.sort(students);
		
		for(Student student : students) {
			System.out.println("----Student Info----");
			System.out.println("RollNo :" + student.getRollNo());
			System.out.println("Name :" + student.getName());
			System.out.println("Age :" + student.getAge());
		}
	}
}
