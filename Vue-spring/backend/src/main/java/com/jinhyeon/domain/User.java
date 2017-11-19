package com.jinhyeon.domain;

public class User {
	private int id;
	private String user;

	public User() {}
	public User(String user) { 
		this.user = user;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return user;
	}
	public void setUserName(String user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + "]";
	}
}
