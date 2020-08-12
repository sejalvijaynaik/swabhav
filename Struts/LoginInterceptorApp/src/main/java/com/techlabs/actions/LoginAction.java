package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	String username;
	String password;

	public String execute() {
		ServletActionContext.getRequest().getSession().setAttribute("username", "username");
		ServletActionContext.getRequest().getSession().setAttribute("password", "password");
		
		return "success";
	}

	@Override
	public void validate() {

		if(username.equals("")) {
			addFieldError("username", "Username is required");
		}
		else if(!(username.equals("admin"))) {
			addFieldError("username", "Username is incorrect");
		}
		if(password.equals("")) {
			addFieldError("password", "Password is required");
		}
		else if(!(password.equals("admin"))) {
			addFieldError("password", "Password is incorrect");
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
