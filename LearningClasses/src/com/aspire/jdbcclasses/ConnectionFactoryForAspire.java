package com.aspire.jdbcclasses;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
public class ConnectionFactoryForAspire {
	public static Connection getMYSQLAspireConnection()
	//MYSQL Connection Factory Method
	{
		//  String MYSQL_DRIVERNAME="com.mysql.cj.jdbc.Driver";
		 // String MYSQL_CONNECTION_URL="jdbc:mysql://localhost:3306/world";
		  Connection con =null;
		  FileInputStream dbpropertiesStream=null;
		  String propertiespath="c:\\temp\\db.properties";
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
	@SuppressWarnings("resource")
	public static Connection getMYSQLSConnectionUsingPropertyFile()
	   {
	    Connection con =null;
	    FileInputStream dbpropertiesStream = null;
	    String propertiespath="c:\\temp\\db.properties";
	    Properties dbproperties =null;
	    String mysqlconnectionurl="MYSQL_DB_URL";
	     String strUserName="MYSQL_DB_USERNAME";
	     String strPassword="MYSQL_DB_PASSWORD";
	     BasicDataSource mysqlDS = null;
	      try
	     {
	      dbpropertiesStream=new FileInputStream(propertiespath); 
	      mysqlDS = new BasicDataSource();
	      dbproperties =  new Properties();
	      dbproperties.load(dbpropertiesStream);
	   mysqlDS.setUrl(dbproperties.getProperty(mysqlconnectionurl));
	   mysqlDS.setUsername(dbproperties.getProperty(strUserName));
	   mysqlDS.setPassword(dbproperties.getProperty(strPassword));
	   mysqlDS.setMinIdle(5);
	   mysqlDS.setMaxIdle(10);
	   mysqlDS.setMaxTotal(25);
	   con=mysqlDS.getConnection();
	      }catch (Exception e2)
	      {
	      System.out.println("Exception:  " + e2.getMessage());
	      }
	      finally
	      {
	       try {
	    dbpropertiesStream.close();
	   } catch (IOException e) {
	    e.printStackTrace();
	   }
	      }
	     return con;
	   }
}
