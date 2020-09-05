package com.techlabs.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class SubTask {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	private UUID id;
	private String title;
	private Date date;
	private boolean done;
	@ManyToOne
	@JoinColumn
	private Task task;

	public SubTask() {
	}

	public SubTask(UUID id, String title, Date date, boolean done, Task task) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.done = done;
		this.task = task;
	}

	public SubTask(String title, Date date, boolean done, Task task) {
		super();
		this.title = title;
		this.date = date;
		this.done = done;
		this.task = task;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "SubTask [id=" + id + ", title=" + title + ", date=" + date + ", done=" + done  + "]";
	}
	
	
}
