package com.techlabs.emplyee.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlabs.employee.emplyeeclass.Employee;

class LoadFromFileTest {

	@Test
	void test() {

		LoadFromFile loadFromFile = new LoadFromFile();
		List<String> lines = loadFromFile.loadEmployeeDetails();
		
		

			String[] splitString = null;

			for(Iterator<String> i = lines.iterator(); i.hasNext();) {

				splitString = i.next().split("\\,");
				for (String word : splitString) {

					System.out.print(word);
				}
				System.out.println();
			}
				/*
				 * int employeeId = Integer.parseInt(splitString[0]); String employeeName =
				 * splitString[1]; String employeeDesignation = splitString[2]; int managerId =
				 * Integer.parseInt(splitString[3]); String dateOfJoining = splitString[4];
				 * double salary = Double.parseDouble(splitString[5]); String commission =
				 * splitString[6]; int departmentNumber = Integer.parseInt(splitString[7]);
				 * Employee employee = new Employee(employeeId, employeeName,
				 * employeeDesignation, managerId, dateOfJoining, salary, commission,
				 * departmentNumber); employees.add(employee);
				 */
			
	}
}
