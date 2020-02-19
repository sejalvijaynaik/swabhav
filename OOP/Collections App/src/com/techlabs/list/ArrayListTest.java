package com.techlabs.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		create(names);
		read(names);
		update(names);
		read(names);
		delete(names);
		read(names);
		
	}

	public static void create(ArrayList<String> names) {
		System.out.println("Creating------");
		names.add("abc");
		names.add("xyz");
		names.add("mno");
	}

	public static void read(ArrayList<String> names) {
		System.out.println("Reading-------");
		for (Iterator<String> i = names.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public static void update(ArrayList<String> names) {
		System.out.println("Updating");
		names.set(0, "def");
	}

	public static void delete(ArrayList<String> names) {
		System.out.println("Deleting-------");
		names.remove(0);
		names.remove("xyz");
	}
}
