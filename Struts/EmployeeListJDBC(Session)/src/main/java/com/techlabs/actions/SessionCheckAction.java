package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class SessionCheckAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {

		System.out.println("sessionAction execute running");

		if ((sessionMap.get("username") == null) && (sessionMap.get("password") == null)) {
			return "error";
		}
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}

}
