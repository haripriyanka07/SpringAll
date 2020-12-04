package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	@Pointcut("execution(* com.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.aopdemo.dao.*.*(*))")
	public void havingOneParameter() {}
	
	//any method in that particular package
	@Before("forDaoPackage()")
	public void beforeAddProductAdvice() {
		System.out.println("\n>> Method before any method with any returntype and any modifier as return type and with any number of parameters in the given package using @Before");
	}
	
	@Before("forDaoPackage()")
	public void performOther() {
		System.out.println("\n>> Performing new task");
	}
	
	@Before("forDaoPackage() && havingOneParameter()")
	public void newTask() {
		System.out.println("\n>> methods having one parameter");
	}
}
