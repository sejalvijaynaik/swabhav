package com.techlabs.person.test;

import com.techlabs.person.Person;

public class EqualityTest {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 50);
		Person p2 = new Person("abc", 50);
		
		System.out.println(p1 == p1);
		System.out.println(p1 == p2);
		
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
	}
}
