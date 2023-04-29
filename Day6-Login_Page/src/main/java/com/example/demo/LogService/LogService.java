package com.example.demo.LogService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.LogRepository.LogRepo;
import com.example.demo.LoginData.LogData;
@Service
public class LogService 
{
	@Autowired
	private LogRepo lrepo;
	
	public String loginAccessCheck(String username,String password)
	{
		LogData user = lrepo.findByusername(username);
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
	public LogData addUser(LogData log)
	{
		return lrepo.save(log);
	}
	public List<LogData> getData()
	{
		return lrepo.findAll();
	}
}
