package com.techlabs.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<>();
		create(names);
		read(names);
		update(names);
		read(names);
		delete(names);
		read(names);
		
	}

	public static void create(TreeSet<String> names) {
		System.out.println("Creating------");
		names.add("xyz");
		names.add("abc");
		names.add("mno");
		names.add("mno");
	}

	public static void read(TreeSet<String> names) {
		System.out.println("Reading-------");
		for (Iterator<String> i = names.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public static void update(TreeSet<String> names) {
		System.out.println("Updating");
		if(names.contains("abc")) {
			names.remove("abc");
			names.add("pqr");
		}
	}

	public static void delete(TreeSet<String> names) {
		System.out.println("Deleting-------");
		names.remove("xyz");
	}
}
