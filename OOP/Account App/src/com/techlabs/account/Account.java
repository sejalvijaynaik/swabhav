package com.techlabs.account;

import java.io.IOException;

import com.techlabs.accountfile.test.AccountFileTest;

public class Account {
	private static int accNo = 0;
	private String accName;
	private double balance;

	public int getaccNo() {
		return accNo;
	}

	public String getaccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setaccNo() {
		accNo++;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double depositAmount) throws IOException {
		balance = balance + depositAmount;
	//	System.out.println("The balance in the account after depositing is :" + balance);
		AccountFileTest.printAfterDeposit(balance);
		AccountFileTest.printAccountDetails(this);
	}

	public void withdraw(double withdrawAmount) throws IOException {
		String message;
		String balanceInStr;
		if ((balance - withdrawAmount) < 500) {
			balanceInStr = Double.toString(balance);
			message = "The balance cannot be below 500 hence the amount cant be deducted\nThe balance in your account is :" + balanceInStr;
			AccountFileTest.printAfterWithdrawal(message);
			AccountFileTest.printAccountDetails(this);
		} else {
			balance = balance - withdrawAmount;
			balanceInStr = Double.toString(balance);
			message = "The balance in the account after withdrawal is :" + balanceInStr;
			AccountFileTest.printAfterWithdrawal(message);
			AccountFileTest.printAccountDetails(this);
		}
	}
}
