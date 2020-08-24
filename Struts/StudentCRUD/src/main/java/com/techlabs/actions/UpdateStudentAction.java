package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentViewModel;

public class UpdateStudentAction extends ActionSupport implements ModelDriven<StudentViewModel> {

	private StudentViewModel studentViewModel;
	private StudentService studentService;

	public UpdateStudentAction() {

		studentViewModel = new StudentViewModel();
		studentService = new StudentService();
	}

	@Override
	public String execute() throws Exception {

		studentService.updateStudent(studentViewModel.getRollNo(), studentViewModel.getName(),
				studentViewModel.getAddress(), studentViewModel.getAge());

		return "success";
	}

	public String showUpdateForm() {

		System.out.println(studentViewModel.getRollNo());
		Student student = studentService.getStudent(studentViewModel.getRollNo());
		
		studentViewModel.setName(student.getName());
		studentViewModel.setAddress(student.getAddress());
		studentViewModel.setAge(student.getAge());

		return "input";
	}

	@Override
	public StudentViewModel getModel() {
		return studentViewModel;
	}

}
