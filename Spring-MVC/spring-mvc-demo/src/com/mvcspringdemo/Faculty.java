package com.mvcspringdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mvcspringdemo.validation.CourseCode;

public class Faculty {
	
	@NotNull(message="Required")
	@Size(min=1, message="Required")
	private String firstName;
	
	@NotNull(message="Required")
	@Min(value=1, message="should have atleast one year experience")
	@Max(value=10, message="should have atmost 10 years experience")
	private Integer experience; 
	
	@Pattern(regexp="^[0-9]{6}", message="Only 6 digits" )
	private String pinCode;
	
	@CourseCode
	private String courseCode;
	
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	private String lastName;
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
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	

}
