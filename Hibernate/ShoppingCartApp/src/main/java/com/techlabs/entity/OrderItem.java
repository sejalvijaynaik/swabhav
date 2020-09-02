package com.techlabs.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class OrderItem {

	@Id
	private int id;
	@OneToMany(mappedBy = "orderItem", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<LineItem> lineItems = new HashSet<LineItem>();
	@ManyToOne
	@JoinColumn
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(Set<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
