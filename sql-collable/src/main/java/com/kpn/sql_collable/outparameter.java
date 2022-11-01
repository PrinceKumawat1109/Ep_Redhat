package com.kpn.sql_collable;
import java.sql.*;
public class outparameter
{
    public static void main(String args[]) throws Exception
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
        //COnnection Established
        //Now we are going to call the Stored Procedure with {} to mentioned it as JSON object.
        CallableStatement cs = con.prepareCall("{CALL outparameter()}");
        //Now we are going to execute the Query in CallableStatement
        ResultSet rs = cs.executeQuery();
        //Post execution of Query, the entire set of data is stored in ResultSet Object.
        //Now display the data from the ResultSet Object.
        while(rs.next())
        {
                System.out.println("Name:" + rs.getString(1));
                System.out.println("Id:" + rs.getInt(2));
                System.out.println("dept:" + rs.getString(3));
        }
    con.close();
               
    }
}