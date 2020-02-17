package com.techlabs.savingsaccount;

import com.techlabs.account.AccountInterface;

public class SavingAccountInterface implements AccountInterface {

	private int accNo;
	private String accName;
	protected double balance;
	private static final double MINIMUM_BALANCE = 500.0;

	public SavingAccountInterface(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public int getAccNo() {
		return accNo;
	}

	@Override
	public String getAccName() {
		return accName;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public static double getMinimumBalance() {
		return MINIMUM_BALANCE;
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}

	@Override
	public void withdraw(double amount) {
		if ((balance - amount) >= MINIMUM_BALANCE) {
			balance = balance - amount;
		}
	}
}
