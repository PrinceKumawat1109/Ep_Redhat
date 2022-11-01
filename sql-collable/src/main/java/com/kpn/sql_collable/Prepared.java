package com.kpn.sql_collable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepared 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "jdbc:mysql://localhost:3306/ep";
    	String username = "root";
    	String password = "1109";
    	Connection con = DriverManager.getConnection(url,username,password);
    	String qry = "update table1 set bkl = ? where Name = 'Ravi'";
    	PreparedStatement stmt = con.prepareStatement(qry);
    	stmt.setInt(1, 1);
    	
    	stmt.executeUpdate();
    	
    	System.out.println( "Row Inserted...." );
    	con.close();
    }
}