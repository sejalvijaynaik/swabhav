package com.techlabs.test;

import java.io.*;

import com.techlabs.person.GenderType;
import com.techlabs.person.Person;

public class SerializationTest {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream filePerson = new FileOutputStream("person bin/person.txt");
		ObjectOutputStream outPerson = new ObjectOutputStream(filePerson);
		
		Person person1 = new Person("sejal", 25, GenderType.FEMALE, 152, 50);
		person1.eat();
		
		outPerson.writeObject(person1);
		
		FileOutputStream filePeople = new FileOutputStream("person bin/people.txt");
		ObjectOutputStream outPeople = new ObjectOutputStream(filePeople);
		
		Person person2 = new Person("sonam", 26);
		person2.workout();
		
		Person person3 = new Person("lisha", 27);
		person3.eat();
		
		Person[] people = {person1, person2, person3};
		
		outPeople.writeObject(people);
		
		outPerson.close();
		outPeople.close();
		filePerson.close();
		filePeople.close();
	}
}
