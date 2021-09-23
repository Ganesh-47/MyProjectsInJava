package com.aspire.dbms;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
public class ConnectionFactory {
	public static Connection getMYSQLAspireConnection()
	//MYSQL Connection Factory Method
	{
		//  String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
		 // String MYSQL_CONNECTION_URL="jdbc:mysql://localhost:3306/world";
		  Connection con =null;
		  FileInputStream dbpropertiesStream=null;
		  String propertiespath="c:/temp/db.properties";
		  Properties dbproperties=null;
		  //String strUserName="root";
		  //String strPassword="Ganesh@123";
			
 try
 {
		 /* java.util.Properties p = new java.util.Properties();
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
		   System.out.println("Connection Closed ");*/
	 dbpropertiesStream=new FileInputStream(propertiespath);
	 dbproperties=new Properties();
	 dbproperties.load(dbpropertiesStream);
	 String mysqlconnectionurl=(dbproperties.getProperty("MYSQL_DB_URL"));
	 String strUserName=(dbproperties.getProperty("MYSQL_DB_USERNAME"));
	 String strPassword=(dbproperties.getProperty("MYSQL_DB_PASSWORD"));
	 //System.out.println(mysqlconnectionurl+" "+strUserName+" "+strPassword);
	 con=DriverManager.getConnection(mysqlconnectionurl,strUserName,strPassword);
		/*  }catch (SQLException sqe)
		  {
		  System.out.println("SQLException:  " + sqe.getMessage());
		  }*/
 }catch (Exception e2)
		  {
		  System.out.println("Exception:  " + e2.getMessage());
		  }
		  
		return con;
				
	}
	public static Connection getMYSQLWorldConnection()
	//MYSQL Connection Factory Method
	{
		  String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
		  String MYSQL_CONNECTION_URL="jdbc:mysql://localhost:3306/aspire";
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
		  
		return con;
				
	}
}
