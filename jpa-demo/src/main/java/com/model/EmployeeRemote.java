package com.model;

import javax.ejb.Remote;

import com.entity.Employee;

@Remote
public interface EmployeeRemote 
{
	public String insertData(Employee E) throws Exception;
	
}
