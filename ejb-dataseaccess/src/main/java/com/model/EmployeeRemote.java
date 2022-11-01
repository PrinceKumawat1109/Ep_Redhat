package com.model;

import java.util.List;

import javax.ejb.Remote;

import com.entity.Employee;

@Remote
public interface EmployeeRemote {

	public String saveData(Employee E) throws Exception;
	public List<Employee> getData() throws Exception;
	public String updateData(Employee E) throws Exception;
	public String deleteData(Employee E) throws Exception;	
}
