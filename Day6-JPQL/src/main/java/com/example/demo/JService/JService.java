package com.example.demo.JService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.JPQL.JExample;
import com.example.demo.JRepository.JRepository;
@Service
public class JService 
{
	@Autowired
	public JRepository repo;
	public JExample saveInfo(JExample jex)
	{
		return repo.save(jex);
	}
}
