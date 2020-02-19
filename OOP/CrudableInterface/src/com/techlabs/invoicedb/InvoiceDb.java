package com.techlabs.invoicedb;

import com.techlabs.icrudable.ICrudable;

public class InvoiceDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Invoice created");
	}

	@Override
	public void read() {
		System.out.println("Invoice read");
	}

	@Override
	public void update() {
		System.out.println("Invoice updated");
	}

	@Override
	public void delete() {
		System.out.println("Invoice deleted");
	}
}
