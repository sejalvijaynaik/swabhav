package com.techlabs.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.student.model.Student;
import com.techlabs.student.service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getStudents() {
		studentService = StudentService.getStudentService();
		return studentService.getStudents();
	}

	@GetMapping("/students/{rollNo}")
	public Student getStudent(@PathVariable String rollNo) {
		studentService = StudentService.getStudentService();
		return studentService.getStudent(rollNo);
	}

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		studentService = StudentService.getStudentService();
		studentService.addStudent(student);
		return student;
	}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		studentService = StudentService.getStudentService();
		studentService.updateStudent(student);
		return student;
	}

	@DeleteMapping("/students/{rollNo}")
	public void deleteStudent(@PathVariable String rollNo) {
		studentService = StudentService.getStudentService();
		studentService.deleteStudent(rollNo);
	}
}
