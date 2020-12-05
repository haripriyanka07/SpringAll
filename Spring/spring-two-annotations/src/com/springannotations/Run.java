package com.springannotations;

import org.springframework.stereotype.Component;

@Component
public class Run implements Execute {

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Program is running");
	}

}
