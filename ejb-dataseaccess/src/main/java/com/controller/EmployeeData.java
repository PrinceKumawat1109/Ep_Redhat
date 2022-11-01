package com.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.entity.Employee;
import com.model.EmployeeRemote;

@ManagedBean(name="emp",eager=true)
public class EmployeeData {
	int empid;
	String name;
	int salary;
	String response;
	List<Employee> list;
	
	@EJB(lookup="java:global/ejb-dataseaccess/EmployeeManager!com.model.EmployeeRemote")
	EmployeeRemote ER;
	public void save()
	{
	    try
	   {
	        Employee E=new Employee();
	        E.setEmpid(empid);
	        E.setName(name);
	        E.setSalary(salary);
	        
	        response =ER.saveData(E);
	    }
	    catch(Exception e)
	    {
	        response=e.getMessage();
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
	        
	        response =ER.updateData(E);
	    }
	    catch(Exception e)
	    {
	        response=e.getMessage();
	}
	}
	
	public void delete()
	{
	    try
	   {
	        Employee E=new Employee();
	        E.setEmpid(empid);
	        E.setName(name);
	        E.setSalary(salary);
	        
	        response =ER.deleteData(E);
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
	public List<Employee> getList() {
		{
			try {
				list= ER.getData();
				System.out.println(list);
			}catch(Exception e)
			{
				response = e.getMessage();
				System.out.println(response);
			}
		}
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}

}
