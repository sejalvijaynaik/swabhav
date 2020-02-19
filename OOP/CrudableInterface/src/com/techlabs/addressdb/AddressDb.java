package com.techlabs.addressdb;

import com.techlabs.icrudable.ICrudable;

public class AddressDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Address created");
	}

	@Override
	public void read() {
		System.out.println("Address read");
	}

	@Override
	public void update() {
		System.out.println("Address updated");
	}

	@Override
	public void delete() {
		System.out.println("Address deleted");
	}
}
