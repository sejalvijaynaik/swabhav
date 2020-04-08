package com.techlabs.observer.pattern.email.subscriber;

import com.techlabs.observer.pattern.account.Account;
import com.techlabs.observer.pattern.isubscriber.ISubscriber;

public class SmsSubscriber implements ISubscriber {
	
	private Account account;
	
	public SmsSubscriber(Account account) {
		this.account = account;
		this.account.registerSubscriber(this);
	}

	@Override
	public void balanceModified(Account account) {
		System.out.println("-----SMS notification-----");
		System.out.println("SMS :" + account.getMobileNumber());
		System.out.println("Amount " + account.getStatus());
		System.out.println("Current balance : " + account.getBalance());
	}
}
