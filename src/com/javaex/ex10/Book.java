package com.javaex.ex10;

public class Book {
    //필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	//생성자
	public Book() {
		
	}
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author =author;
		this.stateCode = 1;
		
	}
	//메서드 gs
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	//메서드 일반
    public void rent() {
    	this.stateCode = stateCode;
    	if(stateCode == 0) {
    		System.out.println(this.bookNo + "이 대여되었습니다.");
    	}else if(stateCode == 1) {
    		System.out.println();
    	}
    }
    
    
    
}
