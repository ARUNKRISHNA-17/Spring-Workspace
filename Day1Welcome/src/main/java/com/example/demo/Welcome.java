package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome 
{
	public String sname="Arunkrishna E S";
	@GetMapping("/welcome")
	public String print()
	{
		return "Welcome to RestApi "+sname;
	}
}
