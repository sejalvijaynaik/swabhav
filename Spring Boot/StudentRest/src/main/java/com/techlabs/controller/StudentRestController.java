package com.techlabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.entity.Student;
import com.techlabs.repository.StudentRepository;

@RestController
@RequestMapping("api")
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentRepository.getStudents();

	}

	@GetMapping("/get-student/{rollNo}")
	public Student getStudent(@PathVariable String rollNo) {
		return studentRepository.getStudent(rollNo);
	}

	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student) {
		studentRepository.addStuddent(student);
		return student;
	}

	@PutMapping("/update-student")
	public Student updateStudent(@RequestBody Student student) {
		studentRepository.updateStudent(student);
		return student;
	}

	@DeleteMapping("/delete-student/{rollNo}")
	public String deleteStudent(@PathVariable String rollNo) {
		studentRepository.deleteStudent(rollNo);
		return "deleted student of roll no " + rollNo; 
	}
}
