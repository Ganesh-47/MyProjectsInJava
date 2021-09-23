package com.aspire.jdbcclasses;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class TestConnection {

private static String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
 private static String MYSQL_CONNECTION_URL=
   "jdbc:mysql://localhost:3306/world";
public static void main(String args[]){
	testMYSQLConnection();
}

public static void testMYSQLConnection()
 {
     Connection con =null;
     String strUserName="root";
     String strPassword="Ganesh@123";
  try
  {
   java.util.Properties p = new java.util.Properties();
   p.put("user",strUserName);
   p.put("password",strPassword);
   String driverName=MYSQL_DRIVERNAME;
   Class.forName(driverName);
   String url=MYSQL_CONNECTION_URL;
   con= DriverManager.getConnection(url,p);
   boolean flag=con.isClosed();
   if(!flag)
       System.out.println("Connection Open ");
   else
    System.out.println("Connection Closed ");
   }catch (SQLException sqe)
   {
   System.out.println("SQLException:  " + sqe.getMessage());
   }catch (Exception e2)
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
   }
   catch (Exception e)
   {
     System.out.println("Error in closing Connection: " + e);
      }
   }//end of finally

 }


}
