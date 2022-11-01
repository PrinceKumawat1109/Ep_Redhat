package com.model;

import javax.ejb.Remote;

@Remote
public interface CalculatorRemote {
    
	public int add(int a,int b);
	public int sub(int a,int b);
	public int Mul(int a,int b);
	public int Div(int a,int b);
}
