package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Revise.Revise;
import com.example.demo.Service.RService;
@RestController
public class RController 
{
	@Autowired
	public RService rser;
	@PostMapping("/post")
	public Revise saveDetails(@RequestBody Revise rev)
	{
		return rser.saveInfo(rev);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id")int id)
	{
		rser.deleteInfo(id);
		return id+" has been deleted successfully";
	}
	@GetMapping("/get/{id}")
	public Optional<Revise> getDetails(@PathVariable("id")int id)
	{
		return rser.getInfo(id);
	}
	@PutMapping("/put/{id}")
	public Revise updateDetails(@RequestBody int id)
	{
		return rser.updateInfo(id);
	}
}
