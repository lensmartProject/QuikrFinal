package com.capgemini.Quikr.customermodel;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CustomerModel")
public class CustomerModel {
	private String name;
	private int phoneNo;
	private String emailId;
	private String password;
	private String confirmPassword;
	
	public CustomerModel() {
		super();
	}

	public CustomerModel(String name, int phoneNo, String emailId, String password, String confirmPassword) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
