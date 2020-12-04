package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ValidationTwoAspect {

	
//	@Before("com.aopdemo.aspect.MainAspect.forDaoPackage()")
//	public void validationThree() {
//		System.out.println("\n>> validationThree");
//	}
	
	@Before("com.aopdemo.aspect.MainAspect.both()")
	public void validationThree() {
		System.out.println("\n>> validationThree");
	}
	
}