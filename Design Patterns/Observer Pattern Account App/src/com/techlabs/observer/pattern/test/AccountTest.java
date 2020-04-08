package com.techlabs.observer.pattern.test;

import com.techlabs.observer.pattern.account.Account;
import com.techlabs.observer.pattern.email.subscriber.EmailSubscriber;
import com.techlabs.observer.pattern.email.subscriber.SmsSubscriber;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account = new Account(123, "sejal@gmail.com", 123456789);
		
		EmailSubscriber emailSubscriber  = new EmailSubscriber(account);
		SmsSubscriber smsSubscriber = new SmsSubscriber(account);
		
		account.withDraw(200.0);
		account.deposit(500.0);
	}
}
