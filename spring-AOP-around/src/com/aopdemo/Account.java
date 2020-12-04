package com.aopdemo;

public class Account {
	
	private String name;
	private String level;
	
	public Account() {
		
	}
		
	public Account(String name, String level) {
		this.name = name;
		this.level = level;
	}
	

	@Override
	public String toString() {
		return "Account [name=" + name + ", level=" + level + ", getName()=" + getName() + ", getLevel()=" + getLevel()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	

}
