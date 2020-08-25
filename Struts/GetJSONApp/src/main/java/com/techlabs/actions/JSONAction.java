package com.techlabs.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class JSONAction extends ActionSupport {

	private int id;
	private String name;
	private String address;

	@Override
	public String execute() throws Exception {

		System.out.println("json action execute running");
		
		id = 2;
		name = "sejal";
		address = "mumbai";

		return "success";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
