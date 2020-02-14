package com.techlabs.person.test;

import com.techlabs.person.Person;
import java.lang.reflect.*;

public class PersonReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Person p1 = new Person("abc", 25);
		
		Class class1 = p1.getClass();
		System.out.println("Name of the class :" + class1.getName());
		
		Constructor constructor = class1.getConstructor(String.class, Integer.TYPE);
		System.out.println("The constructor is :" + constructor.getName());
		
		Method[] methods = class1.getMethods();
				
		for(Method method : methods) {
			System.out.println("Method name :" + method.getName());
		}
	}
}
