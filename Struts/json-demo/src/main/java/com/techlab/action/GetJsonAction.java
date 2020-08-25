package com.techlab.action;
import com.opensymphony.xwork2.Action;

public class GetJsonAction implements Action {
	private String id,name;
	@Override
	public String execute() throws Exception {
		
		return "success";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
