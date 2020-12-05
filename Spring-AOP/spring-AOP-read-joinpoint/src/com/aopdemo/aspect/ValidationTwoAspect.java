package com.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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
	public void validationTwo(JoinPoint jp) {
		System.out.println("\n>> validationTwo");
		
		MethodSignature methodsign = (MethodSignature) jp.getSignature();
		
		System.out.println("Method: "+ methodsign);
		
		Object[] args = jp.getArgs();
		
		for(Object temp : args) {
			System.out.println(temp);
		}
		
	}
	
}