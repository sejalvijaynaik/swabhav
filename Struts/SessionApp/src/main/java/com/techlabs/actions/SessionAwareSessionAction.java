package com.techlabs.actions;

import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class SessionAwareSessionAction extends ActionSupport implements SessionAware {

	private Integer oldValue;
	private Integer newValue;
	private SessionMap<String, Object> sessionMap;

	@Override
	public void setSession(Map<String, Object> session) {

		sessionMap = (SessionMap<String, Object>) session;

	}

	@Override
	public String execute() throws Exception {

		oldValue = 0;
		newValue = 1;

		if ((sessionMap.get("oldValue") == null) && (sessionMap.get("newValue") == null)) {
			sessionMap.put("oldValue", oldValue);
			sessionMap.put("newValue", newValue);
			System.out.println(sessionMap.get("oldValue"));
			System.out.println(sessionMap.get("newValue"));
		} else {
			oldValue = Integer.parseInt(sessionMap.get("oldValue").toString()) + 1;
			newValue = Integer.parseInt(sessionMap.get("newValue").toString()) + 1; 
			
			sessionMap.put("oldValue", oldValue);
			sessionMap.put("newValue", newValue);
		}
		return "success";
	}

	public Integer getOldValue() {
		return oldValue;
	}

	public void setOldValue(Integer oldValue) {
		this.oldValue = oldValue;
	}

	public Integer getNewValue() {
		return newValue;
	}

	public void setNewValue(Integer newValue) {
		this.newValue = newValue;
	}

}
