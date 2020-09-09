package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.EmailService;

public class RegisterAction extends ActionSupport {

	private String firstName;
	private String lastName;
	private String email;
	private Integer age;
	private String captchaCode;

	public String execute() {

		System.out.println("execute running");

		return "success";
	}

	public String registerDo() {
		System.out.println("registerDo running");

		EmailService emailService = new EmailService();
		emailService.sendMail(email);

		return "success";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCaptchaCode() {
		return captchaCode;
	}

	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}

	@Override
	public void validate() {

		System.out.println("validate running");
		if (captchaCode == null) {
			addFieldError("captchaCode", "Please enter the verification code.");
		} else {
			Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "formCaptcha");
			boolean isHuman = captcha.validate(captchaCode);
			if (!isHuman) {
				addFieldError("captchaCode", "Incorrect code.");
			}

			// reset captcha code textbox
			captchaCode = null;
		}
		if (firstName == null) {
			addFieldError("", "");
		} else {
			if (firstName.equals("")) {
				addFieldError("firstName", "First name is required");
			}
			if (lastName.equals("")) {
				addFieldError("lastName", "Last name is required");
			}
			if (email.equals("")) {
				addFieldError("email", "Email is required");
			}
			if (age == null) {
				addFieldError("age", "Age is required");
			}
		}
	}
}
