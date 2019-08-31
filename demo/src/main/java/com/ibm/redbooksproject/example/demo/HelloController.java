package com.ibm.redbooksproject.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public Hello hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Hello(name);
	}
}