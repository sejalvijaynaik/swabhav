package com.techlabs.test;

import java.io.*;

import com.techlabs.person.Person;

public class DeserializationTest {
	public static void main(String[] args) throws Exception {
		
		
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

	private static void readPerson() throws Exception {
		FileInputStream filePerson = new FileInputStream("person bin/person.txt");
		ObjectInputStream inPerson = new ObjectInputStream(filePerson);

		Person person = (Person)inPerson.readObject();
		printInfo(person);
		
		inPerson.close();
		filePerson.close();
	}
	
	private static void readPeople() throws Exception {
		FileInputStream filePeople = new FileInputStream("person bin/people.txt");
		ObjectInputStream inPeople = new ObjectInputStream(filePeople);

		Person[] people = (Person[]) inPeople.readObject();
		System.out.println("----Printing array objects----");
		for (Person tempPerson : people) {
			printInfo(tempPerson);
		}
		inPeople.close();
		filePeople.close();
	}
}
