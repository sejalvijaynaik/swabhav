package com.techlabs.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.techlabs.annotation.Foo;

public class FooTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		int passed = 0;
		int failed = 0;
		int testCases = 0;
		boolean result;
		
		Foo foo = new Foo();

		Class class1 = foo.getClass();
		Method[] methods = class1.getMethods();

		for (Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				if (annotation.toString().contains("Test")) {
					testCases++;
					result = (boolean)method.invoke(foo);
					if(result == true) {
						passed++;
					}
					else if (result == false) {
						failed++;
					}
				}
			}
		}
		System.out.println("Total test cases :" + testCases);
		System.out.println("Passed test case :" + passed);
		System.out.println("Failed test case :" + failed);
	
	}
}
