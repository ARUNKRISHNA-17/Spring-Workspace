package com.example.demo.LogController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.LogService.LogService;
import com.example.demo.LoginData.LogData;
@RestController
@RequestMapping("/log")
public class LogController 
{
	@Autowired
	private LogService lser;
	
	@PostMapping("/postData")
	public String login(@RequestBody Map<String,String> loginData)
	{
		String username = loginData.get("username");
		String password = loginData.get("password");
		String result = lser.loginAccessCheck(username, password);
		return result;
	}
	@PostMapping("/adduser")
	public LogData addUser(@RequestBody LogData log)
	{
		return lser.addUser(log);
	}
	@GetMapping("/getLog")
	public List<LogData> listAll()
	{
		return lser.getData();
	}
	
}
