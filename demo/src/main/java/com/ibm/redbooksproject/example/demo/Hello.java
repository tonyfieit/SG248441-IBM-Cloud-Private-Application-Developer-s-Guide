package com.ibm.redbooksproject.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;

public class Hello {
	public String name;
	public Date date;
	public String greetings;

	public Hello(String name) {
		this.name = name;
		this.date = new Date();
		this.greetings = String.format("Hello, %s!!", name);
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public String getGreetings() {
		return greetings;
	}

	@ResponseBody
	@ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	public String handleHttpMediaTypeNotAcceptableException() {
		return "acceptable MIME type:" + MediaType.APPLICATION_JSON_VALUE;
	}
}