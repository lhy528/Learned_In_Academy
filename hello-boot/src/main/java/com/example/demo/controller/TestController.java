package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController: jsp나 html 같은 별도의 view 없이 문자열 데이터를 보낼 수 있음

@RestController
public class TestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Boot World";
	}
	
//	@GetMapping("/lombok")
	
}
