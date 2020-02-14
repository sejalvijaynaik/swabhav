package com.techlabs.propertyfiletest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileTest {
	public static void main(String[] args) throws Exception {
		String keyString;
		Properties properties = new Properties();

		FileReader fr = new FileReader(new File("Config.properties"));
		properties.load(fr);

		Set keys = properties.keySet();
		Iterator it = keys.iterator();

		while (it.hasNext()) {
			keyString = (String)it.next();
			System.out.println(keyString + " : " + properties.getProperty(keyString));
		}
	}
}
