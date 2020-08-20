package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class FirstTimeLoadRegisterAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		System.out.println("FirstTimeLoadRegisterAction execute running");

		return "input";
	}
}
