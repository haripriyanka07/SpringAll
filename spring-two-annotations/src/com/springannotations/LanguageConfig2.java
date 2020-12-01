package com.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:language.properties")
public class LanguageConfig2 {
	@Bean 
	public Execute runtime() {
		return new Runtime();
	}
	
	@Bean
	public Language java() {
		return new Java(runtime());
	}
}
