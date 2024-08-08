package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!";
	}

	@GetMapping("/param_test")
	public String paramTest(@RequestParam(name = "param") int param) {
		if(param > 10){
			return "param > 10";
		}else{
			return "param < 10";
		}
	}
}
