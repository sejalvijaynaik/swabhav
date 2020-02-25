package com.techlabs.srp.solution;

public class Invoice {

	private int id;
	private String name;
	private double amount;
	private float discountPercent;
	private float gstPercent;

	public Invoice(int id, String name, double amount, float discountPercent, float gstPercent) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.discountPercent = discountPercent;
		this.gstPercent = gstPercent;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public void calculateGstAmount() {

		amount = amount + (gstPercent / 100f * amount);
	}

	public void calculateDiscountAmount() {

		amount = amount - (discountPercent / 100f * amount);
	}

	
}
