package com.techlabs.singleton.pattern.dataservice;

public class DataService {

	private static DataService bucket;

	private DataService() {
		System.out.println("Service executed");
	}

	public void doWork() {
		System.out.println("Doing service work with " + bucket.hashCode());
	}

	public static DataService getInstance() {

		if (bucket == null) {
			bucket = new DataService();
		}

		return bucket;
	}
}
