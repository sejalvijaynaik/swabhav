package com.techlabs.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("destroy() execured");
	}

	@Override
	public void init() {
		System.out.println("init() execured");		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("Pre processing");
		String result = actionInvocation.invoke();
		System.out.println("Post processing");
		return result;
	}
}
