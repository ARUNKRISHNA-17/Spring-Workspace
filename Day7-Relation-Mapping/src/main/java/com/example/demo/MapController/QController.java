package com.example.demo.MapController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Map.Questions;
import com.example.demo.Maprepository.QuestionsRepo;

@RestController
public class QController 
{
	@Autowired
	public QuestionsRepo qrep;
	
	@PostMapping("/ques")
	public Questions saveDetails(@RequestBody Questions qq)
	{
		return qrep.save(qq);
	}
	
	@GetMapping("/qget")
	public List<Questions> getDetails(Questions qq)
	{
		return qrep.findAll();
	}
}
