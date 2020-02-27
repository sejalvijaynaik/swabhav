package com.techlabs.isp.violation;

public class SmartWorker implements IWorker {

	@Override
	public void eat() {
		System.out.println("Smart worker eating");
	}

	@Override
	public void work() {
		System.out.println("Smart worker working");
	}
}
