package com.example.demo.ORepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.OneToOne.OAns;

public interface ARepository extends JpaRepository<OAns, Integer> {

}
