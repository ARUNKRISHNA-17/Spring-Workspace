package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CRUD.CRUD;
import com.example.demo.Service.CRUDService;
@RestController
public class CRUDController 
{
	@Autowired
	public CRUDService crser;
	@PostMapping("/add")
	public CRUD addDetails(@RequestBody CRUD cru)
	{
		return crser.saveInfo(cru);
	}
	@DeleteMapping("/deleteCrud")
	public String deleteDetails(@PathVariable("id")int id)
	{
		crser.deleteDetails(id);
		return "Deletion of "+id+" was successful";
	}
	@GetMapping("/getCrud")
	public CRUD getDetails(@PathVariable("id")int id)
	{
		return crser.getDetails(id);
	}
	public CRUD updateDetails(@RequestBody CRUD crd)
	{
		return crser.updateDetails(crd);
	}
}
