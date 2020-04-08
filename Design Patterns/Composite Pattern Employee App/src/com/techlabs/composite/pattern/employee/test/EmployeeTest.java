package com.techlabs.composite.pattern.employee.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.composite.pattern.ceo.CEO;
import com.techlabs.composite.pattern.developer.Developer;
import com.techlabs.composite.pattern.iemployee.IEmployee;
import com.techlabs.composite.pattern.manager.Manager;

public class EmployeeTest {

	public static void main(String[] args) {

		CEO ceo = new CEO("abc", "CEO", 50000.0);

		Manager manager1 = new Manager("mno", "manager", 30000.0);
		Manager manager2 = new Manager("pqr", "manager", 30000.0);

		Developer developer1 = new Developer("abc", "developer", 10000.0);
		Developer developer2 = new Developer("def", "developer", 10000.0);
		Developer developer3 = new Developer("ghi", "developer", 10000.0);
		Developer developer4 = new Developer("jkl", "developer", 10000.0);

		manager1.addEmployee(developer1);
		manager1.addEmployee(developer2);

		manager2.addEmployee(developer3);
		manager2.addEmployee(developer4);

		ceo.addEmployee(manager1);
		ceo.addEmployee(manager2);
		
		List<IEmployee> employees = new ArrayList<IEmployee>();
		
		employees.add(developer1);
		employees.add(developer2);
		employees.add(developer3);
		employees.add(developer4);
		
		for (IEmployee tempEmployee : employees) {
			
			if(tempEmployee.getEmployees() != null) {
				System.out.println("employee list :" + tempEmployee.getEmployees());
			}
			System.out.print("Designation : " + tempEmployee.getDesignation());
			System.out.print(" Name : " + tempEmployee.getName());
			System.out.print(" Salary : " + tempEmployee.getSalary());
			System.out.println();
		}

		/*System.out.print("Designation : " + ceo.getDesignation());
		System.out.print(" Name : " + ceo.getName());
		System.out.print(" Salary : " + ceo.getSalary());
		System.out.println();

		for (IEmployee managers : ceo.getEmployees()) {

			System.out.print("Designation : " + managers.getDesignation());
			System.out.print(" Name : " + managers.getName());
			System.out.print(" Salary : " + managers.getSalary());
			System.out.println();

			for (IEmployee developer : managers.getEmployees()) {
				System.out.print("Designation : " + developer.getDesignation());
				System.out.print(" Name : " + developer.getName());
				System.out.print(" Salary : " + developer.getSalary());
				System.out.println();
			}
		}*/
	}

}
