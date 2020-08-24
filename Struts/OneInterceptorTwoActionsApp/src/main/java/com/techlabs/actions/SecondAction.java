package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class SecondAction extends ActionSupport {

	public SecondAction() {
		System.out.println("SecondAction constructor running");
	}

	@Override
	public String execute() throws Exception {

		System.out.println("SecondAction execute method running");
		
		return "success";
	}

}

