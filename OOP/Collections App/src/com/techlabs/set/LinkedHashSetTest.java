package com.techlabs.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {

		LinkedHashSet<String> names = new LinkedHashSet<>();
		create(names);
		read(names);
		update(names);
		read(names);
		delete(names);
		read(names);
		
	}

	public static void create(LinkedHashSet<String> names) {
		System.out.println("Creating------");
		names.add("xyz");
		names.add("abc");
		names.add("mno");
		names.add("mno");
	}

	public static void read(LinkedHashSet<String> names) {
		System.out.println("Reading-------");
		for (Iterator<String> i = names.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public static void update(LinkedHashSet<String> names) {
		System.out.println("Updating");
		if(names.contains("abc")) {
			names.remove("abc");
			names.add("pqr");
		}
	}

	public static void delete(LinkedHashSet<String> names) {
		System.out.println("Deleting-------");
		names.remove("xyz");
	}
}
