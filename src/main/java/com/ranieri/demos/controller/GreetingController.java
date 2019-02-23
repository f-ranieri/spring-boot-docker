package com.ranieri.demos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("greeting")
	public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name) {
		return String.format("Hello, %s!", name);
	}

}
