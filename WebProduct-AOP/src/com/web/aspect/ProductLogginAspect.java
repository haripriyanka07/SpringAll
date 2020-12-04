package com.web.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductLogginAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.web.controller.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.web.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.web.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {}
	
	@Before("forAppFlow()")
	public void before(JoinPoint jp) {
		String method = jp.getSignature().toShortString();
		logger.info("\n>> @before returning Methods "+method);
		
		Object[] agrs = jp.getArgs();
		for(Object temp:agrs) {
			logger.info("arguments "+temp);
		}
	}
	
	@AfterReturning(
			pointcut="forAppFlow()",
			returning = "result")
	public void afterReturning(JoinPoint jp, Object result) {
		String method = jp.getSignature().toShortString();
		logger.info("\n>> @after returning Methods "+method);
		
		logger.info("result: "+result);
	}

}
