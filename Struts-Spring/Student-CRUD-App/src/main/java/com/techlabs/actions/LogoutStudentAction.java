package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutStudentAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {

		sessionMap.invalidate();
		System.out.println("In logout action");
		System.out.println(sessionMap.get("username"));
		System.out.println(sessionMap.get("password"));
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {

		sessionMap = (SessionMap<String, Object>) session;
	}

}
