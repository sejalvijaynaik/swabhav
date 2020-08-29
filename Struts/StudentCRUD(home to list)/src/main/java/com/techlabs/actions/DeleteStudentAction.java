package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.ApplicationMap;
import org.apache.struts2.interceptor.ApplicationAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;
import com.techlabs.viewModel.StudentUpdateModel;

public class DeleteStudentAction extends ActionSupport implements ModelDriven<StudentUpdateModel>, ApplicationAware {

	private StudentService studentService;
	private StudentUpdateModel student;
	private ApplicationMap applicationMap;

	public DeleteStudentAction() {

		studentService = StudentService.getStudentService();
		student = new StudentUpdateModel();
	}

	@Override
	public String execute() throws Exception {

		System.out.println("delete action eexcute running");

		System.out.println("Inside delete action value of application:" + applicationMap.get("rollNo"));
		studentService.deleteStudent((String) applicationMap.get("rollNo"));

		return "success";
	}

	@Override
	public StudentUpdateModel getModel() {

		return student;
	}

	@Override
	public void setApplication(Map<String, Object> application) {

		applicationMap = (ApplicationMap) application;
	}
}
