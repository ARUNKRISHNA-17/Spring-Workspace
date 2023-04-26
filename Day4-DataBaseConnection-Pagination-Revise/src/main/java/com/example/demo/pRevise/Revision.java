package com.example.demo.pRevise;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Revision_Table")
public class Revision 
{
	@Id
	private int revno;
	private String revname;
	private int revage;
	
	public int getRevno() {
		return revno;
	}
	public void setRevno(int revno) {
		this.revno = revno;
	}
	public String getRevname() {
		return revname;
	}
	public void setRevname(String revname) {
		this.revname = revname;
	}
	public int getRevage() {
		return revage;
	}
	public void setRevage(int revage) {
		this.revage = revage;
	}
	
}
