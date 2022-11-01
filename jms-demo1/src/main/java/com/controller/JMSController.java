package com.controller;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.model.JMSService;

@ManagedBean(name = "jms", eager = true)
public class JMSController 
{
	String msg;
	String response;
	
	@Inject
	JMSService jms;
	
	public void receiveMsg()
	{
		String message = jms.receiveMessage();
		response = message + ", Received @ " + new Date().toString();
	}
	
	public void sendMsg()
	{
		jms.sendMessage(msg);
		response = msg + ", Sent @ " + new Date().toString();
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
}
