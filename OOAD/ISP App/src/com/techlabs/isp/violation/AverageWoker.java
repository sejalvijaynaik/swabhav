package com.techlabs.isp.violation;

public class AverageWoker implements IWorker {

	@Override
	public void eat() {
		System.out.println("Average woker eating");
	}

	@Override
	public void work() {
		System.out.println("Average worker working");
	}
}
