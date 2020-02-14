package com.techlabs.person.test;

import com.techlabs.person.Person;

public class ToStringTest {
	public static void main(String[] args) {
		Person p1 = new Person("abc", 30);
		System.out.println(p1);
		System.out.println(p1.toString());
	}
}
