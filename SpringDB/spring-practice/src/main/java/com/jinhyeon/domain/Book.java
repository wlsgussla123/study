package com.jinhyeon.domain;

public class Book {
	private Integer id;
	private String author;
	private String title;
	private Integer pages;

	public Book() {}
	public Book(String author, String title, Integer pages) {
		super();
		this.author = author;
		this.title = title;
		this.pages = pages;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", pages=" + pages + "]";
	}
}
