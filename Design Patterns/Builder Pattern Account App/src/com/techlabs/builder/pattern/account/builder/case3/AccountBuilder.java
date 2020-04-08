package com.techlabs.builder.pattern.account.builder.case3;

public class AccountBuilder extends Account {

	private int accNo;
	private String accName;
	private String branch;
	private double balance;
	private float interestRate;

	public AccountBuilder(int accNo) {
		this.accNo = accNo;
	}

	public AccountBuilder buildAccName(String accName) {
		this.accName = accName;
		return this;
	}

	public AccountBuilder buildBranch(String branch) {
		this.branch = branch;
		return this;
	}

	public AccountBuilder buildBalance(double balance) {
		this.balance = balance;
		return this;
	}

	public AccountBuilder buildInterestRate(float interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Account build() {

		Account account = new Account();
		account.setAccNo(this.accNo);
		account.setAccName(this.accName);
		account.setBranch(this.branch);
		account.setBalance(this.balance);
		account.setInterestRate(this.interestRate);

		return account;
	}
}
