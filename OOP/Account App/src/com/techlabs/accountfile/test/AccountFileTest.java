package com.techlabs.accountfile.test;

import java.io.*;

import com.techlabs.account.Account;
import com.techlabs.accountinfo.AccountInfo;

public class AccountFileTest {
	public static void main(String[] args) throws IOException {
		
		Account account1 = new Account();
		account1.setAccNo();
		account1.setAccName("abcd");
		account1.deposit(2000);
		AccountInfo.printAfterDeposit(account1);
		account1.withdraw(600);
		AccountInfo.printAfterWithdrawal(account1);

		Account account2 = new Account();
		account2.setAccNo();
		account2.setAccName("xyz");
		account2.deposit(1000);
		AccountInfo.printAfterDeposit(account2);
		account2.withdraw(1);
		AccountInfo.printAfterWithdrawal(account2);
		
		Account account3 = new Account();
		account3.setAccNo();
		account3.setAccName("pqr");
		account3.deposit(1000);
		account3.withdraw(1001);
		
		Account[] accounts = {account1, account2, account3};
		AccountInfo.printAccountDetails(accounts);
		AccountInfo.readInfo();
	}
}
