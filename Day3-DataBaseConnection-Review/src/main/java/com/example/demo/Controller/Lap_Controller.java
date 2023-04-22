package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Lap_Service;
import com.example.demo.review.Laptop_DBMS;
@RestController

public class Lap_Controller 
{
	@Autowired
	public Lap_Service lser;
	@PostMapping("/ldbms")
	public Laptop_DBMS addDetails(@RequestBody Laptop_DBMS lb)
	{
		return lser.saveInfo(lb);
	}
}
