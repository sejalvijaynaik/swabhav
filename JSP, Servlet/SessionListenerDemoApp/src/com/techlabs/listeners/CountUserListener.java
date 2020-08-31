package com.techlabs.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountUserListener implements HttpSessionListener {

	private ServletContext context;
	private static int activeUsers;
	private static int totalUsers;

	public CountUserListener() {
		System.out.println("CountUserListener constructor running");
	}

	public void sessionCreated(HttpSessionEvent event) {

		System.out.println("In listener session created");

		activeUsers = activeUsers + 1;
		totalUsers = totalUsers + 1;

		System.out.println("Inlistener totaloUsers : " + totalUsers);
		System.out.println("Inlistener activeUsers : " + activeUsers);

		context = event.getSession().getServletContext();
		context.setAttribute("activeUsers", activeUsers);
		context.setAttribute("totalUsers", totalUsers);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {

		System.out.println("In listener session destroyed");

		activeUsers = activeUsers - 1;
		context.setAttribute("activeUsers", activeUsers);

		System.out.println("Inlistener totaloUsers : " + totalUsers);
		System.out.println("Inlistener activeUsers : " + activeUsers);
	}
}
