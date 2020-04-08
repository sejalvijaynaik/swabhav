package com.techlabs.composite.pattern.iemployee;

import java.util.List;

public interface IEmployee {
	
	String getName();
	String getDesignation();
	double getSalary();
	List<IEmployee> getEmployees();
}
