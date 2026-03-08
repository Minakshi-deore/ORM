package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library { 
	@Id
	private int bookId;
	private String bookTitle;
	private String authorName;
	private  String publisher;
	private double price;
    private  String language;
    private  boolean isAvailable;
    private String issueDate;
    private  String returnDate;
    
    private  String studentName;
    private  int studentId;
    
	public Library() {
		
	}

	public Library(int bookId, String bookTitle, String authorName, String publisher, double price, String language,
			boolean isAvailable, String issueDate, String returnDate, String studentName, int studentId) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.publisher = publisher;
		this.price = price;
		this.language = language;
		this.isAvailable = isAvailable;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.studentName = studentName;
		this.studentId = studentId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authorName=" + authorName + ", publisher="
				+ publisher + ", price=" + price + ", language=" + language + ", isAvailable=" + isAvailable
				+ ", issueDate=" + issueDate + ", returnDate=" + returnDate + ", studentName=" + studentName
				+ ", studentId=" + studentId + "]";
	}
    
    
}