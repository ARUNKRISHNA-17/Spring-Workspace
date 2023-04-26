package com.example.demo.PageController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.PageService.PageSer;
import com.example.demo.Pagination.Pagination;
@RestController
public class PageControl 
{
	@Autowired
	public PageSer pser;
	@PostMapping("/postPage")
	public Pagination saveDetails(@RequestBody Pagination pg)
	{
		return pser.saveInfo(pg);
	}
	@GetMapping("sortdesc/{pname}")
	public List<Pagination> sortDesc(@PathVariable("pname")String pname)
	{
		return pser.sortDesc(pname);
	}
	@GetMapping("sortasc/{pname}")
	public List<Pagination> sortAsc(@PathVariable("pname")String pname)
	{
		return pser.sortAsc(pname);
	}
	@GetMapping("/paginationData/{bno}/{bsize}")
	public List<Pagination> paginationData(@PathVariable("bno")int bno,@PathVariable("bsize")int bsize)
	{
		return pser.paginationData(bno, bsize);
	}
	@GetMapping("/paginationData/{pgno}/{pgsize}/{pname}")
	public List<Pagination> paginationData(@PathVariable("pgno")int pgno,@PathVariable("pgsize")int pgsize,@PathVariable("pname")String pname)
	{
		return pser.paginationSort(pgno, pgsize, pname);
	}
}
