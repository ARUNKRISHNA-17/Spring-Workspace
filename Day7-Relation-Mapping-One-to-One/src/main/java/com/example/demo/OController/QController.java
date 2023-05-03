package com.example.demo.OController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ORepository.QRepository;
import com.example.demo.OneToOne.OQues;

@RestController
public class QController 
{
	@Autowired
	public QRepository repo;
	
	@PostMapping("/postO")
	public OQues saveInfo(OQues qu)
	{
		return repo.save(qu);
	}
	
	@DeleteMapping("/deleteO")
	public String deleteInfo(int id)
	{
		repo.deleteById(id);
		return id+" was deleted";
	}
	
	@PutMapping("/updateO")
	public String updateInfo(int id)
	{
		repo.findById(id);
		return id+" was updated";
	}
}
