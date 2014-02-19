package com.strutstest.user.action;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.strutstest.user.model.User;


public class LoginAction extends ActionSupport implements RequestAware,SessionAware{
	private Map<String, String> request;
	private Map session;
	private Map application;
	private User user;
	
	public LoginAction(){
		//request=(Map) ActionContext.getContext().get("request");
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		session.put("name", user.getName());
		System.out.println("user.name="+user.getName());
		return "success";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setSession(Map session) {
		// TODO Auto-generated method stub
		this.session=session;
	}
	public void setRequest(Map request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	
}