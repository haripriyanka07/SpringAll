package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MainAspect {
	
	@Pointcut("execution(* com.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.aopdemo.dao.*.*(*))")
	public void havingOneParameter() {}
	
	@Pointcut("forDaoPackage() && havingOneParameter()")
	public void both() {}

}
