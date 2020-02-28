package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.FestivalType;
import com.techlabs.ocp.violation.FixedDeposit;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		
		FixedDeposit fixedDeposit = new FixedDeposit(123, "sejal", 1000.0, 5, FestivalType.DIWALI);
		fixedDeposit.calculateTotalAmount();
		System.out.println("AccNo :" + fixedDeposit.getAccNo());
		System.out.println("AccName :" + fixedDeposit.getName());
		System.out.println("Amount :" + fixedDeposit.getAmount());
	}

}
