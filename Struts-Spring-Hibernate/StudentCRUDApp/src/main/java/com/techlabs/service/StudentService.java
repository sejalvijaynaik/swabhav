package com.techlabs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techlabs.entity.Student;
import com.techlabs.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.getStudnets();
	}
	
	public void addStudent(String name, String address, int age) {
		studentRepository.addStudent(name, address, age);
	}
	
	public Student getStudent(String rollNo) {
		return studentRepository.getStudent(rollNo);
	}
	
	public void updateStudent(String rollNo, String name, String address, int age) {
		studentRepository.updateStudent(rollNo, name, address, age);
	}
	
	public void deleteStudent(String rollNo) {
		studentRepository.deleteStudent(rollNo);
	}
}
