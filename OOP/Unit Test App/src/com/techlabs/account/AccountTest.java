package com.techlabs.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	int expectedAccNo;
	String expectedAccname;		
	double expectedBalance;
	
	@BeforeAll
	static void before_class(){
		System.out.println("before class starts");
	}
	@BeforeEach
	void expected_values_set() {
		expectedAccNo = 123;
		expectedAccname = "sejal";		
		expectedBalance = 1000.0;
		System.out.println("i am before");
	}
	
	@Test
	void test_Constructor_With_Two_Parameters() {
		
		Account account = new Account(123, "sejal");
		
		assertEquals(expectedAccNo, account.getAccNo());
		assertEquals(expectedAccname, account.getAccName());
		assertEquals(expectedBalance, account.getBalance());
	}
	
	@Test
	void test_Constructor_Three_Parameters() {
		
		Account account = new Account(123, "sejal", 1000.0);
		
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
	
	@AfterEach
	void display_account_details() {
		
		System.out.println("account dtails:");
	}
	
	@AfterAll
	static void after_class_ends() {
		
		System.out.println("after class ends");
	}
}
