package hr.dac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import hr.entity.Employee;

public class EmployeeDataAccessControl {
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
	    	emp.setCity(rs.getString(3));
	    	emp.setSalary(rs.getDouble(4));
	    	hashsetEmp.add(emp);
	    	
	    }
		return hashsetEmp;
	    }catch (SQLException sqe)
	    {
	    	return null;
	    }
	    catch (Exception e2)
	    {
	    	return null;
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
	    	return null;
	       }
	    }
	//return hashsetEmp;
}

public static Employee findEmployee(int id)
 {
  Connection con =null;
  PreparedStatement ps = null;
  Employee empfound=null;
  try
  {
   con=ConnectionFactory.getMYSQLAspireConnection();
   ps  = con.prepareStatement("select * from employee where id=?");
   ps.setInt(1, id);
   ps.executeQuery();
   ResultSet rs = ps.getResultSet();
   while (rs.next())
   {
    empfound=new Employee(rs.getInt(1));
    empfound.setName(rs.getString(2));
    empfound.setCity(rs.getString(3));
    empfound.setSalary(rs.getDouble(4));   
   }
   return empfound;
   }catch (SQLException sqe)
   {
   return null;
   }
   catch (Exception e2)
   {
	   return null;
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
	   return null;
      }
   }
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
   String selectqry="select * from employee where id=?";   
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
    String insertqry="insert into employee values(?,?,?,?)";
    insertemployee_ps= con.prepareStatement(insertqry);
    insertemployee_ps.setInt(1, modifiedemployee.getId());
    insertemployee_ps.setString(2, modifiedemployee.getName());
    insertemployee_ps.setString(3, modifiedemployee.getCity());  
    insertemployee_ps.setDouble(4, modifiedemployee.getSalary()); 
    insertresult = insertemployee_ps.executeUpdate();
    return insertresult;
   }
   }catch (SQLException sqe)
   {
	   return 0;
   }
   catch (Exception e2)
   {
	   return 0;
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
    	return 0;
       }
    }
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
   selectemployee_ps  = con.prepareStatement("select * from employee where id=?");
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
    updateemployee_ps= con.prepareStatement("update employee set name=?,city=?,salary=? where id=?");
    updateemployee_ps.setString(1, modifiedemployee.getName());
    updateemployee_ps.setString(2, modifiedemployee.getCity());
    updateemployee_ps.setDouble(3, modifiedemployee.getSalary());
    updateemployee_ps.setInt(4, modifiedemployee.getId());
    updateresult = updateemployee_ps.executeUpdate();
    return updateresult;
   }
   }catch (SQLException sqe)
   {
	   return 0;
   }
   catch (Exception e2)
   {
	   return 0;
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
    	return 0;
       }
    }
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
   String selectqry="select * from employee where id=?";
   
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
    String deleteqry="delete from aspire.employee where id=?";
    deleteemployee_ps= con.prepareStatement(deleteqry);
    deleteemployee_ps.setInt(1, id);
    deleteresult = deleteemployee_ps.executeUpdate();
    return deleteresult;
   }
   }catch (SQLException sqe)
   {
   return 0;
   }
   catch (Exception e2)
   {
	   return deleteresult;
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
    	return deleteresult;
       }
    }
  
 }

}
