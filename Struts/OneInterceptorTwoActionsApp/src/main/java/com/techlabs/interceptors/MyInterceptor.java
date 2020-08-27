package com.techlabs.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("MyInterceptor destroy() execured");
	}

	@Override
	public void init() {
		System.out.println("MyInterceptor init() executed");		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("Pre processing");
		boolean lala = true;
		if(lala == true) {
			System.out.println("if condition");
			return actionInvocation.invoke();
			
		}
		else{
			System.out.println("else condition");
			return "error";
		}
		//System.out.println(actionInvocation.getAction().getClass().getSimpleName());
		//String result = actionInvocation.invoke();
		//System.out.println("Post processing");
		//return "error";
	}
}

