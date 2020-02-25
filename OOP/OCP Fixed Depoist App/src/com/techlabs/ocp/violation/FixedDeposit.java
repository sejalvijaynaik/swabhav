package com.techlabs.ocp.violation;

public class FixedDeposit {

	private int accNo;
	private String name;
	private double amount;
	private double principle;
	private int years;
	private FestivalType festivalType;

	public FixedDeposit(int accNo, String name, double principle, int years, FestivalType festivalType) {
		this.accNo = accNo;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festivalType = festivalType;
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

	public FestivalType getFestivalType() {
		return festivalType;
	}

	public void calculateTotalAmount() {

		if (festivalType.equals(FestivalType.NORMAL)) {
			double simpleInterest = ((principle * 5.0 * years) / 100.0);
			amount = principle + simpleInterest;
			return;
		}
		if (festivalType.equals(FestivalType.DIWALI)) {
			double simpleInterest = ((principle * 10.0 * years) / 100.0);
			amount = principle + simpleInterest;
			return;
		}
		if (festivalType.equals(FestivalType.HOLI)) {
			double simpleInterest = ((principle * 15.0 * years) / 100.0);
			amount = principle + simpleInterest;
			return;
		}
	}
}
