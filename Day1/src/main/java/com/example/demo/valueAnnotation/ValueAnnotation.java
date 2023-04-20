package com.example.demo.valueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueAnnotation 
{
	@Value("${sname:Volvo}")
	public String sname;
	
	@ResponseBody
	@GetMapping("/hello")
	public String print()
	{
		return "I Like "+sname;
	}
}
