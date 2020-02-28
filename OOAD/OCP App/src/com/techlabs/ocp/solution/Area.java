package com.techlabs.ocp.solution;

public class Area {

	private AreaInterface areaInterface;

	public Area(AreaInterface areaInterface) {
		this.areaInterface = areaInterface;
	}

	public double calculateArea() {

		double area = this.areaInterface.calculateArea();
		return area;
	}
}
