package com.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wekcome {

	@RequestMapping("/")
	public String hello() {
		return "Hello Spring Boot";
	}

}
