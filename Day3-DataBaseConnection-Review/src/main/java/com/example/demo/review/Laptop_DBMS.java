package com.example.demo.review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="lap_review")
public class Laptop_DBMS 
{
	@Id    
	private int LaptopId;
	private String LaptopName;
	private String LaptopOS;
	private String CPU;
	private String GPU;
	private String Ram;
	private String Storage;
	private String AdditionalFeatures;
	private String AmenitiesProvided;
	private String LaptopPrice;
	private int CustomerRatings;
	private int NoOfLaptopsInStock;
	private int NoOfLaptopsToBeOrdered;
	private int userid;
	private String username;
	private String password;
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLaptopId() {
		return LaptopId;
	}
	public void setLaptopId(int laptopId) {
		LaptopId = laptopId;
	}
	public String getLaptopName() {
		return LaptopName;
	}
	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}
	public String getLaptopOS() {
		return LaptopOS;
	}
	public void setLaptopOS(String laptopOS) {
		LaptopOS = laptopOS;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public String getStorage() {
		return Storage;
	}
	public void setStorage(String storage) {
		Storage = storage;
	}
	public String getAdditionalFeatures() {
		return AdditionalFeatures;
	}
	public void setAdditionalFeatures(String additionalFeatures) {
		AdditionalFeatures = additionalFeatures;
	}
	public String getAmenitiesProvided() {
		return AmenitiesProvided;
	}
	public void setAmenitiesProvided(String amenitiesProvided) {
		AmenitiesProvided = amenitiesProvided;
	}
	public String getLaptopPrice() {
		return LaptopPrice;
	}
	public void setLaptopPrice(String laptopPrice) {
		LaptopPrice = laptopPrice;
	}
	public int getCustomerRatings() {
		return CustomerRatings;
	}
	public void setCustomerRatings(int customerRatings) {
		CustomerRatings = customerRatings;
	}
	public int getNoOfLaptopsInStock() {
		return NoOfLaptopsInStock;
	}
	public void setNoOfLaptopsInStock(int noOfLaptopsInStock) {
		NoOfLaptopsInStock = noOfLaptopsInStock;
	}
	public int getNoOfLaptopsToBeOrdered() {
		return NoOfLaptopsToBeOrdered;
	}
	public void setNoOfLaptopsToBeOrdered(int noOfLaptopsToBeOrdered) {
		NoOfLaptopsToBeOrdered = noOfLaptopsToBeOrdered;
	}
	
	
	
}
