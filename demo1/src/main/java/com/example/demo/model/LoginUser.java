package com.example.demo.model;


public class LoginUser{


	public String name;
	public String password;
	
	public LoginUser() {

	}

	@Override
	public String toString() {
		return "LoginUser [name=" + name + ", password=" + password + "]";
	}

	public LoginUser(String name, String password) {
		super();
		this.password = password;
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}}