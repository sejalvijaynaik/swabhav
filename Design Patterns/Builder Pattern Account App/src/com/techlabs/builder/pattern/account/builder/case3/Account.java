package com.techlabs.builder.pattern.account.builder.case3;

public class Account {

	private int accNo;
	private String accName;
	private String branch;
	private double balance;
	private float interestRate;
	
	protected Account() {
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public String getBranch() {
		return branch;
	}

	public double getBalance() {
		return balance;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
}
