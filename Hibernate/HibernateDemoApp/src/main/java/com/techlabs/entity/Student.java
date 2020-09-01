package com.techlabs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private int id;
	private String name;
	private float cgpa;

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public Student() {
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {

		return this.id + " " + this.name + " " + this.cgpa;
	}
}
