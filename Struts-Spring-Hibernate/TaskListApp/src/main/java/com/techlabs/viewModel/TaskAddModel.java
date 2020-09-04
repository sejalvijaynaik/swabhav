package com.techlabs.viewModel;

import org.springframework.stereotype.Component;

@Component
public class TaskAddModel {

	private String title;
	private boolean done;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
}
