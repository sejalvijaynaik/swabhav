package com.techlabs.account;

public interface AccountInterface {
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract String getAccName();
	public abstract int getAccNo();
	public abstract double getBalance();
}
