package com.javatpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="author")
	private String author;
	
	@Column(name="launchdate")
	private Date launchdate;
	
	@Column(name="bookname")
	private String bookname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getLaunchdate() {
		return launchdate;
	}
	public void setLaunchdate(Date launchdate) {
		this.launchdate = launchdate;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	 
	
	

}
