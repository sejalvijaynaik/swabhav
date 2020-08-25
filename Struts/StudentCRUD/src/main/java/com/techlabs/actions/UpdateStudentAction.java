package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentUpdateModel;

public class UpdateStudentAction extends ActionSupport implements ModelDriven<StudentUpdateModel> {

	private StudentUpdateModel studentUpdateModel;
	private StudentService studentService;

	public UpdateStudentAction() {

		studentUpdateModel = new StudentUpdateModel();
		studentService = StudentService.getStudentService();
	}

	@Override
	public String execute() throws Exception {

		System.out.println(studentUpdateModel.getRollNo());
		Student student = studentService.getStudent(studentUpdateModel.getRollNo());

		studentUpdateModel.setName(student.getName());
		studentUpdateModel.setAddress(student.getAddress());
		studentUpdateModel.setAge(student.getAge());

		return "input";
	}

	public String updateDo() {

		studentService.updateStudent(studentUpdateModel.getRollNo(), studentUpdateModel.getName(),
				studentUpdateModel.getAddress(), studentUpdateModel.getAge());

		return "success";
	}

	@Override
	public StudentUpdateModel getModel() {
		return studentUpdateModel;
	}

	@Override
	public void validate() {

		System.out.println("validate running");
		if (studentUpdateModel.getName() == null) {
			try {
				execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
			addFieldError("", "");
		} else {
			if (studentUpdateModel.getName().equals("")) {
				addFieldError("name", "First name is required");
			}
			if (studentUpdateModel.getAddress().equals("")) {
				addFieldError("address", "Last name is required");
			}
			if (studentUpdateModel.getAge() == null) {
				addFieldError("age", "Age is required");
			}
		}
	}

}
