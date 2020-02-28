package com.techlabs.ocp.solution.test;

import com.techlabs.ocp.solution.Diwali;
import com.techlabs.ocp.solution.FixedDeposit;
import com.techlabs.ocp.solution.Holi;

public class FixedDepositTest {
	
	public static void main(String[] args) {
		
		Holi holi = new Holi();
		Diwali diwali = new Diwali();
		
		FixedDeposit fixedDeposit = new FixedDeposit(123, "sejal", 1000.0, 5);
		fixedDeposit.calculateTotalAmount(holi);
		System.out.println("AccNo :" + fixedDeposit.getAccNo());
		System.out.println("AccName :" + fixedDeposit.getName());
		System.out.println("Amount :" + fixedDeposit.getAmount());
		
		fixedDeposit.calculateTotalAmount(diwali);
		System.out.println("AccNo :" + fixedDeposit.getAccNo());
		System.out.println("AccName :" + fixedDeposit.getName());
		System.out.println("Amount :" + fixedDeposit.getAmount());
	}

}
