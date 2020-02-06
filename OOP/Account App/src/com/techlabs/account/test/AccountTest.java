package com.techlabs.account.test;

import java.io.IOException;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) throws IOException {
		
		Account account1 = new Account();
		account1.setaccNo(1234);
		account1.setAccName("abcd");
		account1.setBalance(500);
		printInfo(account1);
		account1.deposit(2000);
		printInfo(account1);
		account1.withdraw(2000);
		
		Account account2 = new Account();
		account2.setaccNo(5678);
		account2.setAccName("xyz");
		account2.setBalance(1000);
		printInfo(account2);
		account2.withdraw(600);
		printInfo(account2);
	}
	
	public static void printInfo(Account account) {
		System.out.println("------Account details------");
		System.out.println("Account Number :" + account.getaccNo());
		System.out.println("Account Name :" + account.getaccName());
		System.out.println("Balance :" + account.getBalance());
	}
}
