package com.techlabs.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Task {

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
	private User user;
	@OneToMany(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<SubTask> subTasks = new HashSet<SubTask>();

	public Task() {
	}

	public Task(UUID id, String title, Date date, boolean done, User user, Set<SubTask> subTasks) {
		this.id = id;
		this.title = title;
		this.date = date;
		this.done = done;
		this.user = user;
		this.subTasks = subTasks;
	}

	public Task(String title, Date date, boolean done, User user) {
		this.title = title;
		this.date = date;
		this.done = done;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(Set<SubTask> subTasks) {
		this.subTasks = subTasks;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", date=" + date + ", done=" + done + "]";
	}
}
