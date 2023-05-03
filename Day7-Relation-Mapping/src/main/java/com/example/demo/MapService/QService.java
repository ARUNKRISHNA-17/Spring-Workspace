package com.example.demo.MapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Map.Questions;
import com.example.demo.Maprepository.QuestionsRepo;

@Service
public class QService 
{
	@Autowired
	public QuestionsRepo qrepo;
	
	public Questions updateInfo(Questions qq)
	{
		return qrepo.saveAndFlush(qq);
	}

	public void deleteInfo(int id) 
	{
		qrepo.deleteById(id);
	}
}
