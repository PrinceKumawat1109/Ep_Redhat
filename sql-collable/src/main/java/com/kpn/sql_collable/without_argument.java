package com.kpn.sql_collable;
import java.sql.*;
public class without_argument 
{
    public static void main( String[] args ) throws Exception
    {
	String url = "jdbc:mysql://localhost:3306/ep";
	String username = "root";
	String password = "1109";
	Connection con = DriverManager.getConnection(url,username,password);
	CallableStatement stmt = con.prepareCall("{CALL getDetails()}");
	ResultSet rs = stmt.executeQuery();
	while(rs.next())
	{
	System.out.println(rs.getString(1) +"\t" +rs.getInt(2) +"\t"+rs.getString(3) +"\t");
	}
	con.close();
    }
}