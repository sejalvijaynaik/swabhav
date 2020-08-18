package com.techlabs.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import com.opensymphony.xwork2.ActionSupport;

@Results({ @Result(name = "success", location = "/success.jsp"), @Result(name = "error", location = "/error.jsp") })
@Action("/testAction")
public class TestAction extends ActionSupport {

	@Override
	public String execute() throws Exception {

		System.out.println("Test action is running");
		return "success";
	}

}
