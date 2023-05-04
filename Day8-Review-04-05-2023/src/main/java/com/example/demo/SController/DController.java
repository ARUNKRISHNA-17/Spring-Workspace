package com.example.demo.SController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SRepository.DRepository;
import com.example.demo.SService.DService;
import com.example.demo.ShoeBase.ShoeDetails;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class DController 
{
	@Autowired
	public DRepository drepo;
	
	@Autowired
	public DService dser;
	
	@Tag(name = "Get Method for Shoe Details",description = "User Validation")
	@GetMapping("/dget")
	public List<ShoeDetails> getAllInfo(ShoeDetails  sd)
	{
		return drepo.getAll();
	}
	
	@Tag(name = "Post Method for Shoe Details",description = "Post Validation")
	@PostMapping("/dpost")
	public ShoeDetails postInfo(@RequestBody ShoeDetails sd)
	{
		return dser.postDetails(sd);
	}

}
