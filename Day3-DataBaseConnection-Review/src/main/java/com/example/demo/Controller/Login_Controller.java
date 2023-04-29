package com.example.demo.Controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Login_Service;
import com.example.demo.review.LoginCheck;


@RestController
public class Login_Controller 
{
	@Autowired
	private Login_Service lser;
	
	@PostMapping("/checkData")
	public String login(@RequestBody Map<String,String> loginData)
	{
		String ownername = loginData.get("ownername");
		String ownerpassword = loginData.get("ownerpassword");
		String result = lser.loginAccessCheck(ownername, ownerpassword);
		return result;
	}
	@PostMapping("/adduser")
	public LoginCheck addUser(@RequestBody LoginCheck log)
	{
		return lser.addUser(log);
	}
	@GetMapping("/getLog")
	public List<LoginCheck> listAll()
	{
		return lser.getData();
	}
}
