package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class DisplayUserAction extends ActionSupport {

	@Override
	public String execute() throws Exception {

		System.out.println("diplay user action running");
		return "success";
	}
}
