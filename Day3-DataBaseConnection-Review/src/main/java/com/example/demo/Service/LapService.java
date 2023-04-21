package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LapRepo;
import com.example.demo.review.LaptopConfigurations;
@Service
public class LapService 
{
	@Autowired
	public LapRepo lrepo;
	public LaptopConfigurations saveInfo(LaptopConfigurations lcon)
	{
		return lrepo.save(lcon);
	}
}
