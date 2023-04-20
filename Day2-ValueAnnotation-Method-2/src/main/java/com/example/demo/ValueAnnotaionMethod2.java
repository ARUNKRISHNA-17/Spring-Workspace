package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotaionMethod2 
{
	@Value("${pname}")
	public String pname;
	
	@GetMapping("/value2")
	public String display()
	{
		return "Hello! My name is "+pname;
	}

}
