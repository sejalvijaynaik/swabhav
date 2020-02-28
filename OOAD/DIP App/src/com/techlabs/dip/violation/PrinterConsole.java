package com.techlabs.dip.violation;

public class PrinterConsole {

	private Human human;

	public PrinterConsole(Human human) {
		this.human = human;
	}

	public void printConsole() {
		
		System.out.println("-----Printing on console-----");
		System.out.println("Human name :" + human.getName());
		System.out.println("Human age :" + human.getAge());
	}

}
