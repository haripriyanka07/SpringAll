package com.mvcspringdemo;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student stu = new Student();
		
		model.addAttribute("stu", stu); 
		
		return"student-form";
	}
	
	@RequestMapping("/studentForm")
	public String submitForm(
			@Valid @ModelAttribute("stu") Student student, 
			BindingResult BR) {
		
		System.out.println("YES");
		
		if(BR.hasErrors()) {
			System.out.println("erroe"+ BR.getErrorCount());
			return "student-form";
		}
		else {
		
		String str = Arrays.toString(student.getOs());
		str = str.replace('[', ' ');
		str = str.replace(']', ' ');
//		System.out.println(str);
		
		String result = "Student: "+ student.getFirstName()+" "+student.getLastName() +" From " +student.getCountry() + " fav language "+student.getLanguage()+" operating Systems"+str;
		
//		model.addAttribute("message", result);
		
		System.out.println(result);
		
		return "success";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, ste);
	}

}
