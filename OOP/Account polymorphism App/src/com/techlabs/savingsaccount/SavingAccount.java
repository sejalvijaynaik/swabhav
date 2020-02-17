package com.techlabs.savingsaccount;

import com.techlabs.account.Account;

public class SavingAccount extends Account {
	
	private static final double MINIMUM_BALANCE = 500.0;

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	@Override
	public void withdraw(double amount) {
		if ((balance - amount) >= MINIMUM_BALANCE) {
			balance = balance - amount;
		}
	}
}
