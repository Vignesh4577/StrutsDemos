package com.example.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegistorAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//the property that matches the form feilds 
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
//	public String execute() {
//		//this is the to call the service layer
//		if(username.equals("java class")){
//			return "success";
//		}
//		else
//		return "input";
//	}
	
}
 