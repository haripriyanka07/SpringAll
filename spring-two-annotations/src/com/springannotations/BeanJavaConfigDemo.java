package com.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanJavaConfigDemo {

	public static void main(String[] args) {
		
		//read config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LanguageConfig2.class);

		//get bean from spring container
		Java lang = context.getBean("java", Java.class);
		
		//call a method
		lang.language();
		lang.exec();
		lang.getPrint();
		lang.printStatment();
		
		// close
		context.close();
	}

}
