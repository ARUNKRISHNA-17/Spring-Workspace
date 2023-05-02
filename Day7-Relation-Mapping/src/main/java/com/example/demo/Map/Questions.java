package com.example.demo.Map;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Questions 
{
	@Id
	private int qno;
	private String question;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Answers> answ;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnsw() {
		return answ;
	}
	public void setAnsw(List<Answers> answ) {
		this.answ = answ;
	}
	
	
}
