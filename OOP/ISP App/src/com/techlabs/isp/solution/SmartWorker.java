package com.techlabs.isp.solution;

public class SmartWorker implements IWorkable, IEatable {

	@Override
	public void eat() {
		System.out.println("Smart worker eating");
	}

	@Override
	public void work() {
		System.out.println("Smart worker working");
	}
}
