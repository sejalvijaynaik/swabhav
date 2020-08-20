package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {

		sessionMap.invalidate();
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
	}

}
