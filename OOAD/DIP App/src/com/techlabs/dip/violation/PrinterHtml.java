package com.techlabs.dip.violation;

public class PrinterHtml {
	
	private Human human;

	public PrinterHtml(Human human) {
		this.human = human;
	}
	
	public void printerHtml() {
		
		System.out.println("-----Printing on Html-----");
		System.out.println("Human name :" + human.getName());
		System.out.println("Human age :" + human.getAge());
	}

}
