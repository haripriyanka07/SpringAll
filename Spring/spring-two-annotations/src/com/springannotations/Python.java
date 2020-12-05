package com.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Python implements Language {
	@Autowired
	@Qualifier("start")
	private Execute ex;
	
//	@Value("${hari.printStatement}")
//	private String statement;
	
//	@Autowired
//	@Qualifier("start")
//	public void setEx(Execute ex) {
//		System.out.println("Setter injection");
//		this.ex = ex;
//	}
//	@Autowired
//	public Python(@Qualifier("start")Execute exc) {
//		System.out.println("constructor injection with Qualifier");
//		this.ex = exc;
//	}
	
//	@Autowired
//	public void methodInject(Execute ex) {
//		System.out.println("Method injection");
//		this.ex = ex;
//	}

	@Override
	public void language() {
		System.out.println("Python");
	}
	public Python() {
		System.out.println("default injection");
	}
	
//	@Autowired
//	public Python(Execute exc) {
//		System.out.println("constructor injection");
//		this.ex = exc;
//	}
	@Override
	public void exec() {
		ex.exec();
	}
//	@Override
	public void printStatment() {
//		System.out.println(statement);
	}
	
	// my init method
	@PostConstruct
	public void startUp() {
		System.out.println("Stared");
	}
	//my destroy method
	@PreDestroy
	public void destroy() {
		System.out.println("Ended");
	}
	
}
