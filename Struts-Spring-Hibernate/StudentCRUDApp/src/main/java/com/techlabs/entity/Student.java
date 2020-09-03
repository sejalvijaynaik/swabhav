package com.techlabs.entity;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Student {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	private UUID rollNo;
	private String name;
	private String address;
	private int age;

	public Student() {
	}

	public Student(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Student(UUID rollNo, String name, String address, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public UUID getRollNo() {
		return rollNo;
	}

	public void setRollNo(UUID rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
