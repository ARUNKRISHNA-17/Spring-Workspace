package com.example.demo.review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login_data")
public class LoginCheck 
{
	@Id
	private int ownerid;
	private String ownername;
	private String ownerpassword;
	
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getOwnerpassword() {
		return ownerpassword;
	}
	public void setOwnerpassword(String ownerpassword) {
		this.ownerpassword = ownerpassword;
	}	
	
}
	
	
