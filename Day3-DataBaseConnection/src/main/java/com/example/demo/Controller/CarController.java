package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CarModel;
import com.example.demo.Repository.CarRepo;
import com.example.demo.Service.CarService;
@RestController

public class CarController 
{
	@Autowired
	public CarService cser;
	@Autowired
	public CarRepo cr;
	@PostMapping("/savedec")
	
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveInfo(cr);
	}
	
	@GetMapping("/getcar")
	public List<CarModel> getDetails()
	{
		return cser.getInfo();
	}
	@PutMapping("/updatecar")
	public CarModel updateDetails(@RequestBody CarModel cc)
	{
		return cser.updateInfo(cc);
	}
	@DeleteMapping("/deletecar/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		cser.deleteInfo(id);
		return "Car ID "+id+" Deleted";
	}
	@DeleteMapping("/deleteByReq")
	public String deleteByRequesPara(@RequestParam("id")int id)
	{
		cser.deleteInfo(id);
		return "Car ID "+id+" is deleted";
	}
	@GetMapping("/sortDes/{cname}")
	public List<CarModel> sortCar(@PathVariable("cname") String cname)
	{
		return cser.sortDesc(cname);
	}
	@GetMapping("/pagination/{pno}/{psi}")
	public List<CarModel> paginationData(@PathVariable("pno")int pno,@PathVariable("psi")int psi)
	{
		return cser.paginationData(pno, psi);
	}
	@GetMapping("/pagination/{pno}/{psi}/{cname}")
	public List<CarModel> paginationData(@PathVariable("pno")int pno,@PathVariable("psi")int psi,@PathVariable("cname")String cname)
	{
		return cser.paginationSorting(pno, psi, cname);
	}
	@GetMapping("saveall")
	public List<CarModel> getD()
	{
		return cr.getAllData();
	}
	@GetMapping("/byName/{id}")
	public List<CarModel> getName(@PathVariable("id")int id)
	{
		return cr.bycname(id);
	}
	@GetMapping("startend/{start}/{end}")
	public List<CarModel> startend(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return cr.startEnd(start, end);
	}
	@DeleteMapping("/deletebyid/{id}/{name}")
	public String deleteCar(@PathVariable("id")int id,@PathVariable("name")String name)
	{
		cr.deleteID(id, name);
		return id+" was deleted";
	}
}
