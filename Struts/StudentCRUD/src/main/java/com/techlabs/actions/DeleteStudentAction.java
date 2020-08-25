package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentUpdateModel;

public class DeleteStudentAction extends ActionSupport implements ModelDriven<StudentUpdateModel> {

	private StudentService studentService;
	private StudentUpdateModel student;

	public DeleteStudentAction() {

		studentService = StudentService.getStudentService();
		student = new StudentUpdateModel();
	}

	@Override
	public String execute() throws Exception {

		studentService.deleteStudent(student.getRollNo());
		return "success";
	}

	@Override
	public StudentUpdateModel getModel() {

		return student;
	}

}
