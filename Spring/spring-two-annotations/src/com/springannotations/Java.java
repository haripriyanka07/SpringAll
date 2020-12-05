package com.springannotations;

import org.springframework.beans.factory.annotation.Value;

public class Java implements Language {

	private Execute exc;
	@Value("${hari.printStatement}")
	private String print;
	
	public Java(Execute ex) {
		exc = ex;
	}
	
	@Override
	public void language() {
		System.out.println("Java");
	}

	@Override
	public void exec() {
		exc.exec();
	}

	@Override
	public void printStatment() {
	}
	public void getPrint() {
		System.out.println(print);
	}

}
