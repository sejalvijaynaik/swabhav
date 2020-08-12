package com.techlabs.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("ageinterceptor destry() executed");
	}

	@Override
	public void init() {
		System.out.println("ageinterceptor init() executed");
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("Pre processing");
		ValueStack valueStack = actionInvocation.getStack();
		Integer age = Integer.parseInt((String) (valueStack.findValue("age")));
		System.out.println(age.getClass());
		
		String ageGroup = "";
		if(age < 18) {
			ageGroup = "Child";
		}
		else if((age >= 18) && (age < 50)) {
			ageGroup = "Adult";
		}
		else {
			ageGroup = "Senior";
		}
		
		valueStack.set("ageGroup", age + "(" + ageGroup + ")");
		
		String result = actionInvocation.invoke();
		
		System.out.println("Post processing");
		return result;
	}
}
