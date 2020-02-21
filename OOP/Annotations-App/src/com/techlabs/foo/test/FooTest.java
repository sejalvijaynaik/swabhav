package com.techlabs.foo.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.tachlabs.Foo.Foo;

public class FooTest {
	public static void main(String[] args) {

		Foo foo = new Foo();

		Class class1 = foo.getClass();
		Method[] methods = class1.getMethods();

		System.out.println("Methods consisting annotation : @RequiredRefactoring");
		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				if(annotation.toString().contains("RequiredRefactoring")) {
					System.out.println("Method name :" + method.getName());
				}
			}
		}
	}
}
