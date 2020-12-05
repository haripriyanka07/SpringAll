package com.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class ValidationTwoAspect {
	
	@After("execution(* com.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint jp) {
		
		String method = jp.getSignature().toShortString();
		System.out.println("\n>>Executing @AfterThrowing on method: "+method);
		
	}
	
	
	@AfterThrowing(
			pointcut="execution(* com.aopdemo.dao.AccountDAO.findAccounts(..))",
			throwing="exc")
	public void afterThrowingFindAccountsAdvice(JoinPoint jp, Throwable exc) {
		String method = jp.getSignature().toShortString();
		System.out.println("\n>>Executing @AfterThrowing on method: "+method);
		
		System.out.println("\n>> Exception is : "+exc);
		
	}
	
	

	@AfterReturning(pointcut="execution(* com.aopdemo.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterReturningFindAccountsAdvice(
			JoinPoint jp, List<Account> result) {
		
		String method = jp.getSignature().toShortString();
		System.out.println("\n>>Executing @AfterReturning on method: "+method);
		
		System.out.println("\n>> result is : "+result);
		
		convertAccountNamesToUpperCase(result);
		
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for(Account temp: result) {
			String uppername = temp.getName().toUpperCase();
			
			temp.setName(uppername);
		}
		System.out.println("\n>> result is : "+result);
		
	}
		
}