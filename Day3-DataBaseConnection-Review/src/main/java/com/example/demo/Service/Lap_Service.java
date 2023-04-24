package com.example.demo.Service;



import java.util.Objects;
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
	public void deletedetails(int id) 
	{
		lrepo.deleteById(id);
	}
	public Optional<Laptop_DBMS> getInfo(int id) {
		// TODO Auto-generated method stub
		return lrepo.findById(id);
	}
	public Laptop_DBMS updateDetails(int id, Laptop_DBMS ld) 
	{
		Laptop_DBMS lapd = lrepo.findById(id).get();
		if(Objects.nonNull(ld.getA_Laptop_Name())&&!"".equalsIgnoreCase(ld.getA_Laptop_Name()))
		{
			lapd.setA_Laptop_Name(ld.getA_Laptop_Name());
		}
		if(Objects.nonNull(ld.getB_CPU())&&!"".equalsIgnoreCase(ld.getB_CPU()))
		{
			lapd.setB_CPU(ld.getB_CPU());;			
		}
		return lrepo.save(lapd);
	}
}
