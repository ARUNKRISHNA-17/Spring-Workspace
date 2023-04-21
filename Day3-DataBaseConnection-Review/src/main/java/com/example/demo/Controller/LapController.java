package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LapService;
import com.example.demo.review.LaptopConfigurations;
@RestController
public class LapController 
{
	@Autowired
	public LapService lser;
	@PostMapping("/lapconfig")
	public LaptopConfigurations addDetails(@RequestBody LaptopConfigurations lc)
	{
		return lser.saveInfo(lc);
	}
}
