package com.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springannotations")
public class LanguageConfig {
	public Execute runtime() {
		return new Runtime();
	}
	
	public Language java() {
		return new Java(runtime());
	}
}
