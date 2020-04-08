package com.techlabs.observer.pattern.account;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.observer.pattern.isubscriber.ISubscriber;

public class Account {

	private List<ISubscriber> subscribers;
	private int accNo;
	private String email;
	private long mobileNumber;
	private double balance;
	private double amount;
	private String status;

	public Account(int accNo, String email, long mobileNumber) {
		subscribers = new ArrayList<ISubscriber>();
		this.accNo = accNo;
		this.email = email;
		this.mobileNumber = mobileNumber;
		balance = 500.0;
	}

	public List<ISubscriber> getSubscribers() {
		return subscribers;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getEmail() {
		return email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getStatus() {
		return status;
	}

	public void registerSubscriber(ISubscriber iSubscriber) {
		subscribers.add(iSubscriber);
	}

	public void removeSubscriber(ISubscriber iSubscriber) {
		subscribers.remove(iSubscriber);
	}
	
	public void withDraw(double amount) {
		this.amount = amount;
		balance = balance - amount;
		status = "deducted";
		for(ISubscriber iSubscriber : subscribers) {
			iSubscriber.balanceModified(this);
		}
	}
	
	public void deposit(double amount) {
		this.amount = amount;
		balance = balance + amount;
		status = "added";
		for(ISubscriber iSubscriber : subscribers) {
			iSubscriber.balanceModified(this);
		}
	}
}
