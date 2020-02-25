package com.techlabs.account;

public class Account {
	private int accNo;
	private String accName;
	private double balance;

	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}

	public Account(int accNo, String accName) {
		this.accNo = accNo;
		this.accName = accName;
		balance = 1000.0;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if ((balance - amount) >= 500) {
			balance = balance - amount;
		}
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
}
