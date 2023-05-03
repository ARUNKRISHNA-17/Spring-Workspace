package com.example.demo.WModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Watch_Table")
public class Watch 
{
	@Id
	private int wno;
	private String WatchId;
	public int getWno() {
		return wno;
	}
	public void setWno(int wno) {
		this.wno = wno;
	}
	public String getWatchId() {
		return WatchId;
	}
	public void setWatchId(String watchId) {
		WatchId = watchId;
	}
	
	
}
