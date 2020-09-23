package com.techlabs.actions;

import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.PersonService;

public class UploadAction extends ActionSupport {

	@Autowired
	private PersonService personService;
	private String name;
	private File imageFile;

	@Override
	public String execute() throws Exception {

		System.out.println("Name " + name);
		System.out.println("File" + imageFile);
		
		personService.addPersom(name, imageFile);

		return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getImageFile() {
		return imageFile;
	}

	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}

}
