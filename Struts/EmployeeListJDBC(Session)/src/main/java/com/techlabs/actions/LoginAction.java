package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String username;
	private String password;
	private String message;
	private SessionMap<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {

		if ((username.equals("admin")) && (password.equals("admin"))) {
			sessionMap.put("username", "username");
			sessionMap.put("password", "password");
			return "success";
		}
		message = "Username and password are incorrect";
		return "input";
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}

}
