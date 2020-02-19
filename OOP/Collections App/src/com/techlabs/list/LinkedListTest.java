package com.techlabs.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();
		create(names);
		read(names);
		update(names);
		read(names);
		delete(names);
		read(names);
		
	}

	public static void create(LinkedList<String> names) {
		System.out.println("Creating------");
		names.add("abc");
		names.add("xyz");
		names.add("mno");
	}

	public static void read(LinkedList<String> names) {
		System.out.println("Reading-------");
		for (Iterator<String> i = names.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

	public static void update(LinkedList<String> names) {
		System.out.println("Updating");
		names.set(0, "def");
	}

	public static void delete(LinkedList<String> names) {
		System.out.println("Deleting-------");
		names.remove(0);
		names.remove("xyz");
	}

}
