package com.cts.swrb.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

public class AppUserModel implements Serializable{
	private static final long serialVersionUID=592646885L;
	private String userName;
	private String password;
	
	public AppUserModel() {
	}
	public AppUserModel(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
