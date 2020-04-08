package com.techlabs.proxy.pattern.account.proxy;

import java.util.Calendar;
import com.techlabs.proxy.pattern.account.Account;

public class AccountProxy extends Account {
	
	public AccountProxy(int accNo, String accName, double balance) {
		super(accNo, accName, balance);
	}

	@Override
	public void deposit(double amount) {

		System.out.println("Before depositing date and time : " + Calendar.getInstance().getTime());
		super.deposit(amount);
		System.out.println("Balance after depositing : " + getBalance());
		System.out.println("After depositing date and time : " + Calendar.getInstance().getTime());
	}
	
	//function for checking the minimum balance before withdraw
	//function for telling the user that the server is down
	//function for restricting the access at certain time of the day like no access from 10 pm to 7 am
}
