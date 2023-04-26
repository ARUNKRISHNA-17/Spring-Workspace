package com.example.demo.pRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pRevise.Revision;

public interface RevRepository extends JpaRepository<Revision,Integer> {

}
