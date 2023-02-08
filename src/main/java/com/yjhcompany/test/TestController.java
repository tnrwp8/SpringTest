package com.yjhcompany.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/hellow")
	public String hellow() {
		
		
		return "Test";
	}
	@RequestMapping(value = "/good")
	public String good() {
		
		
		return "good";
	}
	
}
