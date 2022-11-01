package com.model;

import java.util.List;

import javax.ejb.Remote;

import com.entity.Employee;

@Remote
public interface EmployeeRemote 
{
	public String insertData(Employee E)throws Exception;
	public List<Employee> readAll() throws Exception;
	public Employee findData(int empid) throws Exception;
	public String updateData(int empid, Employee data)throws Exception;
	public String deleteData(int empid) throws Exception;
}
