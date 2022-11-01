package com.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entity.Employee;
import com.model.EmployeeRemote;

@ManagedBean(name="emp", eager=true)
public class EmployeeBean 
{
	int empid;
	String name;
	int salary;
	String response;
	@EJB(lookup = "java:global/jpa-demo/EmployeeModel!com.model.EmployeeRemote")
	EmployeeRemote ER;
	public void callInsert() 
	{
		try
		{
			Employee E=new Employee();
			E.setEmpid(empid);
			E.setName(name);
			E.setSalary(salary);
			response=ER.insertData(E);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
}
