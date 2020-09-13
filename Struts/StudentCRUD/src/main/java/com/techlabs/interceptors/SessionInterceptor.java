package com.techlabs.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class SessionInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("sessionInterceptor destroy() execured");
	}

	@Override
	public void init() {
		System.out.println("sessionInterceptor init() executed");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		System.out.println("session intercept running");
		System.out.println(actionInvocation.getAction().getClass().getSimpleName());

		HttpSession session = ServletActionContext.getRequest().getSession();

		String result;

		System.out.println(session.getAttribute("username"));
		System.out.println(session.getAttribute("password"));
		if ((session.getAttribute("username") != null) && (session.getAttribute("password") != null)) {
			result = actionInvocation.invoke();
			System.out.println("result" + result);
			return result;
		} else {
			return "login";
		}
	}

}
