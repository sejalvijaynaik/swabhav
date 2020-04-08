package com.techlabs.builder.pattern.account.test.case2;

import com.techlabs.builder.pattern.account.builder.case2.Account;
import com.techlabs.builder.pattern.account.builder.case2.AccountBuilder;

public class AccountTest {
	public static void main(String[] args) {

		Account account = new AccountBuilder(123)
				.buildAccName("abc")
				.buildBalance(900.0)
				.buildBranch("andheri")
				.buildInterestRate(10.5f)
				.build();
							
		
		System.out.println("Account no : " + account.getAccNo());
		System.out.println("Account name : " + account.getAccName());
		System.out.println("Account balance : " + account.getBalance());
		System.out.println("Account branch : " + account.getBranch());
		System.out.println("Account interest rate : " + account.getInterestRate());
	}

}
