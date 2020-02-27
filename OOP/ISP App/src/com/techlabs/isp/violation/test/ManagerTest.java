package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.AverageWoker;
import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Robot;
import com.techlabs.isp.violation.SmartWorker;

public class ManagerTest {
	
	public static void main(String[] args) {
		
		SmartWorker smartWorker = new SmartWorker();
		AverageWoker averageWoker = new AverageWoker();
		Robot robot = new Robot();
		
		workAndEat(smartWorker);
		workAndEat(averageWoker);
		workAndEat(robot);
	}
	
	public static void workAndEat(IWorker iWorker) {
		
		iWorker.work();
		iWorker.eat();
	}
}
