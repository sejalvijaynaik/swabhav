package com.techlabs.person.test;

import com.techlabs.person.GenderType;
import com.techlabs.person.Person;

public class PersonTest {
	public static void main(String[] args) {
		
		Person person1 = new Person("sejal", 25, GenderType.FEMALE, 152, 50);
		printInfo(person1);
		person1.eat();
		printInfo(person1);
		
		
		Person person2 = new Person("sonam", 26);
		printInfo(person2);
		person2.workout();
		printInfo(person2);
	}
	
	public static void printInfo(Person person) {
		System.out.println("----Person Info----");
		System.out.println("Name :" + person.getName());
		System.out.println("Age :" + person.getAge());
		System.out.println("Gender :" + person.getGender());
		System.out.println("Height :" + person.getHeight());
		System.out.println("Weight :" + person.getWeight());
		person.BmiCalculator();
		System.out.println("BMI Status :" + person.getBmiStatus());
	}
}
