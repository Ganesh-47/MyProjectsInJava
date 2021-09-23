package com.aspire.dbms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

public class EmployeeDataAccessController {
public static HashSet<Employee> viewAllEmployee(){
		HashSet<Employee> hashsetEmp=new HashSet<Employee>();
	   Connection con =null;
	   PreparedStatement ps = null;  
	   try
	   {
	    con=ConnectionFactory.getMYSQLAspireConnection();
	    ps  = con.prepareStatement("select * from employee");
	    ps.executeQuery();
	    ResultSet rs = ps.getResultSet();
	    while (rs.next())
	    {
	    	Employee emp=new Employee(rs.getInt(1));
	    	emp.setName(rs.getString(2));
	    	emp.setSalary(rs.getLong(3));
	    	hashsetEmp.add(emp);
	    	
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
	return hashsetEmp;
}

public static Employee findEmployee(int id)
 {
  Connection con =null;
  PreparedStatement ps = null;
  Employee empfound=null;
  try
  {
   con=ConnectionFactory.getMYSQLAspireConnection();
   ps  = con.prepareStatement("select * from employees where id=?");
   ps.setInt(1, id);
   ps.executeQuery();
   ResultSet rs = ps.getResultSet();
   while (rs.next())
   {
    empfound=new Employee(rs.getInt(1));
    empfound.setName(rs.getString(2));
    empfound.setSalary(rs.getDouble(3));     
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
  return empfound;
  }



public static int insertNewEmployee(Employee modifiedemployee)
 {
  int insertresult=0;
  Connection con =null;
  PreparedStatement selectemployee_ps = null;
  PreparedStatement insertemployee_ps = null;
  try
  {
   con=ConnectionFactory.getMYSQLAspireConnection();
   String selectqry="select * from employees where id=?";   
   selectemployee_ps  = con.prepareStatement(selectqry);
   selectemployee_ps.setInt(1, modifiedemployee.getId());
   selectemployee_ps.executeQuery();
   ResultSet rs = selectemployee_ps.getResultSet();
   if (rs.next())
   {
    insertresult=0;// Record already in Table
    return insertresult;
   }
   else
   {
    String insertqry="insert into employees values(?,?,?)";
    insertemployee_ps= con.prepareStatement(insertqry);
    insertemployee_ps.setInt(1, modifiedemployee.getId());
    insertemployee_ps.setString(2, modifiedemployee.getName());
    insertemployee_ps.setDouble(3, modifiedemployee.getSalary());    
    insertresult = insertemployee_ps.executeUpdate();
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
     if (selectemployee_ps != null)    selectemployee_ps.close();
    }
    catch (Exception e)
    {
      System.out.println("Error in closing Connection: " + e);
       }
    }
  return insertresult;
 }
public static int updateEmployee(Employee modifiedemployee)
 {
  int updateresult=0;
  Connection con =null;
  PreparedStatement selectemployee_ps = null;
  PreparedStatement updateemployee_ps = null;
  try
  {
   con=ConnectionFactory.getMYSQLAspireConnection();
   selectemployee_ps  = con.prepareStatement("select * from employees where id=?");
   selectemployee_ps.setInt(1, modifiedemployee.getId());
   selectemployee_ps.executeQuery();
   ResultSet rs = selectemployee_ps.getResultSet();
   if (!rs.next())
   {
    updateresult=0;
    return updateresult;
   }
   else
   {
    updateemployee_ps= con.prepareStatement("update employees set name=?,salary=? where id=?");
    updateemployee_ps.setString(1, modifiedemployee.getName());
    updateemployee_ps.setDouble(2, modifiedemployee.getSalary());
    updateemployee_ps.setInt(3, modifiedemployee.getId());
    updateresult = updateemployee_ps.executeUpdate();
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
     if (selectemployee_ps != null)    selectemployee_ps.close();
    }
    catch (Exception e)
    {
      System.out.println("Error in closing Connection: " + e);
       }
    }
  return updateresult;
 }
public static int deleteEmployee(int id)
 {
  int deleteresult=0;
  Connection con =null;
  PreparedStatement selectemployee_ps = null;
  PreparedStatement deleteemployee_ps = null;
  try
  {
   con=ConnectionFactory.getMYSQLAspireConnection();
   String selectqry="select * from employees where id=?";
   
   selectemployee_ps  = con.prepareStatement(selectqry);
   selectemployee_ps.setInt(1, id);
   selectemployee_ps.executeQuery();
   ResultSet rs = selectemployee_ps.getResultSet();
   if (!rs.next())
   {
    deleteresult=0;// Record NOT FOUND TO DELETE in Table
    return deleteresult;
   }
   else
   {
    String deleteqry="delete from aspire.employees where id=?";
    deleteemployee_ps= con.prepareStatement(deleteqry);
    deleteemployee_ps.setInt(1, id);
    deleteresult = deleteemployee_ps.executeUpdate();
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
     if (selectemployee_ps != null)    selectemployee_ps.close();
    }
    catch (Exception e)
    {
      System.out.println("Error in closing Connection: " + e);
       }
    }
  return deleteresult;
 }

}
