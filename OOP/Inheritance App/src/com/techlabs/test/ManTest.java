package com.techlabs.test;

import com.techlabs.Infant.Infant;
import com.techlabs.boy.Boy;
import com.techlabs.kid.Kid;
import com.techlabs.man.Man;

public class ManTest {
	public static void main(String[] args) {
		ManTest manTest = new ManTest();
		//manTest.case1();
		// manTest.case2();
		// manTest.case3();
		// manTest.case4();
		manTest.case5();
	}

	public void case1() {
		Man x;
		x = new Man();
		x.play();
		x.wish();
	}

	public void case2() {
		Boy y;
		y = new Boy();
		y.play();
		y.wish();
		y.walk();
		y.eat();
	}

	public void case3() {
		Man x;
		x = new Boy();
		x.play();
		x.wish();
	}

	public void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Infant());
		atThePark(new Kid());
	}

	public void atThePark(Man x) {
		System.out.println("At the park");
		x.play();
	}

	public void case5() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	}
}
