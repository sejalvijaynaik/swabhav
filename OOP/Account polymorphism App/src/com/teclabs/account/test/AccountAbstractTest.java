package com.teclabs.account.test;

import com.techlabs.account.AccountAbstarct;
import com.techlabs.currentaccount.CurrentAccountAbstract;
import com.techlabs.savingsaccount.SavingAccountAbstract;

public class AccountAbstractTest {
	public static void main(String[] args) {

		AccountAbstarct savingAccount = new SavingAccountAbstract(001, "savings", 500.0);
		AccountAbstarct currentAccount = new CurrentAccountAbstract(002, "current", 500.0);
		
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

	public static void printInfo(AccountAbstarct account) {
		
		System.out.println("\n----Account Info----");
		System.out.println("Account number :" + account.getAccNo());
		System.out.println("Account Name :" + account.getAccName());
		System.out.println("Account balance :" + account.getBalance());
	}
}
