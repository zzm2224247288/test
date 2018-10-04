package com.test.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Demo {

	public static void main(String[] args) {
		System.out.println("hello git");
	}
	
	public static void add(String[] args) {
		System.out.println("hello add");
	}
	@GetMapping("/")
	public String test(){
		return "test";
	}
	
}
