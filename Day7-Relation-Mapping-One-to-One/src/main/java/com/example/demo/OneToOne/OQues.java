package com.example.demo.OneToOne;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="OneToOneModel")
public class OQues 
{
	@Id
	private int sno;
	private String qn;
	private int qmark;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	public OAns ans_no;
	public OAns getAns_no() {
		return ans_no;
	}
	public void setAns_no(OAns ans_no) {
		this.ans_no = ans_no;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getQn() {
		return qn;
	}
	public void setQn(String qn) {
		this.qn = qn;
	}
	public int getQmark() {
		return qmark;
	}
	public void setQmark(int qmark) {
		this.qmark = qmark;
	}
	
}
