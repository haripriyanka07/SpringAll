package com.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.ProductDAO;
import com.aopdemo.dao.newProductDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		//read spring congif
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean
		ProductDAO product = context.getBean("productDAO", ProductDAO.class);
		
		newProductDAO newproduct = context.getBean("newProductDAO", newProductDAO.class);
		
		//call business method
		product.addProduct();
		
		newproduct.addProducts();
		
		int x = newproduct.addNumber();
		
		newproduct.addProducts(5);
		
		//close
		context.close();
	}

}
