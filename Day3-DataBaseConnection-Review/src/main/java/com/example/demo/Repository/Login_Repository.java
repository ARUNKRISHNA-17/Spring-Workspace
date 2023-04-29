package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.review.LoginCheck;

public interface Login_Repository extends JpaRepository<LoginCheck, Integer>
{
	LoginCheck findByownername(String ownername);
}
