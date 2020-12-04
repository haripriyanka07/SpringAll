package com.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficService {

	public String getFortune() {
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "TRaffic";
	}
}
