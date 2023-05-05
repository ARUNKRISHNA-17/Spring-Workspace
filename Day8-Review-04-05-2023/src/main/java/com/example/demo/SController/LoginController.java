package com.example.demo.SController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SService.LoginService;
import com.example.demo.ShoeBase.ShoeLogin;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class LoginController 
{
	@Autowired
	private LoginService lser;
	
	@Tag(name = "Login Post",description = "Check Data")
	@PostMapping("/checkData")
	public String login(@RequestBody Map<String,String> loginData)
	{
		String username = loginData.get("username");
		String password = loginData.get("password");
		String result = lser.loginAccessCheck(username, password);
		return result;
	}
	
	@Tag(name = "Login Add User",description = "New User")
	@PostMapping("/adduser")
	public ShoeLogin addUser(@RequestBody ShoeLogin log)
	{
		return lser.addUser(log);
	}
	
	@Tag(name = "Login Get All User",description = "Existing User Get")
	@GetMapping("/getLog")
	public List<ShoeLogin> listAll()
	{
		return lser.getData();
	}
}
