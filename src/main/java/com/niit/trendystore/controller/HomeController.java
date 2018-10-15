 package com.niit.trendystore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	@RequestMapping("/aboutpage")
	public String aboutPage()
	{
		return "aboutpage";
	}
	@RequestMapping("/contact")
	public String contactPage()
	{
		return "contact";
	}
	@RequestMapping("/loginpage")
	public String loginPage()
	{
		return "loginpage";
	}
	
	

	





}
