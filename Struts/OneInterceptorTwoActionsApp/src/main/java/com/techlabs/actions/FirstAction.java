package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {

	public FirstAction() {
		System.out.println("First action constructor running");
	}

	@Override
	public String execute() throws Exception {

		System.out.println("First action execute method running");
		
		return "success";
	}

}
