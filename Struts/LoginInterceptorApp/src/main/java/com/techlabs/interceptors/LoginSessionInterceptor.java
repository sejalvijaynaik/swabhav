package com.techlabs.interceptors;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginSessionInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("loginsession interceptor destroy() executed");
	}

	@Override
	public void init() {
		System.out.println("loginsession interceptor init() executed");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		Object username = ServletActionContext.getRequest().getSession().getAttribute("username");
		Object password = ServletActionContext.getRequest().getSession().getAttribute("password");
		
		if((username == null)&&(password == null)) {
			System.out.println("Session doesnt exist...directing to login page");
			return "input";
		}
		return "success";
	}

}
