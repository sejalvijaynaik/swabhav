package com.techlabs.currentaccount;

import com.techlabs.account.AccountInterface;

public class CurrentAccountInterface implements AccountInterface {

	private int accNo;
	private String accName;
	protected double balance;

	public CurrentAccountInterface(int accNo, String accName, double balance) {
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

	private static final double MINIMUM_BALANCE = -5000.0;

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
	}

	@Override
	public void withdraw(double amount) {
		if ((balance - amount) >= (MINIMUM_BALANCE)) {
			balance = balance - amount;
		}
	}
}
