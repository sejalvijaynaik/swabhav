package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice1 = new Invoice(1, "abc", 200.0, 5f, 10f);

		invoice1.calculateGstAmount();
		invoice1.calculateDiscountAmount();
		invoice1.printInfo();
	}
}
