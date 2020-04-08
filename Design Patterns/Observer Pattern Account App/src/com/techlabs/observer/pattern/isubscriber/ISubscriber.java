package com.techlabs.observer.pattern.isubscriber;

import com.techlabs.observer.pattern.account.Account;

public interface ISubscriber {
	
	void balanceModified(Account account);

}
