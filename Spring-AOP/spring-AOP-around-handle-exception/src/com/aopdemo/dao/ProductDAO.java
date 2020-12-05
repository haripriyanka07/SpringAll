package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class ProductDAO {

	public void addProduct() {
		System.out.println(getClass() + " Adding a product");
	}
}
