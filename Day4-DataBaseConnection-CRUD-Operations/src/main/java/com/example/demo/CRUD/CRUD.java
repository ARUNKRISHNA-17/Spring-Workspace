package com.example.demo.CRUD;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CRUD")
public class CRUD 
{
	@Id
	private int crid;
	private String crname;
	private int crage;
	public int getCrid() {
		return crid;
	}
	public void setCrid(int crid) {
		this.crid = crid;
	}
	public String getCrname() {
		return crname;
	}
	public void setCrname(String crname) {
		this.crname = crname;
	}
	public int getCrage() {
		return crage;
	}
	public void setCrage(int crage) {
		this.crage = crage;
	}
	
}
