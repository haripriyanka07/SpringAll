package com.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDAO;
import com.aopdemo.dao.ProductDAO;
import com.aopdemo.dao.newProductDAO;
import com.aopdemo.service.TrafficService;

public class AroundHandleExceptionDemoApp {

	public static void main(String[] args) {

		//read spring congif
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficService service = context.getBean("trafficService", TrafficService.class);
		
		
		System.out.println("\nMain program : aroundDemoapp");
		
		boolean flag = true;
		String result = service.getFortune(flag);
		
		System.out.println("\n result : "+result);
		
		
		//close
		context.close();
	}

}
