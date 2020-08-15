package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.models.Product;

public class IteratorAction extends ActionSupport {

	private List<Product> products;

	@Override
	public String execute() throws Exception {

		products = new ArrayList<Product>();
		products.add(new Product("123", "top", 1200.00));
		products.add(new Product("222", "pant", 2020.00));
		products.add(new Product("234", "shoes", 4795.00));
		products.add(new Product("384", "belt", 8900.00));

		return "success";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
