package com.techlabs.actions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Person;
import com.techlabs.service.PersonService;

public class DisplayAction extends ActionSupport {

	@Autowired
	private PersonService personService;
	private Person person;
	private String id;
	private InputStream inputStream;
	private List<Person> persons;

	public InputStream getInputStream() {
		return inputStream;
	}

	@Override
	public String execute() throws Exception {

		persons = personService.getPersons();

		return "success";

	}

	public String displayImage() throws SQLException, IOException {

		System.out.println("image display running");
		System.out.println(id);
		person = personService.getPerson(id);
		System.out.println(person.getImage());
		Blob image = person.getImage();
		byte[] imageBytes = image.getBytes(1l, (int) image.length());

		inputStream = new ByteArrayInputStream(imageBytes);

		return "success";

	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}
