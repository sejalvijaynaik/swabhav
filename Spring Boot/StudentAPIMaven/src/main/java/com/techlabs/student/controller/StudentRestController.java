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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.student.entity.Student;
import com.techlabs.student.repository.StudentRepository;

@CrossOrigin
@RestController
@RequestMapping("api/v2")
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentRepository.getStudents();

	}

	@GetMapping("/students/{rollNo}")
	public Student getStudent(@PathVariable String rollNo) {
		return studentRepository.getStudent(rollNo);
	}

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		studentRepository.addStuddent(student);
		return student;
	}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		studentRepository.updateStudent(student);
		return student;
	}

	@DeleteMapping("/students/{rollNo}")
	public void deleteStudent(@PathVariable String rollNo) {
		studentRepository.deleteStudent(rollNo);
	}
}
