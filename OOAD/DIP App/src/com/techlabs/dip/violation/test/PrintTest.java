package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.Human;
import com.techlabs.dip.violation.PrinterConsole;
import com.techlabs.dip.violation.PrinterHtml;

public class PrintTest {
	
	public static void main(String[] args) {
		
		Human human = new Human("abc", 20);
		
		PrinterConsole printerConsole = new PrinterConsole(human);
		printerConsole.printConsole();
		
		PrinterHtml printerHtml = new PrinterHtml(human);
		printerHtml.printerHtml();
	}

}
