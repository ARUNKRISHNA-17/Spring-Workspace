package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation 
{
	@Value("${pname:Arunkrishna E S}")
	public String pname;
	@GetMapping("/value")
	public String print()
	{
		return "Hello! My name is "+pname;
	}
}
