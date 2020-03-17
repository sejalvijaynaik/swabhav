package com.techlabs.singleton.pattern.dataservice.test;

import com.techlabs.singleton.pattern.dataservice.DataService;

public class DataserviceTest {
	
	public static void main(String[] args) {
		
		DataService s1 = DataService.getInstance();
		DataService s2 = DataService.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1.doWork();
		s2.doWork();
	}
}
