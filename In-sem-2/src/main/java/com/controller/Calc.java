package com.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.model.CalculatorRemote;

@ManagedBean(name="calc",eager= true)
public class Calc {
	int a;
	int b;
	int c;
	
	@EJB(lookup ="java:global/ejb-statelss/Calculator!com.model.CalculatorRemote")
	CalculatorRemote CR;
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
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void callEjbAdd() {
		c=CR.add(a, b);
	}
	public void callEjbSub() {
		c=CR.sub(a, b);
	}
	public void callEjbMul() {
		c=CR.add(a, b);
	}
	public void callEjbDiv() {
		c=CR.add(a, b);
	}

}
