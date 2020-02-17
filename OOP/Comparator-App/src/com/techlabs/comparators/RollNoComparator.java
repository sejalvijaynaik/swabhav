package com.techlabs.comparators;

import java.util.Comparator;
import com.techlabs.student.Student;

public class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getRollNo() - student2.getRollNo();
	}
}
