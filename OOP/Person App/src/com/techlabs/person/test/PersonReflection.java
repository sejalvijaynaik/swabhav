package com.techlabs.person.test;

import com.techlabs.person.Person;
import java.lang.reflect.*;

public class PersonReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Person p1 = new Person("abc", 25);

		Class class1 = p1.getClass();
		System.out.println("Name of the class :" + class1.getName());

		constructorInfo(class1);

		Method[] methods = class1.getMethods();
		methodInfo(methods);
		gettersInfo(methods);
		settersInfo(methods);
	}

	public static void constructorInfo(Class class1) {

		Constructor[] allConstructor = class1.getDeclaredConstructors();
		for (int i = 0; i < allConstructor.length; i++) {
			System.out.println("The constructor is :" + allConstructor);
		}
	}

	public static void methodInfo(Method[] methods) {

		for (Method method : methods) {
			System.out.println("Method name :" + method.getName());
		}
	}

	public static void gettersInfo(Method[] methods) {
		for (Method method : methods) {
			if (method.getName().startsWith("get")) {
				System.out.println("getter :" + method.getName());
			}
		}
	}

	public static void settersInfo(Method[] methods) {
		for (Method method : methods) {
			if (method.getName().startsWith("set")) {
				System.out.println("setter :" + method.getName());
			}
		}
	}
}
