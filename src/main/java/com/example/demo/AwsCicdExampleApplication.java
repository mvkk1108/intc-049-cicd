package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class AwsCicdExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCicdExampleApplication.class, args);
	}
@GetMapping("/welcome")
	public String hello()
	{
		return "Hello World !";
			
	}
}
