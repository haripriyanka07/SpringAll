package com.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aopdemo.dao.AccountDAO;
import com.aopdemo.dao.ProductDAO;
import com.aopdemo.dao.newProductDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {

		//read spring congif
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO acc = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> accs = null;
		try {
			boolean flag = true;
			accs = acc.findAccounts(flag);
		
		}catch(Exception exc) {
			System.out.println("\n\nMain Program.. caught exception: "+exc);
		}
		System.out.println("\n\nMain Program : afterthrowing");
		System.out.println(accs);
		System.out.println("\n");
		
		//close
		context.close();
	}

}
