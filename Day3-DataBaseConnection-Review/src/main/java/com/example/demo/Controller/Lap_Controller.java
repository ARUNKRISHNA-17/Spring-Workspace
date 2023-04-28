package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/lget/{id}")
	public Optional<Laptop_DBMS> getDetails(@PathVariable("id")int id)
	{
		return lser.getInfo(id);
	}
	@DeleteMapping("/ldelete/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		lser.deletedetails(id);
		return "Deltion was Successful";
	}
	@PutMapping("/lupdate")
	public Laptop_DBMS updateDetails(@RequestBody Laptop_DBMS ld)
	{
		return lser.updateDetails(ld);
	}
	@DeleteMapping("/deleteByReq")
	public String deleteReqByPara(@RequestParam("id")int id)
	{
		lser.deletedetails(id);
		return id+" deletion was successful";
	}
	@GetMapping("/sortasc/{lname}")
	public List<Laptop_DBMS> sortDetailsAsc(@PathVariable("lname")String lname)
	{
		return lser.sortAsc(lname);
	}
	@GetMapping("/sortdesc/{lname}")
	public List<Laptop_DBMS> sortDetailsDesc(@PathVariable("A_Laptop_Name")String lname)
	{
		return lser.sortDesc(lname);
	}
	@GetMapping("/paginationD/{pno}/{pgs}")
	public List<Laptop_DBMS> paginationData(@PathVariable("pno")int pno,@PathVariable("pgs")int pgs)
	{
		return lser.paginationD(pno, pgs);
	}
	@GetMapping("/paginationS/{pno}/{pgs}/{lname}")
	public List<Laptop_DBMS> paginationSort(@PathVariable("pno")int pno,@PathVariable("pgs")int pgs,@PathVariable("lname")String lname)
	{
		return lser.paginationS(pno, pgs, lname);
	}
	
}
