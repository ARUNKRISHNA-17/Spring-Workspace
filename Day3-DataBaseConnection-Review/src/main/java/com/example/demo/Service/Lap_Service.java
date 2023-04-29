package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public Optional<Laptop_DBMS> getInfo(int id) 
	{
		return lrepo.findById(id);
	}
	public List<Laptop_DBMS> getData(Laptop_DBMS ldbm)
	{
		return lrepo.findAll();
	}
	public Laptop_DBMS updateDetails(Laptop_DBMS ld) 
	{
		return lrepo.saveAndFlush(ld);
	}
	public void deletedetails(int id) 
	{
		lrepo.deleteById(id);
	}
	public List<Laptop_DBMS> sortDesc(String lname)
	{
		return lrepo.findAll(Sort.by(lname).descending());
	}
	public List<Laptop_DBMS> sortAsc(String lname)
	{
		return lrepo.findAll(Sort.by(lname).ascending());
	}
	public List<Laptop_DBMS> paginationD(int pgno,int pgsize)
	{
		Page<Laptop_DBMS> p = lrepo.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	public List<Laptop_DBMS> paginationS(int pgno,int pgsize,String lname)
	{
		Page<Laptop_DBMS> ps = lrepo.findAll(PageRequest.of(pgno, pgsize, Sort.by(lname).descending()));
		return ps.getContent();
		
	}
	public String loginCheckData(String username,String password)
	{
		Laptop_DBMS user = lrepo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	public Laptop_DBMS addUser(Laptop_DBMS ld)
	{
		return lrepo.save(ld);
	}
	public List<Laptop_DBMS> getData()
	{
		return lrepo.findAll();
	}

}
