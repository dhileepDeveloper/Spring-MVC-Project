package com.spring.messi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Tis is dhileep change 
@Component
public class SampleBean {

	@Value("${sql.username}") 
	private String userName;
	
	@Value("${sql.password}") 
	private String password;

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

	@Override
	public String toString() {
		return "SampleBean [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
