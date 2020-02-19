package com.techlabs.imovable.test;

import com.techlabs.bike.Bike;
import com.techlabs.car.Car;
import com.techlabs.imovable.IMovable;
import com.techlabs.truck.Truck;

public class IMovableTest {
	public static void main(String[] args) {
		
		IMovable bike = new Bike();
		IMovable car = new Car();
		IMovable truck = new Truck();
		
		IMovable[] movables = {bike, car, truck};
		//IMovable[] movables = {car, truck, bike};
		//IMovable[] movables = {truck, car, bike};
		startTheRace(movables);
		
		
	}
	
	public static void startTheRace(IMovable[] movables) {
		for(int i=0; i < movables.length; i++) {
			movables[i].move();
		}
	}
}
