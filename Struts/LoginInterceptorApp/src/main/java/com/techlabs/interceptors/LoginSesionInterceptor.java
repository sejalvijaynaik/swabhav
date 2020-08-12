package com.techlabs.interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginSesionInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("destroy() executed");
	}

	@Override
	public void init() {
		System.out.println("init() executed");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		Object username = ServletActionContext.getRequest().getSession().getAttribute("username");
		Object password = ServletActionContext.getRequest().getSession().getAttribute("password");
		
		if((username == null)&&(password == null)) {
			return actionInvocation.invoke();
		}
		return "input";
	}

}
