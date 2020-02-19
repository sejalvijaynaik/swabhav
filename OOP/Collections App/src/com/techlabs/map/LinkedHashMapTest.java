package com.techlabs.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> names = new LinkedHashMap<>();
		create(names);
		read(names);
		update(names);
		read(names);
		delete(names);
		read(names);

	}

	public static void create(LinkedHashMap<Integer, String> names) {
		System.out.println("Creating------");
		names.put(3, "mno");
		names.put(1, "xyz");
		names.put(4, "mno");
		names.put(2, "abc");
		names.put(4, "def");
	}

	public static void read(LinkedHashMap<Integer, String> names) {
		System.out.println("Reading-------");
		for (Map.Entry<Integer, String> entry : names.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue());
		}
	}

	public static void update(LinkedHashMap<Integer, String> names) {
		System.out.println("Updating");
		names.replace(1, "pqr");
	}

	public static void delete(LinkedHashMap<Integer, String> names) {
		System.out.println("Deleting-------");
		names.remove(1);
	}
}
