package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentAddModel;
import com.techlabs.viewModel.StudentUpdateModel;

public class AddStudentAction extends ActionSupport implements ModelDriven<StudentAddModel> {

	private StudentAddModel studentAddModel;

	public AddStudentAction() {

		System.out.println("add studnet action constructotr running");
		studentAddModel = new StudentAddModel();
	}

	@Override
	public String execute() throws Exception {

		System.out.println("addStudent(execute) running");
		System.out.println("name" + studentAddModel.getName());
		System.out.println("address" + studentAddModel.getAddress());
		System.out.println("age " + studentAddModel.getAge());

		return "input";

	}

	public String addDo() {

		System.out.println("addStudent(adddo) running");
		System.out.println("name" + studentAddModel.getName());
		System.out.println("address" + studentAddModel.getAddress());
		System.out.println("age " + studentAddModel.getAge());

		StudentService studentService = StudentService.getStudentService();
		studentService.addStudent(studentAddModel.getName(), studentAddModel.getAddress(), studentAddModel.getAge());

		return "success";
	}

	@Override
	public StudentAddModel getModel() {
		return studentAddModel;
	}

	@Override
	public void validate() {

		System.out.println("validate running");
		if (studentAddModel.getName() == null) {
			addFieldError("", "");
		} else {
			if (studentAddModel.getName().equals("")) {
				addFieldError("name", "First name is required");
			}
			if (studentAddModel.getAddress().equals("")) {
				addFieldError("address", "Last name is required");
			}
			if (studentAddModel.getAge() == null) {
				addFieldError("age", "Age is required");
			}
		}
	}

}
