package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ValidationThreeAspect {

	
//	@Before("com.aopdemo.aspect.MainAspect.forDaoPackage()")
//	public void validationTwo() {
//		System.out.println("\n>> validationTwo");
//	}
	
	@Before("com.aopdemo.aspect.MainAspect.both()")
	public void validationTwo() {
		System.out.println("\n>> validationTwo");
	}
	
}