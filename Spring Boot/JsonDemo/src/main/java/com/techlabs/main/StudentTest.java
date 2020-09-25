package com.techlabs.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techlabs.pojo.Student;

public class StudentTest {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();

		try {
			Student student = mapper.readValue(new File("data/student-complex.json"), Student.class);

			System.out.println("student Info");
			System.out.println(student.getRollNo());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student.getAddress().getCity());
			System.out.println(student.getAddress().getState());
			System.out.println(student.getAddress().getPincode());
			for (int i = 0; i < student.getLanguages().length; i++) {
				System.out.println(student.getLanguages()[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
