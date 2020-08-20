package com.techlabs.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

class LoggingInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("Logging Interceptor Initialized");
	}

	@Override
	public void init() {
		System.out.println("Logging Interceptor Destroyed");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		String className = actionInvocation.getAction().getClass().getName();
		long startTime = System.currentTimeMillis();
		System.out.println("Before calling action: " + className);

		String result = actionInvocation.invoke();

		long endTime = System.currentTimeMillis();
		System.out.println("After calling action: " + className + " Time taken: " + (endTime - startTime));
		System.out.println(result);

		return result;
	}
}
