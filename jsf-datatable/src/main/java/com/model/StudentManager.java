package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	String url="jdbc:mysql://localhost:3306/ep";
	String username="root";
	String psswd="1109";
	Connection con=null;
	PreparedStatement ps=null;
	public List<Student> readData() throws Exception {
		con=DriverManager.getConnection(url,username,psswd);
		ps=con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
	    List<Student> L = new ArrayList<Student>();
	    while(rs.next())
	    {
		      Student S = new Student();
		      
		      S.setId(rs.getInt(2));
		      S.setName(rs.getString(1));
		      S.setDept(rs.getString(3));
		      L.add(S);
	    }
	    return L;
	}
}
