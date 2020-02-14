package com.techlabs.contact;

import java.io.Serializable;

public class Contact implements Serializable, Comparable<Contact>  {
	private String name;
	private long number;
	
	public Contact(String name, long number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public int compareTo(Contact contact) {
		return this.name.compareTo(contact.name);
	}
}
