package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Login_Repository;
import com.example.demo.review.LoginCheck;

@Service
public class Login_Service 
{
	@Autowired
	private Login_Repository lrepo;
	
	public String loginAccessCheck(String ownername,String ownerpassword)
	{
		LoginCheck user = lrepo.findByownername(ownername);
		if(user == null)
		{
			return "No User Found By that Name!!!!! Please try again";
		}
		else
		{
			if(user.getOwnerpassword().equals(ownerpassword))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed!!! Please try again!!";
			}
		}
	}
	public LoginCheck addUser(LoginCheck log)
	{
		return lrepo.save(log);
	}
	public List<LoginCheck> getData()
	{
		return lrepo.findAll();
	}
}
