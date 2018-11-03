package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("home")
	public String testMethod() {
		System.out.println("Hello World");
		return "home.jsp";
	}
	
	@RequestMapping("home2")
	public String testMethod2() {
		System.out.println("Hello World again on second page");
		return "secondPage.jsp";
	}
}
