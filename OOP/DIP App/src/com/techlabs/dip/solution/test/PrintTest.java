package com.techlabs.dip.solution.test;

import com.techlabs.dip.solution.Human;
import com.techlabs.dip.solution.IPrintable;
import com.techlabs.dip.solution.PrinterConsole;
import com.techlabs.dip.solution.PrinterHtml;

public class PrintTest {

	public static void main(String[] args) {

		Human human = new Human("abc", 20);

		PrinterConsole printerConsole = new PrinterConsole(human);
		PrinterHtml printerHtml = new PrinterHtml(human);
		
		printHumanInfo(printerConsole);
		printHumanInfo(printerHtml);
	}

	public static void printHumanInfo(IPrintable iPrintable) {

		iPrintable.printInfo();
	}

}
