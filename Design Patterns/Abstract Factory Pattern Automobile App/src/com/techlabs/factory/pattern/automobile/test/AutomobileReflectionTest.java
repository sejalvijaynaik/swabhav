package com.techlabs.factory.pattern.automobile.test;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class AutomobileReflectionTest {
	public static void main(String[] args) throws Exception {
		
		Properties properties = new Properties();

		FileReader fr = new FileReader(new File("resources/fact.properties"));
		properties.load(fr);
		
		String className = (String) properties.get("factory");
		
		Class class1 = Class.forName(className);
		Object object = class1.newInstance();
		
		Method[] methods = class1.getMethods();
		methods[0].invoke(object);
		methods[1].invoke(object);
		
		
		
	}
}
