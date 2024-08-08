package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.TestJacoco;

import java.io.File;
import java.io.IOException;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!";
	}

	@GetMapping("/generate_report")
	public String generateReport() throws IOException {
		TestJacoco generator = new TestJacoco(new File("./"));//传递工程目录
		generator.create();
		return "file generated";
	}
}
