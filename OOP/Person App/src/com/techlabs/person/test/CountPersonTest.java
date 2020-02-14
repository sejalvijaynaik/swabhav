package com.techlabs.person.test;

import com.techlabs.person.Person;

public class CountPersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 15);
		System.out.println(Person.headCount());
		
		Person p2 = new Person("xyz", 20);
		System.out.println(Person.headCount());
		
		Person p3 = new Person("pqr", 25);
		System.out.println(Person.headCount());
	}
}
