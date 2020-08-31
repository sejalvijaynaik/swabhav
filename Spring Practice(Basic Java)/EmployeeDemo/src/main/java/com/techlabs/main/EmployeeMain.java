package com.techlabs.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmployeeService svc = context.getBean("employeeService", EmployeeService.class);
		System.out.println(svc.getEmployees().size());
		System.out.println(svc.hashCode());

		EmployeeService svc1 = context.getBean("employeeService", EmployeeService.class);
		System.out.println(svc1.getEmployees().size());
		System.out.println(svc1.hashCode());
	}

}
