package com.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calc", eager = true)
public class Calc 
{
	int a;
	int b;
	String result;
	
	public void callRestSubtract()
	{
		try
		{
			URL url = new URL("http://localhost:8080/rest-demo/calc/sub/" + a + "/" + b);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Accept", "application/json");
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			result = br.readLine();
		}catch(Exception e)
		{
			result = e.getMessage();
		}
	}
	
	public void callRestAdd()
	{
		try
		{
			URL url = new URL("http://localhost:8080/rest-demo/calc/add/" + a + "/" + b);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Accept", "application/json");
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			result = br.readLine();
		}catch(Exception e)
		{
			result = e.getMessage();
		}
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
