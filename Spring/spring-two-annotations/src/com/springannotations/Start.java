package com.springannotations;

import org.springframework.stereotype.Component;

@Component
public class Start implements Execute{

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Starting the executing process");
	}

}
