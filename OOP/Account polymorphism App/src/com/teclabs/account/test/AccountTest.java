package com.teclabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.currentaccount.CurrentAccount;
import com.techlabs.savingsaccount.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {

		Account savingAccount = new SavingAccount(001, "savings", 500.0);
		Account currentAccount = new CurrentAccount(002, "current", 500.0);
		
		printInfo(savingAccount);
		printInfo(currentAccount);
		
		savingAccount.deposit(500);
		printInfo(savingAccount);
		
		savingAccount.withdraw(1001);
		printInfo(savingAccount);
		
		currentAccount.deposit(500);
		printInfo(currentAccount);
		
		currentAccount.withdraw(6000);
		printInfo(currentAccount);
		
	}

	public static void printInfo(Account account) {
		
		System.out.println("\n----Account Info----");
		System.out.println("Account number :" + account.getAccNo());
		System.out.println("Account Name :" + account.getAccName());
		System.out.println("Account balance :" + account.getBalance());
	}
}
