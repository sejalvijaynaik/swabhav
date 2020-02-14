package com.techlabs.contact.presentation;

import java.util.List;
import java.util.Scanner;

import com.techlabs.contact.Contact;
import com.techlabs.contact.options.ContactManager;

public class ContactConsole {

	private final static int CONTACT_LIMIT = 3;
	private int optionNum = 1;
	private String optionInString;
	private Scanner input = new Scanner(System.in);
	private List<Contact> contacts;
	private ContactManager contactManager;
	private int count;

	public ContactConsole() throws Exception {
		contactManager = new ContactManager();
	}

	public void start() throws Exception {

		while ((optionNum > 0) && (optionNum <= 4)) {
			System.out.println("1. Display");
			System.out.println("2. Add Contact");
			System.out.println("3. Search");
			System.out.println("4. Remove");
			System.out.println("5. Exit");

			optionInString = input.nextLine();
			optionNum = Integer.parseInt(optionInString);

			if (optionNum == 1) {
				count = contactManager.getCount();
				if (count == 0) {
					System.out.println("Sorry no contacts for diplay");
					continue;
				}
				contacts = contactManager.getContacts();
				for (Contact tempContact : contacts) {
					System.out.println("----Contact Info----");
					System.out.println("Name " + tempContact.getName());
					System.out.println("Number :" + tempContact.getNumber() + "\n");
				}
				continue;
			}
			if (optionNum == 2) {
				count = contactManager.getCount();
				if (count == CONTACT_LIMIT) {
					System.out.println("Sorry, we cannot add any more objects beyound the limit of " + CONTACT_LIMIT);
					continue;
				}
				System.out.println("Enter the name");
				String name = input.nextLine();

				System.out.println("Enter the number");
				String numberInString = input.nextLine();
				long number = Long.parseLong(numberInString);

				contactManager.addContact(name, number);
				System.out.println("Contact added");
				continue;
			}
			if (optionNum == 3) {
				count = contactManager.getCount();
				if (count == 0) {
					System.out.println("Sorry there are no contacts");
					continue;
				}
				System.out.println("Enter the name to be serached by");
				String name = input.nextLine();
				List<Contact> matchingContacts = contactManager.searchContact(name);
				if (matchingContacts.isEmpty()) {
					System.out.println("Sorry, there are no matching contacts");
					continue;
				}
				System.out.println("List of matching contacts");
				listContacts(matchingContacts);
			}
			if (optionNum == 4) {
				count = contactManager.getCount();
				if (count == 0) {
					System.out.println("Sorry there are no contacts");
					continue;
				}
				System.out.println("Enter the name to be removed");
				String name;
				name = input.nextLine();

				List<Contact> matchingContacts = contactManager.searchContact(name);
				matchingContacts = contactManager.searchContact(name);
				if (matchingContacts.size() == 1) {
					contactManager.removeContact(name);
					System.out.println("Contact removed");
					continue;
				}
				System.out.println("List of matching contacts with name as :" + name);
				listContacts(matchingContacts);
				System.out.println("Enter the number to be removed");
				String numberInString = input.nextLine();
				long number = Long.parseLong(numberInString);
				for (int i = 0; i < matchingContacts.size(); i++) {
					if (matchingContacts.get(i).getNumber() == number) {
						name = matchingContacts.get(i).getName();
						break;
					}
				}
				contactManager.removeContact(name);
				System.out.println("Contact removed");
				continue;
			}
			if (optionNum == 5) {
				return;
			}
		}
	}

	public void listContacts(List<Contact> matchingContacts) {
		for (Contact tempContact : matchingContacts) {
			System.out.println("----Contact Info----");
			System.out.println("Name " + tempContact.getName());
			System.out.println("Number :" + tempContact.getNumber() + "\n");
		}
	}
}
