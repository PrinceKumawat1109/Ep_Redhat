package com.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentManager 
{
	String url="jdbc:mysql://localhost:3306/ep";
	String un="root";
	String psw="1109";
	Connection con=null;
	PreparedStatement ps=null;
	
	public String saveData(Student S) throws Exception
	  {
	    con=DriverManager.getConnection(url,un,psw);
	    ps=con.prepareStatement("insert into student values(?,?,?)");
	    ps.setString(1, S.getName());
	    ps.setInt(2, S.getId());
	    ps.setString(3, S.getDept());
	    
	    ps.execute();
	    con.close();
	    return "Data Inserted....";
	  }
	public String deleteData(int sid) throws Exception 
	  {
	    con = DriverManager.getConnection(url,un,psw);
	    ps = con.prepareStatement("delete from student where Id=?");
	    
	    ps.setInt(1, sid);
	    
	    ps.execute();
	    con.close();
	    
	    return "data deleted successfully....";
	      
	  }
	public String updateData(Student B) throws Exception 
	  {
		
	    con = DriverManager.getConnection(url,un,psw);
	    ps = con.prepareStatement("update from student where studentid=?");
	    
	    ps.setInt(1, 30854);
	    
	    ps.execute();
	    con.close();
	    
	    return "data updated successfully....";
	      
	  }
	public List<Student>readData()
	{
		List<Student>L=new ArrayList<Student>();
		try
		{
			con=DriverManager.getConnection(url,un,psw);
			ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Student S=new Student();
				S.setName(rs.getString(1));
				S.setId(rs.getInt(2));
				S.setDept(rs.getString(3));
				L.add(S);
			}
			con.close();
		}
		catch(Exception e)
		{
			
		}
		return L;
	}
}
