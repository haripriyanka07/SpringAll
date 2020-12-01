package com.mvcspringdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "home";
	}
	
	@RequestMapping("/studentForm")
	public String submit(HttpServletRequest req, Model model) {
		
		String name = req.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "Hello! "+name;
		
		model.addAttribute("message", result);
		return "success";
	}
	
	
	/* Binding request param*/
//	@RequestMapping("/studentForm")
//	public String submit(@RequestParam("studentName") String name, Model model) {
//		
//	
//		name = name.toUpperCase();
//		
//		String result = "Hello! "+name;
//		
//		model.addAttribute("message", result);
//		
//		return "success";
//	}
	
	/* controller request mapping */
//	@RequestMapping("/")
	
	
}
