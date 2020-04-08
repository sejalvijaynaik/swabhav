package com.techlabs.builder.pattern.account.builder.case1;

public class Account {

	private int accNo;
	private String accName;
	private String branch;
	private double balance;
	private float interestRate;
	
	private Account() {
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public String getBranch() {
		return branch;
	}

	public double getBalance() {
		return balance;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public static class Builder {

		private int accNo;
		private String accName;
		private String branch;
		private double balance;
		private float interestRate;
		
		public Builder(int accNo) {
			this.accNo = accNo;
		}
		
		public Builder buildAccName(String accName) {
			this.accName = accName;
			return this;
		}
		
		public Builder buildBranch(String branch) {
			this.branch = branch;
			return this;
		}
		
		public Builder buildBalance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public Builder buildInterestRate(float interestRate) {
			this.interestRate = interestRate;
			return this;
		}
		
		public Account build() {
			
			Account account = new Account();
			account.accNo = this.accNo;
			account.accName = this.accName;
			account.branch = this.branch;
			account.balance = this.balance;
			account.interestRate = this.interestRate;
			
			return account;
		}
	}
}
