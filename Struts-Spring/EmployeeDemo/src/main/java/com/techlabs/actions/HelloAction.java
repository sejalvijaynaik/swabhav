package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		return "success";
	}
}
