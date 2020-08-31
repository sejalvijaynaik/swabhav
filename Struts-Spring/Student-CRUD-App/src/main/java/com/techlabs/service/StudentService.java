package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}

	public Student getStudent(String rollNo) {
		return studentRepository.getStudent(rollNo);
	}

	public void addStudent(String name, String address, int age) {
		studentRepository.addStudent(name, address, age);
	}

	public void updateStudent(String rollNo, String name, String address, int age) {
		studentRepository.updateStudent(rollNo, name, address, age);
	}

	public void deleteStudent(String rollNo) {
		studentRepository.deleteStudent(rollNo);
	}

	public List<Student> searchStudents(String name) {
		return studentRepository.searchStudents(name);
	}
}
