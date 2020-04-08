package com.techlabs.proxy.pattern.account.test;

import com.techlabs.proxy.pattern.account.Account;
import com.techlabs.proxy.pattern.account.proxy.AccountProxy;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account = new AccountProxy(123, "abs", 500.0);
		account.deposit(500.0);
	}
}
