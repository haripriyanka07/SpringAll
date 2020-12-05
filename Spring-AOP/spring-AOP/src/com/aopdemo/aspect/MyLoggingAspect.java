package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	//executed for all addProduct methods irrespective of the class
//	@Before("execution(public void addProduct())")
//	public void beforeAddProductAdvice() {
//		System.out.println("\n>> Method before addProduct using @Before");
//	}
	
	
	//excuted only for ProductDAO addAProduct
//	@Before("execution(public void com.aopdemo.dao.ProductDAO.addProduct())")
//	public void beforeAddProductAdvice() {
//		System.out.println("\n>> Method before addProduct in ProductDAO using @Before");
//	}
	
	//ececuted for all the methods starting with add
//	@Before("execution(public void add*())")
//	public void beforeAddProductAdvice() {
//		System.out.println("\n>> Method before any method starting with add using @Before");
//	}
	
	//match all the return type and modifier
//	@Before("execution(* add*())")
//	public void beforeAddProductAdvice() {
//		System.out.println("\n>> Method before any method with any returntype and any modifier as return type using @Before");
//	}
	
	//methods with one parameter
//	@Before("execution(* add*(*))")
//	public void beforeAddProductAdvice() {
//		System.out.println("\n>> Method before any method with any returntype and any modifier as return type  and one parameter using @Before");
//	}
	
	//any method in that particular package
	@Before("execution(* com.aopdemo.dao.*.*(..))")
	public void beforeAddProductAdvice() {
		System.out.println("\n>> Method before any method with any returntype and any modifier as return type and with any number of parameters in the given package using @Before");
	}
	
	
}
