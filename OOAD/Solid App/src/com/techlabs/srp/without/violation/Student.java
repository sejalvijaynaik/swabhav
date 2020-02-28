package com.techlabs.srp.without.violation;

public class Student {

	private int rollNo;
	private String name;
	private int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean matches(Student student) {
		if ((this.age == student.age) && (this.name.equalsIgnoreCase(student.name))
				&& (this.rollNo == student.rollNo)) {
			return true;
		}
		return false;
	}
}
