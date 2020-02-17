package com.techlabs.currentaccount;

import com.techlabs.account.AccountAbstarct;

public class CurrentAccountAbstract extends AccountAbstarct {
	
	private static final double MINIMUM_BALANCE = -5000.0;

	public CurrentAccountAbstract(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if((balance - amount) >= (MINIMUM_BALANCE)){
			balance = balance - amount;
		}
	}
}
