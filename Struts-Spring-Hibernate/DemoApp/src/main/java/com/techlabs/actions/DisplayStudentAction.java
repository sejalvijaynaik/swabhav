package com.techlabs.actions;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class DisplayStudentAction extends ActionSupport {

	@Autowired
	private StudentService studentService;
	private List<Student> students;

	@Override
	public String execute() throws Exception {

		students = studentService.getStudents();
		System.out.println(students.size());

		return "success";
	}

}
