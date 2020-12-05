package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Language lang = context.getBean("python", Language.class);
		
		lang.language();
		
		context.close();
	}

}
