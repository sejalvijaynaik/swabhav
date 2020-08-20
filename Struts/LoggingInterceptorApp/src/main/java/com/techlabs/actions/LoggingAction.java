package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoggingAction extends ActionSupport {

	@Override
	public String execute() throws Exception {

		System.out.println("loggingAction exeute running");
		return "success";
	}

}
