package com.techlabs.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	public MyListener() {
		System.out.println("listener constructor");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

		System.out.println("context destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {

		System.out.println("Context Initialized");

		ServletContext context = servletContextEvent.getServletContext();

		context.setAttribute("name", "sejal");
	}
}
