package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class newProductDAO {

	public void addProducts() {
		System.out.println(getClass() + " Adding a new product");
	}
	
	public int addNumber() {
		System.out.println(getClass() + " Adding a number");
		return -1;
	}
	
	public void addProducts(int s) {
		System.out.println(getClass() + " method with one parameter");
	}
	
}
