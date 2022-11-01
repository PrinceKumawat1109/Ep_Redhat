package com.kpn.sql_collable;
import java.sql.*;
import java.util.*;
public class inoutpaarmeter
{
    public static void main(String args[]) throws Exception
    {
      Scanner k=new Scanner(System.in);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","1109");
        CallableStatement cs = con.prepareCall("{CALL inoutparam(?)}");
        int id;
        System.out.println("enter id :-");
        
        id=k.nextInt();
        cs.setInt(1,id);
        cs.registerOutParameter(1,Types.INTEGER);
        boolean flag=cs.execute();
        if(!flag)
        {
          int bkl=cs.getInt(1);
           System.out.println("The Number of backlogs to "+id+"=" + bkl);
        }
        else
        {
          System.out.println("Error occured");
        }
        int mark = cs.getInt(1);
       
        con.close();

    }
}