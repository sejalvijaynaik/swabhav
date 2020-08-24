package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentViewModel;

public class DeleteStudentAction extends ActionSupport implements ModelDriven<StudentViewModel> {

	private StudentService studentService;
	private StudentViewModel student;

	public DeleteStudentAction() {

		studentService = new StudentService();
		student = new StudentViewModel();
	}

	@Override
	public String execute() throws Exception {

		studentService.deleteStudent(student.getRollNo());
		return "success";
	}

	@Override
	public StudentViewModel getModel() {

		return student;
	}

}
