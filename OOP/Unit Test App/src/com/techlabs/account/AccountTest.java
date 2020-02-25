package com.techlabs.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testConstructorTwoParameters() {
		int expectedAccNo = 123;
		String expectedAccname = "sejal";		
		double expectedBalance = 1000.0;

		Account account = new Account(123, "sejal");
		
		assertEquals(expectedAccNo, account.getAccNo());
		assertEquals(expectedAccname, account.getAccName());
		assertEquals(expectedBalance, account.getBalance());
	}
	
	@Test
	void testConstructorThreeParameters() {
		int expectedAccNo = 234;
		String expectedAccname = "sejal";
		double expectedBalance = 1000.0;
		
		Account account = new Account(234, "sejal", 1000.0);
		
		assertEquals(expectedAccNo, account.getAccNo());
		assertEquals(expectedAccname, account.getAccName());
		assertEquals(expectedBalance, account.getBalance());
		
	}
	
	@Test
	void testDeposit() {
		
		double expectedBalance = 1500.0;
		
		Account account = new Account(123, "sejal");
		account.deposit(500.0);
		
		assertEquals(expectedBalance, account.getBalance());
	}
	
	@Test
	void testWithdraw() {
		
		double expectedBalanceAfterWithdraw = 1000.0;
				
		Account account = new Account(123, "sejal");
		account.withdraw(501.0);
		
		assertEquals(expectedBalanceAfterWithdraw, account.getBalance());
	}
}
