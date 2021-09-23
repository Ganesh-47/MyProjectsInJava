package com.aspire.seedbank.dac;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
	public static Connection getMYSQLSeedbankConnection()
	{
		  Connection con =null;
		  FileInputStream dbpropertiesStream=null;
		  String propertiespath="c:/temp/db.properties";
		  Properties dbproperties=null;
		  		
 try
 {
	
	 dbpropertiesStream=new FileInputStream(propertiespath);
	 dbproperties=new Properties();
	 dbproperties.load(dbpropertiesStream);
	 String mysqlconnectionurl=(dbproperties.getProperty("MYSQL_DB_URL"));
	 String strUserName=(dbproperties.getProperty("MYSQL_DB_USERNAME"));
	 String strPassword=(dbproperties.getProperty("MYSQL_DB_PASSWORD"));
	con=DriverManager.getConnection(mysqlconnectionurl,strUserName,strPassword);
		
 }catch (Exception e2)
		  {
		  return null;
		  }
		return con;
		
				
	}

}
