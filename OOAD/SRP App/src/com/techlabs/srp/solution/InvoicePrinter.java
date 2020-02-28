package com.techlabs.srp.solution;

public class InvoicePrinter {

	private Invoice invoice;

	public InvoicePrinter(Invoice invoice2) {
		this.invoice = invoice2;
	}

	public void printInfo() {

		System.out.println("Id :" + invoice.getId());
		System.out.println("Name :" + invoice.getName());
		System.out.println("Total Cost :" + invoice.getAmount());
	}
}
