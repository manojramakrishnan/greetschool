package com.school.greet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/", "/index" }, method = RequestMethod.GET)
	public ModelAndView homeScreen() {
		System.err.println("inside default get method");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("school/index.html");
		return modelAndView;
	}

	public HomeController() {
		
	}
}
