package com.example.demo.SRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ShoeBase.ShoeLogin;

public interface ShoeRepository extends JpaRepository<ShoeLogin, Integer>
{
	ShoeLogin findByusername(String username);
}
