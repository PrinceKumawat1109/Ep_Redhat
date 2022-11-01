package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.entity.Employee;

@Stateless
public class EmployeeManager implements EmployeeRemote{

	@Override
	public String saveData(Employee E) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
		PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
		ps.setInt(1,E.getEmpid());
		ps.setString(2,E.getName());
		ps.setInt(3,E.getSalary());
		ps.execute();
		con.close();
		return "records saved successfully.....";
	}

	@Override
	public List<Employee> getData() throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
		PreparedStatement ps=con.prepareStatement("select * from emp");
		ResultSet rs =ps.executeQuery();
		List<Employee> L= new ArrayList<Employee>();
		while(rs.next()) {
			Employee E =new Employee();
			E.setEmpid(rs.getInt(1));
			E.setName(rs.getString(2));
			E.setSalary(rs.getInt(3));
			
			L.add(E);
			}
		con.close();
		
		return L;
	}

	@Override
	public String updateData(Employee E) throws Exception {
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
			PreparedStatement ps=con.prepareStatement("update emp set name=?, salary=? where empid=?");
			ps.setString(1,E.getName());
			ps.setInt(2,E.getSalary());
			ps.setInt(3,E.getEmpid());
			ps.execute();
			con.close();
			return "Record Updated Successfully ...";
	}

	@Override
	public String deleteData(Employee E) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
		PreparedStatement ps=con.prepareStatement("delete from emp where empid=?");
		ps.setInt(1,E.getEmpid());
		ps.execute();
		con.close();
		return "Record Deleted Successfully.";
	}

}
