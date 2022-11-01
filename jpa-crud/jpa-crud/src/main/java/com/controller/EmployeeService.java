package com.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entity.Employee;
import com.model.EmployeeRemote;

@ManagedBean(name = "emp", eager = true)
public class EmployeeService 
{
	int empid;
	String name;
	int salary;
	String response;
	
	List<Employee> list;
	
	@EJB(lookup = "java:global/jpa-crud/EmployeeModel!com.model.EmployeeRemote")
	EmployeeRemote ER;
	
	public void delete()
	{
		try
		{
			response = ER.deleteData(empid);
		}catch(Exception e)
		{
			response = e.getMessage();
		}
	}
	
	public void update()
	{
		try
		{
			Employee E=new Employee();
			E.setEmpid(empid);
			E.setName(name);
			E.setSalary(salary);
			
			response = ER.updateData(empid, E);
			
		}catch(Exception e)
		{
			response = e.getMessage();
		}
	}
	
	public void find()
	{
		try
		{
			Employee E = ER.findData(empid);
			empid = E.getEmpid();
			name = E.getName();
			salary = E.getSalary();
		}catch(Exception e)
		{
			response = e.getMessage();
		}
	}
	
	public void insert()
	{
		try 
		{
			Employee E=new Employee();
			E.setEmpid(empid);
			E.setName(name);
			E.setSalary(salary);
			
			response = ER.insertData(E);
		} catch (Exception e) 
		{
			response = e.getMessage();
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
	public List<Employee> getList() 
	{
		try 
		{
			list = ER.readAll();
		} catch (Exception e) 
		{
			response = e.getMessage();
		}
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
}
