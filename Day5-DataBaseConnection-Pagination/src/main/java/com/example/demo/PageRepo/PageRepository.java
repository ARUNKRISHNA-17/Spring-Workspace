package com.example.demo.PageRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Pagination.Pagination;


public interface PageRepository extends JpaRepository<Pagination, Integer> {

}
