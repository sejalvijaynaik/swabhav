package com.techlabs.actions;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.UserService;

public class GetEmailsJsonAction extends ActionSupport {

	@Autowired
	private UserService userService;
	private List<String> emails;

	@Override
	public String execute() throws Exception {

		System.out.println("GetEmailsJSONAction running");
		emails = userService.getEmails();
		System.out.println("size of emails" + emails.size());

		return "success";
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

}
