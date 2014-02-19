package com.strutstest.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.strutstest.user.model.User;

public class UserAction extends ActionSupport{
	
	private User user;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "error";
	}
	public String add(){
		System.out.println("user.name="+user.getName());
		return "success";
	}
	public String remove(){
		return "error";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}