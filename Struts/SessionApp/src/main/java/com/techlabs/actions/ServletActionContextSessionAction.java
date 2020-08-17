package com.techlabs.actions;

import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;

public class ServletActionContextSessionAction implements Action {

	private String oldValue;
	private String newValue;

	@Override
	public String execute() throws Exception {

		HttpSession session = ServletActionContext.getRequest().getSession();

		oldValue = "0";
		newValue = "1";

		if ((session.getAttribute("oldValue") == null) && (session.getAttribute("newValue") == null)) {
			session.setAttribute("oldValue", oldValue);
			session.setAttribute("newValue", newValue);
		}

		else {
			oldValue = (String) (session.getAttribute("oldValue"));
			newValue = (String) (session.getAttribute("newValue"));
			int oldValueInInt = Integer.parseInt(oldValue) + 1;
			int newVlaueInInt = Integer.parseInt(newValue) + 1;
			oldValue = String.valueOf(oldValueInInt);
			newValue = String.valueOf(newVlaueInInt);
			session.setAttribute("oldValue", oldValue);
			session.setAttribute("newValue", newValue);
		}

		return SUCCESS;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

}
