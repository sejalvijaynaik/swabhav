package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoggingAction extends ActionSupport {

	public LoggingAction() {
		System.out.println("logging action constructor");
	}

	@Override
	public String execute() throws Exception {

		System.out.println("loggingAction exeute running");
		return "success";
	}

}
