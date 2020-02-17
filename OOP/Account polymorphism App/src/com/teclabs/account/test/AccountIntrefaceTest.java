package com.teclabs.account.test;

import com.techlabs.account.AccountInterface;
import com.techlabs.currentaccount.CurrentAccountInterface;
import com.techlabs.savingsaccount.SavingAccountInterface;

public class AccountIntrefaceTest {
	public static void main(String[] args) {

		AccountInterface savingAccount = new SavingAccountInterface(001, "savings", 500.0);
		AccountInterface currentAccount = new CurrentAccountInterface(002, "current", 500.0);
		
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

	public static void printInfo(AccountInterface account) {
		
		System.out.println("\n----Account Info----");
		System.out.println("Account number :" + account.getAccNo());
		System.out.println("Account Name :" + account.getAccName());
		System.out.println("Account balance :" + account.getBalance());
	}

}
