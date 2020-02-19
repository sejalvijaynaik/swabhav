package com.techlabs.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {

		HashSet<String> names = new HashSet<>();
		create(names);
		read(names);
		update(names);
		read(names);
		delete(names);
		read(names);

	}

	public static void create(HashSet<String> names) {
		System.out.println("Creating------");
		names.add("abc");
		names.add("xyz");
		names.add("mno");
		names.add("mno");
	}

	public static void read(HashSet<String> names) {
		System.out.println("Reading-------");
		for (Iterator<String> i = names.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public static void update(HashSet<String> names) {
		System.out.println("Updating");
		if (names.contains("abc")) {
			names.remove("abc");
			names.add("def");
		}
	}

	public static void delete(HashSet<String> names) {
		System.out.println("Deleting-------");
		names.remove("xyz");
	}
}
