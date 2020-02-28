package com.techlabs.isp.solution;

public class AverageWoker implements IWorkable, IEatable {

	@Override
	public void eat() {
		System.out.println("Average woker eating");
	}

	@Override
	public void work() {
		System.out.println("Average worker working");
	}
}
