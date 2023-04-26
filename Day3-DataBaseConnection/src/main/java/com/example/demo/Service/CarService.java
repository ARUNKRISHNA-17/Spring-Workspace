package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CarModel;
import com.example.demo.Repository.CarRepo;
@Service
public class CarService 
{
	@Autowired
	public CarRepo crepo;
	public CarModel saveInfo(CarModel c)
	{
		return crepo.save(c);
	}
	public List<CarModel> getInfo()
	{
		return crepo.findAll();
	}
	public CarModel updateInfo(CarModel cm)
	{
		return crepo.saveAndFlush(cm);
	}
	public void deleteInfo(int id)
	{
		crepo.deleteById(id);
	}
	public  List<CarModel> sortDesc(String cname)
	{
		return crepo.findAll(Sort.by(cname).descending());
	}
	public List<CarModel> paginationData(int pgno,int pgsize)
	{
		Page<CarModel> p=crepo.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	public List<CarModel> paginationSorting(int pgno,int pgsize,String cname)
	{
		Page<CarModel> pa=crepo.findAll(PageRequest.of(pgno, pgsize,Sort.by(cname).ascending()));
		return  pa.getContent();
	}
}
