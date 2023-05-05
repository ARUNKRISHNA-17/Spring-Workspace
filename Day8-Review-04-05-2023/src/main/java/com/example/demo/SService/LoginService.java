package com.example.demo.SService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SRepository.ShoeRepository;
import com.example.demo.ShoeBase.ShoeLogin;

@Service
public class LoginService 
{
	@Autowired
	private ShoeRepository srepo;
	public String loginAccessCheck(String username,String password)
	{
		ShoeLogin user = srepo.findByusername(username);
		if(user == null)
		{
			return "No User Found By that Name!!!!! Please try again";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed!!! Please try again!!";
			}
		}
	}
	public ShoeLogin addUser(ShoeLogin log)
	{
		return srepo.save(log);
	}
	public List<ShoeLogin> getData()
	{
		return srepo.findAll();
	}
	
}
