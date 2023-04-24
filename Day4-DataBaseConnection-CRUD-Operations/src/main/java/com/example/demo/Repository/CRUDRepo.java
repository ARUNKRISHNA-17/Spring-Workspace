package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.CRUD.CRUD;

public interface CRUDRepo extends JpaRepository<CRUD, Integer> {

}
