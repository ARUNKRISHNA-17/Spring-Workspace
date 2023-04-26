package com.example.demo.Pagination;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Pagination 
{
	@Id
	private int bookSno;
	private String bookName;
	private String bookAuthor;
	public int getBookSno() {
		return bookSno;
	}
	public void setBookSno(int bookSno) {
		this.bookSno = bookSno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
}
