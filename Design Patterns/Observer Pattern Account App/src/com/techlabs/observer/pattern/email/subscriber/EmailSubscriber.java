package com.techlabs.observer.pattern.email.subscriber;

import com.techlabs.observer.pattern.account.Account;
import com.techlabs.observer.pattern.isubscriber.ISubscriber;

public class EmailSubscriber implements ISubscriber {

	private Account account;
	
	public EmailSubscriber(Account account) {
		this.account = account;
		this.account.registerSubscriber(this);
	}

	@Override
	public void balanceModified(Account account) {
		System.out.println("-----Email notification-----");
		System.out.println("Email :" + account.getEmail());
		System.out.println("Amount " + account.getStatus());
		System.out.println("Current balance : " + account.getBalance());
	}

}
