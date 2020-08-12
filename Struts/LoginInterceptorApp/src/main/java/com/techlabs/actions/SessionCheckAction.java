package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SessionCheckAction extends ActionSupport {
	public String execute() {
		System.out.println("session check action running");
		return "success";
	}
}
