package com.mvcspringdemo;

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
@RequestMapping("/faculty")
public class FacultyController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("faculty", new Faculty());
		return "faculty-form";
	}

	@RequestMapping("/facultyForm")
	public String processForm(
		@Valid @ModelAttribute("faculty") Faculty faculty,
		BindingResult br){
		
		if(br.hasErrors()) {
			return "faculty-form";
		}
		else {
		return "faculty-success";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, ste);
	}
	
}
