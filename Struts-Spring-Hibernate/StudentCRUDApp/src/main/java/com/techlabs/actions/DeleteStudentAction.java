package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentUpdateModel;

public class DeleteStudentAction extends ActionSupport {

	@Autowired
	private StudentService studentService;
	private String rollNo;

	@Override
	public String execute() throws Exception {

		System.out.println(rollNo);
		studentService.deleteStudent(rollNo);
		return "success";
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
}
