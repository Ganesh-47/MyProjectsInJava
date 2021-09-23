package com.aspire.jdbcclasses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CityList {

	public static void main(String[] args) {

				Connection con =null;
				PreparedStatement ps = null;  
			  try
			  {
				   con=ConnectionFactoryForAspire.getMYSQLWorldConnection();
				   ps  = con.prepareStatement("select * from City");
				   ps.executeQuery();
				   ResultSet rs = ps.getResultSet();
				   //con.close();
				   while (rs.next())
				   {    
				    System.out.println(rs.getInt(1)+" "+rs.getString(2)+"\t "+rs.getString(3)+"\t "+rs.getString(4));
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
