package com.techlabs.account;

public class Account {
	private static int accNo = 0;
	private String accName;
	private double balance = 0;
	private static final int MINIMUM_BALANCE = 500;
	private boolean withdrawSuccessFlag = false;

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}
	
	public boolean getWithdrawSuccessFlag() {
		return withdrawSuccessFlag;
	}

	public void setAccNo() {
		accNo++;
	}

	public void setAccName(String accName) {
		accName = accName;
	}
	
	public void deposit(double depositAmount) {
		balance = balance + depositAmount;
	}

	public void withdraw(double withdrawAmount) {
		if ((balance - withdrawAmount) >= MINIMUM_BALANCE) {
			balance = balance - withdrawAmount;
			withdrawSuccessFlag = true;
			return;
		}
		withdrawSuccessFlag = false;
	}
}
