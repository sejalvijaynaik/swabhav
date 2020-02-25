package com.techlabs.ocp.solution;

public class FixedDeposit {

	private int accNo;
	private String name;
	private double amount;
	private double principle;
	private int years;

	public FixedDeposit(int accNo, String name, double principle, int years) {
		this.accNo = accNo;
		this.name = name;
		this.principle = principle;
		this.years = years;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}

	public void calculateTotalAmount(IFestivalRate iFestivalRate) {

		double simpleInterest = ((principle * iFestivalRate.getRate() * years) / 100.0);
		amount = principle + simpleInterest;
		return;

	}
}
