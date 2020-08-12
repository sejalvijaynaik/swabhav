package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {

	public String name;

	public HomeAction() {
		System.out.println("Home action created");
	}

	@Override
	public String execute() throws Exception {
		System.out.println(" excecute method");
		for (int i = 0; i < 5; i++) {
			name = "sonam";
			System.out.println("name is" + name);
		}
		return "success";
	}

	public String getName() {
		return name;
	}
}
