package com.techlabs.employee.emplyeeclass;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String managerId;
	private String dateOfJoining;
	private double salary;
	private String commission;
	private int departmentNumber;

	public Employee(int employeeId, String employeeName, String employeeDesignation, String managerId,
			String dateOfJoining, double salary, String commission, int departmentNumber) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.departmentNumber = departmentNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public String getManagerId() {
		return managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public String getCommission() {
		return commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	@Override
	public boolean equals(Object obj) {
		
		Employee employee = (Employee)obj;
		
		if(this.employeeId != employee.employeeId) {
			return false;
		}
		
		if(!(this.employeeName.equalsIgnoreCase(employee.employeeName))) {
			return false;
		}
		if(!(this.employeeDesignation.equalsIgnoreCase(employee.employeeDesignation))) {
			return false;
		}
		if(!(this.managerId.equalsIgnoreCase(employee.managerId))) {
			return false;
		}
		if(!(this.dateOfJoining.equalsIgnoreCase(employee.dateOfJoining))) {
			return false;
		}
		if(this.salary != employee.salary) {
			return false;
		}
		if(!(this.commission.equalsIgnoreCase(employee.commission))) {
			return false;
		}
		if(this.departmentNumber != employee.departmentNumber) {
			return false;
		}
		return true;
	}
}
