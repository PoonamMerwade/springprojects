package com.cts.swrb.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable {
	private static final long serialVersionUID=-7898908897L;
	private final String jwttoken;
	
	public AppSecurityToken(String jwttoken) {
		this.jwttoken=jwttoken;
	}
	public String getToken() {
		return this.jwttoken;
	}
	

}
