package com.techlabs.service;

import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Person;
import com.techlabs.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public void addPersom(String name, File imageFile) {

		byte[] bFile = new byte[(int) imageFile.length()];

		try {
			FileInputStream fileInputStream = new FileInputStream(imageFile);
			fileInputStream.read(bFile);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			personRepository.addPersom(name, new SerialBlob(bFile));
		} catch (SerialException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Person getPerson(String id) {
		return personRepository.getPerson(id);
	}
	
	public List<Person> getPersons(){
		return personRepository.getPersons();
	}
}
