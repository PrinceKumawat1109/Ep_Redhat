package com.kpn.sql_collable;
import java.sql.*;
public class with_argument_insert
{
    public static void main( String[] args ) throws Exception
    {
	String url = "jdbc:mysql://localhost:3306/ep";
	String username = "root";
	String password = "1109";
	Connection con = DriverManager.getConnection(url,username,password);
	CallableStatement cs = con.prepareCall("{CALL getDetails(?)}");
	cs.setInt(1,1002);
	ResultSet rs = cs.executeQuery();
	while(rs.next())
	{

		System.out.println("Name:" + rs.getString(1));
		System.out.println("Id:" + rs.getInt(2));
		System.out.println("Name:" + rs.getString(3));
	}
	con.close();
	}
}
