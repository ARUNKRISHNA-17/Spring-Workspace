package com.example.demo.Service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CRUD.CRUD;
import com.example.demo.Repository.CRUDRepo;
@Service
public class CRUDService 
{
	@Autowired
	public CRUDRepo crepo;
	public CRUD saveInfo(CRUD cr)
	{
		return crepo.save(cr);
	}
	public void deleteDetails(int id) 
	{
		crepo.deleteById(id);
	}
	public CRUD getDetails(int id) 
	{
		return crepo.findById(id).get();
	}
	public CRUD updateDetails(CRUD crd)
	{
		return crepo.saveAndFlush(crd);
	}
}
