package com.beans;

import java.io.Serializable;

public class Book implements Serializable{

	private String ISBN;
	private String bookname;
	private String bookPublication;
	private String author;
	private int price;
	
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookPublication() {
		return bookPublication;
	}
	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String iSBN, String bookname, String bookPublication, String author, int price) {
		super();
		ISBN = iSBN;
		this.bookname = bookname;
		this.bookPublication = bookPublication;
		this.author = author;
		this.price = price;
	}
	
	

}
