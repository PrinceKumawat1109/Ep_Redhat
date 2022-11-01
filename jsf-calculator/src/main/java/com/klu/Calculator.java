package com.klu;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="calc",eager=true)

public class Calculator 
{
  int a;
  int b;
  int c;
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
  
  public void add()
  {
    c=a+b;
  }
  public void sub()
  {
    c=a-b;
  }
}