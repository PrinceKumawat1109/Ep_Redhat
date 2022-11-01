package com.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.model.Student;
import com.model.StudentManager;

@ManagedBean(name="studentdata",eager=true)
public class StudentData 
{
	List<Student> list;

	public List<Student> getList() 
	{
		try
		{
			StudentManager sm=new StudentManager();
			list=sm.readData();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}

	public void setList(List<Student> list) 
	{
		this.list = list;
	}
}
