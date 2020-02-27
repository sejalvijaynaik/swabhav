package com.techlabs.isp.solution.test;

import com.techlabs.isp.solution.AverageWoker;
import com.techlabs.isp.solution.IEatable;
import com.techlabs.isp.solution.IWorkable;
import com.techlabs.isp.solution.Robot;
import com.techlabs.isp.solution.SmartWorker;

public class ManagerTest {
	
	public static void main(String[] args) {
		
		SmartWorker smartWorker = new SmartWorker();
		AverageWoker averageWoker = new AverageWoker();
		Robot robot = new Robot();
		
		work(smartWorker);
		eat(smartWorker);
		
		work(averageWoker);
		eat(averageWoker);
		
		work(robot);
	}
	
	public static void work(IWorkable iWorkable) {
		
		iWorkable.work();
	}
	
	public static void eat(IEatable iEatable) {
		iEatable.eat();
	}
}
