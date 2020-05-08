package com.techlabs.prinr.time.worker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTimeWorker implements Runnable {

	@Override
	public void run() {
		while(true) {
			DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
		}
	}
}
