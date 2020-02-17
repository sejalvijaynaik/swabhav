package com.techlabs.comparators;

import java.util.Comparator;
import com.techlabs.student.Student;

public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getAge() - student2.getAge();
 	}
}
