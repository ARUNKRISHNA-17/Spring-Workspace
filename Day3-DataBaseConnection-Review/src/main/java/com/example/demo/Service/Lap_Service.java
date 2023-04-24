package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Lap_Repo;
import com.example.demo.review.Laptop_DBMS;
@Service

public class Lap_Service 
{
	@Autowired
	public Lap_Repo lrepo;
	public Laptop_DBMS saveInfo(Laptop_DBMS ld)
	{
		return lrepo.save(ld);
	}
	
	public Optional<Laptop_DBMS> getInfo(int id) 
	{
		return lrepo.findById(id);
	}
	public Laptop_DBMS updateDetails(Laptop_DBMS ld) 
	{
		return lrepo.saveAndFlush(ld);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		 lrepo.deleteById(id);
	}
}
