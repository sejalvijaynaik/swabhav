package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentViewModel;

public class AddStudentAction extends ActionSupport implements ModelDriven<StudentViewModel> {

	private StudentViewModel student;

	public AddStudentAction() {

		student = new StudentViewModel();
	}

	@Override
	public String execute() throws Exception {

		System.out.println("addStudent(execute) running");
		System.out.println("name" + student.getName());
		System.out.println("address" + student.getAddress());
		System.out.println("age " + student.getAge());

		StudentService studentService = new StudentService();
		studentService.addStudent(student.getName(), student.getAddress(), student.getAge());

		return "success";
	}

	public String showAddForm() {

		System.out.println("show add form running");
		System.out.println("name" + student.getName());
		System.out.println("address" + student.getAddress());
		System.out.println("age " + student.getAge());

		return "input";
	}

	@Override
	public StudentViewModel getModel() {
		return student;
	}

}
