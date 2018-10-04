package com.test.test;

import org.springframework.stereotype.Controller;

@RestController
public class Demo {

	public static void main(String[] args) {
		System.out.println("hello git");
	}
	
	@GetMapping("/")
	public String test(){
		return "test";
	}
	
}
