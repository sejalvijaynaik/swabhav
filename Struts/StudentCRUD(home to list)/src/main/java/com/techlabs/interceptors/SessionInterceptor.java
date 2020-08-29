package com.techlabs.interceptors;

import java.util.List;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
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
		System.out.println("action name :" + actionInvocation.getAction().getClass().getSimpleName());
		Map<String, String> application = (Map<String, String>) ActionContext.getContext().get("application");
		HttpSession session = ServletActionContext.getRequest().getSession();
		String result;

		System.out.println(session.getAttribute("username"));
		System.out.println(session.getAttribute("password"));
		if ((session.getAttribute("username") != null) && (session.getAttribute("password") != null)) {
			if (ServletActionContext.getRequest().getParameter("rollNo") != null) {
				application.put("rollNo", ServletActionContext.getRequest().getParameter("rollNo"));
			}
			result = actionInvocation.invoke();
			System.out.println("result" + result);
			return result;
		} else {
			String actionToPerform = "";
			String actionName = actionInvocation.getAction().getClass().getSimpleName();
			if (actionName.equals("AddStudentAction")) {
				actionToPerform = "add";
			} else if (actionName.equals("DeleteStudentAction")) {
				System.out
						.println("rollNo in interceptor :" + ServletActionContext.getRequest().getParameter("rollNo"));
				application.put("rollNo", ServletActionContext.getRequest().getParameter("rollNo"));
				actionToPerform = "delete";
			} else if (actionName.equals("UpdateStudentAction")) {
				System.out
						.println("rollNo in interceptor :" + ServletActionContext.getRequest().getParameter("rollNo"));
				application.put("rollNo", ServletActionContext.getRequest().getParameter("rollNo"));
				actionToPerform = "update";
			}

			application.put("formAction", actionToPerform);
			System.out.println(application.get("formAction"));

			return "login";
		}
	}
}