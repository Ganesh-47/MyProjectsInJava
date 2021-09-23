package com.aspire.jdbcclasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeManger
{
 public static void main(String args[])
 {
     Connection con =null;
  PreparedStatement ps = null;  
  try
  {
   con=ConnectionFactoryForAspire.getMYSQLAspireConnection();
   ps  = con.prepareStatement("select * from employee");
   ps.executeQuery();
   ResultSet rs = ps.getResultSet();
   while (rs.next())
   {
    System.out.println(rs.getInt(1)+" "+rs.getString(2));
   }
   }catch (SQLException sqe)
   {
   System.out.println("SQLException:  " + sqe.getMessage());
   }
   catch (Exception e2)
   {
   System.out.println("Exception:  " + e2.getMessage());
   }
   finally
  {
   try
   {
    if (con != null)
     {
      if(!con.isClosed()) con.close();
     }
    if (ps != null)    ps.close();
   }
   catch (Exception e)
   {
     System.out.println("Error in closing Connection: " + e);
      }
   }
  }
}
