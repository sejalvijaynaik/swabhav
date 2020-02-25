package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.Invoice;
import com.techlabs.srp.solution.InvoicePrinter;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(1, "abc", 200.0, 5f, 10f);

		invoice.calculateGstAmount();
		invoice.calculateDiscountAmount();
		
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
		
		invoicePrinter.printInfo();
	}
}
