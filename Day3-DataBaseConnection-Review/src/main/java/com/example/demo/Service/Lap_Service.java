package com.example.demo.Service;

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
}
