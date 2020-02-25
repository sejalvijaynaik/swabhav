package com.techlabs.annotations.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.annotation.Foo;
import com.techlabs.annotation.Test;

public class FooTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Foo foo = new Foo();

		Class class1 = foo.getClass();
		Method[] methods = class1.getMethods();

		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				if (annotation.toString().contains("Test")) {
					Test testAnnotation = method.getAnnotation(Test.class);
					System.out.println(testAnnotation.value());
				}
			}
		}
	}
}
