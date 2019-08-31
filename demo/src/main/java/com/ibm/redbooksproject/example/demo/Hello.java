package com.ibm.redbooksproject.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class Hello {
	public String name;
	public String date;
	public String getDate() {
		return date;
	}

	
	public String greetings;

	public Hello(String name) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
	  date = dateFormat.format(new Date());
	 
			this.name = name;
		//this.date = new Date();
		this.greetings = String.format("Hello, %s!!", name);
	}

	public String getName() {
		return name;
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