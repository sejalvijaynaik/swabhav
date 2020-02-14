package com.techlabs.accountinfo;

import java.io.*;

import com.techlabs.account.Account;

public class AccountInfo {
	private static String message;

	public static void printAccountDetails(Account[] accounts) throws IOException {
		for (Account tempAccount : accounts) {
			message = "------Account details------\n" + "Account Number :" + tempAccount.getAccNo() + "\n"
					+ "Account Name :" + tempAccount.getAccName() + "\n" + "Balance :" + tempAccount.getBalance();
			fileWrite(message);
		}
	}

	public static void printAccountDetails(Account account) throws IOException {
		message = "------Account details------\n" + "Account Number :" + account.getAccNo() + "\n" + "Account Name :"
				+ account.getAccName() + "\n" + "Balance :" + account.getBalance();
		fileWrite(message);
	}

	public static void printAfterDeposit(Account account) throws IOException {
		message = "The balance in the account" + account.getAccNo() + " after depositing is :" + account.getBalance();
		fileWrite(message);
		printAccountDetails(account);
	}

	public static void printAfterWithdrawal(Account account) throws IOException {

		if (account.getWithdrawSuccessFlag() == false) {
			message = "The amount cant be deducted due to insufficient balance\nThe " + "balance in your account"
					+ account.getAccNo() + " is :" + account.getBalance();
			fileWrite(message);
			return;
		}
		message = "The balance in the account" + account.getAccNo() + " after withdrawing is :" + account.getBalance();
		fileWrite(message);
		printAccountDetails(account);
	}

	public static void fileWrite(String message) throws IOException {
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

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fileReader.close();
	}
}
