package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action {

	private String myName;

	@Override
	public String execute() throws Exception {

		myName = "Sejal";
		System.out.println(myName);
		System.out.println(ServletActionContext.getRequest().getAttribute("myName"));
		return SUCCESS;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
}

