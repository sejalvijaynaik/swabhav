package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.ApplicationMap;
import org.apache.struts2.interceptor.ApplicationAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentUpdateModel;

public class UpdateStudentAction extends ActionSupport implements ModelDriven<StudentUpdateModel>, ApplicationAware {

	private StudentUpdateModel studentUpdateModel;
	private StudentService studentService;
	private ApplicationMap applicationMap;

	public UpdateStudentAction() {

		studentUpdateModel = new StudentUpdateModel();
		studentService = StudentService.getStudentService();
	}

	@Override
	public String execute() throws Exception {

		System.out.println("updateaction execute running");
		Student student = studentService.getStudent((String) applicationMap.get("rollNo"));

		studentUpdateModel.setName(student.getName());
		studentUpdateModel.setAddress(student.getAddress());
		studentUpdateModel.setAge(student.getAge());

		return "input";
	}

	public String updateDo() {

		System.out.println("updateaction upadteDo running");
		studentService.updateStudent((String) applicationMap.get("rollNo"), studentUpdateModel.getName(),
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

	@Override
	public void setApplication(Map<String, Object> application) {

		applicationMap = (ApplicationMap) application;
	}

}
