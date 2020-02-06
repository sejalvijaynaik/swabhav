package com.techlabs.accountfile.test;

import java.io.*;

import com.techlabs.account.Account;

public class AccountFileTest {
	public static void main(String[] args) throws IOException {
		
		
		Account account1 = new Account();
		account1.setaccNo();
		account1.setAccName("abcd");
		account1.setBalance(500);
		printAccountDetails(account1);
		account1.deposit(2000);
		account1.withdraw(2001);
		
		Account account2 = new Account();
		account2.setaccNo();
		account2.setAccName("xyz");
		account2.setBalance(1000);
		printAccountDetails(account2);
		account2.withdraw(600);
		readInfo();
	}
	
	public static void printAccountDetails(Account account) throws IOException {
		File file = new File("customer.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fileWriter);
		
		bw.write("------Account details------");
		bw.newLine();
		bw.write("Account Number :" + account.getaccNo());
		bw.newLine();
		bw.write("Account Name :" + account.getaccName());
		bw.newLine();
		bw.write("Balance :" + account.getBalance());
		bw.newLine();
		bw.close();
		fileWriter.close();
	}
	
	public static void printAfterDeposit(double balance) throws IOException {
		File file = new File("customer.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fileWriter);
		bw.write("The balance in the account after depositing is :" + balance);
		bw.newLine();
		bw.close();
		fileWriter.close();
	}
	
	public static void printAfterWithdrawal(String message) throws IOException {
		File file = new File("customer.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fileWriter);
		bw.write(message);
		bw.newLine();
		bw.close();
		fileWriter.close();
	}
	
	public static void readInfo() throws IOException {
		File file = new File("customer.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		
		String line = null;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fileReader.close();
	}
}
