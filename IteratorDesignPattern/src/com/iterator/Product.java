package com.iterator;

public class Product {

	String productname;
	float quantity;
	
	public Product(String productname, float quantity) {
		super();
		this.productname = productname;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productname=" + productname + ", quantity=" + quantity + "]";
	}
	
}
