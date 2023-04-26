package com.example.demo.PageService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.PageRepo.PageRepository;
import com.example.demo.Pagination.Pagination;
@Service
public class PageSer 
{
	@Autowired
	public PageRepository prepo;
	public Pagination saveInfo(Pagination pg)
	{
		return prepo.save(pg);
	}
	public List<Pagination> sortDesc(String pname)
	{
		return prepo.findAll(Sort.by(pname).descending());
	}
	public List<Pagination> sortAsc(String pname)
	{
		return prepo.findAll(Sort.by(pname).ascending());
	}
	public List<Pagination> paginationData(int pgno,int pgsize)
	{
		Page<Pagination> page=prepo.findAll(PageRequest.of(pgno, pgsize));
		return page.getContent();	
	}
	public List<Pagination> paginationSort(int pgno,int pgsize,String pname)
	{
		Page<Pagination> pages=prepo.findAll(PageRequest.of(pgno, pgsize,Sort.by(pname)));
		return pages.getContent();	}
}
