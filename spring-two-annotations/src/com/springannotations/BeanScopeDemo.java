package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		//load the spring file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean 
		Language lang = context.getBean("python", Language.class);
		
		Language lang2 = context.getBean("python", Language.class);
		
		//check
		boolean result = (lang == lang2);
		
		//print
		System.out.println(result);
		
		//memory location
		System.out.println("LAnguage " + lang);
		System.out.println("LAnguage 2 " + lang2);
		
		//close
		context.close();
		
	}

}
