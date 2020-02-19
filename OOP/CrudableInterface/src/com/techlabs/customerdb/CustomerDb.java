package com.techlabs.customerdb;

import com.techlabs.icrudable.ICrudable;

public class CustomerDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Customer created");
	}

	@Override
	public void read() {
		System.out.println("Customer read");
	}

	@Override
	public void update() {
		System.out.println("Customer updated");
	}

	@Override
	public void delete() {
		System.out.println("Customer deleted");
	}
}
