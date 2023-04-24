package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@DeleteMapping("/delete/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		 lser.deletedetails(id);
		 return "Deltion was Successful";
	}
	
	@GetMapping("/ldbms/{id}")
	public Optional<Laptop_DBMS> getDetails(@PathVariable("id")int id)
	{
		return lser.getInfo(id);
	}
	public Laptop_DBMS updateDetails(@PathVariable("id")int id,@RequestBody Laptop_DBMS ld)
	{
		return lser.updateDetails(id,ld);
	}
	
}
