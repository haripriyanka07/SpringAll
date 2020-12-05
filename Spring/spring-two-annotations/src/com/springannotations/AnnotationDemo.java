package com.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		//read config file
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean from spring container
		Language lang = context.getBean("python", Language.class);
		
		//call a method
		lang.language();
		lang.exec();
		lang.printStatment();
		
		// close
		context.close();
	}

}
