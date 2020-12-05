package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class ValidationOneAspect {

	
//	@Before("com.aopdemo.aspect.MainAspect.forDaoPackage()")
//	public void vaildationOne() {
//		System.out.println("\n>> validationOne");
//	}
	
	@Before("com.aopdemo.aspect.MainAspect.both()")
	public void vaildationOne() {
		System.out.println("\n>> validationOne");
	}
	
}
