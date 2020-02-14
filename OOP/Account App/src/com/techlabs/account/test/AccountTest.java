package com.techlabs.account.test;

import java.io.IOException;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) throws IOException {
		
		Account account1 = new Account();
		account1.setAccNo();
		account1.setAccName("abcd");
		printInfo(account1);
		account1.deposit(2000);
		printInfo(account1);
		account1.withdraw(2000);
		
		Account account2 = new Account();
		account2.setAccNo();
		account2.setAccName("xyz");
		printInfo(account2);
		account2.withdraw(600);
		printInfo(account2);
	}
	
	public static void printInfo(Account account) {
		System.out.println("------Account details------");
		System.out.println("Account Number :" + account.getAccNo());
		System.out.println("Account Name :" + account.getAccName());
		System.out.println("Balance :" + account.getBalance());
	}
}
