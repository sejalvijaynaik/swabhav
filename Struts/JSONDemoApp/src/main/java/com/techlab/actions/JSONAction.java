package com.techlab.actions;

import com.opensymphony.xwork2.ActionSupport;

public class JSONAction extends ActionSupport {

	private String id;
	private String name;

	@Override
	public String execute() throws Exception {

		System.out.println("action executing");

		id = "123";
		name = "sejal";

		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
