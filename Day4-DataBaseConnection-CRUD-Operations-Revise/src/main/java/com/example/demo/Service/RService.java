package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.RRepo;
import com.example.demo.Revise.Revise;
@Service
public class RService 
{
	@Autowired
	public RRepo repo;
	public Revise saveInfo(Revise rev)
	{
		return repo.save(rev);
	}
	public void deleteInfo(int id)
	{
		repo.deleteById(id);
	}
	public Optional<Revise> getInfo(int id)
	{
		return repo.findById(id);
	}
	public Revise updateInfo(int id)
	{
		return repo.findById(id).get();
	}
}
