package com.techlabs.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {

		HashMap<Integer, String> names = new HashMap<>();
		create(names);
		read(names);
		update(names);
		read(names);
		delete(names);
		read(names);

	}

	public static void create(HashMap<Integer, String> names) {
		System.out.println("Creating------");
		names.put(1, "xyz");
		names.put(2, "abc");
		names.put(3, "mno");
		names.put(4, "mno");
		names.put(4, "def");
	}

	public static void read(HashMap<Integer, String> names) {
		System.out.println("Reading-------");
		for (Map.Entry<Integer, String> entry : names.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue());
		}
	}

	public static void update(HashMap<Integer, String> names) {
		System.out.println("Updating");
		names.replace(1, "pqr");
	}

	public static void delete(HashMap<Integer, String> names) {
		System.out.println("Deleting-------");
		names.remove(1);
	}
}
