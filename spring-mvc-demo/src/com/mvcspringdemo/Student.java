package com.mvcspringdemo;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private String[] os;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "INDIA");
		countryOptions.put("FR", "FRANCE");
		countryOptions.put("DE", "GERMANY");
		countryOptions.put("BR", "BRAZIL");
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

}
