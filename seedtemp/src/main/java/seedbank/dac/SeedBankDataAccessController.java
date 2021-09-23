package seedbank.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import seedbank.entity.Admin;
import seedbank.entity.Login;
import seedbank.entity.User;

public class SeedBankDataAccessController {
	public String adminLogin(Login login) throws Exception {
			String adminname=null;
		   Connection con =null;
		   PreparedStatement ps = null;  
		   try
		   {
		    con=ConnectionFactory.getMYSQLSeedbankConnection();
		    ps  = con.prepareStatement("select adminpassword,adminname from admin where adminemail=?");
		    ps.setString(1, login.getEmail());
		    ps.executeQuery();
		    ResultSet rs = ps.getResultSet();
		    while (rs.next())
		    {
			    if(	rs.getString(1).equals(login.getPassword())) {
			    	adminname=rs.getString(2);
			    }else	
			    	adminname=null;  
		    }
		    return adminname;
		    }catch (SQLException sqe)
		    {
		    	throw new Exception("SQL Exception Occurs");
		    }
		    catch (Exception e2)
		    {
		    	throw new Exception("Exception Occurs");
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
		    	throw new Exception("Exception Occurs");

		       }
		    }
	}
	public String userLogin(Login login) throws Exception {
		String username=null;
	   Connection con =null;
	   PreparedStatement ps = null;  
	   try
	   {
	    con=ConnectionFactory.getMYSQLSeedbankConnection();
	    ps  = con.prepareStatement("select userpassword,username from user where useremail=?");
	    ps.setString(1, login.getEmail());
	    ps.executeQuery();
	    ResultSet rs = ps.getResultSet();
	    while (rs.next())
	    {
		    if(	rs.getString(1).equals(login.getPassword())) {
		    	username=rs.getString(2);
		    }else	
		    	username=null;  
	    }
	    return username;
	    }catch (SQLException sqe)
	    {
	    	throw new Exception("SQL Exception Occurs");
	    }
	    catch (Exception e2)
	    {
	    	throw new Exception("Exception Occurs");
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
	    	throw new Exception("Exception Occurs");

	       }
	    }
	}
	public int addNewUser(User user)
	 {
	  int userid=0;
	  Connection con =null;
	  PreparedStatement selectemployee_ps = null;
	  PreparedStatement insertuser_ps = null;
	  PreparedStatement insertuseraccount_ps = null;
	  try
	  {
	   con=ConnectionFactory.getMYSQLSeedbankConnection();
	   String selectqry="select * from user where userid=?";   
	   selectemployee_ps  = con.prepareStatement(selectqry);
	   selectemployee_ps.setInt(1, user.getUserid());
	   selectemployee_ps.executeQuery();
	   ResultSet rs = selectemployee_ps.getResultSet();
	   if (rs.next())
	   {
	    userid=0;// Record already in Table
	    return userid;
	   }
	   else
	   {
	    String insertqrypersonal="insert into user values(?,?,?,?,?,?,?,?)";
	    insertuser_ps= con.prepareStatement(insertqrypersonal);
	    insertuser_ps.setInt(1, user.getUserid());
	    insertuser_ps.setString(2, user.getUsername());
	    insertuser_ps.setString(3, user.getUseremail());  
	    insertuser_ps.setDouble(4, user.getUserphone());
	    insertuser_ps.setString(5, user.getUseraddress()); 
	    insertuser_ps.setString(6, user.getUsercity()); 
	    insertuser_ps.setInt(7, user.getUserpincode()); 
	    insertuser_ps.setString(8, user.getUserpassword()); 
	    int insertresultpersonal = insertuser_ps.executeUpdate();
	    String insertqryaccount="insert into useraccount values(?,?,?,?,?)";
	    insertuseraccount_ps= con.prepareStatement(insertqryaccount);
	    insertuseraccount_ps.setInt(1,user.getUserid());
	    insertuseraccount_ps.setDouble(2,user.getAccountnumber());
	    insertuseraccount_ps.setString(3,user.getUserupiid());
	    insertuseraccount_ps.setString(4,user.getUserifsc());
	    insertuseraccount_ps.setString(5,user.getUserbranch());
	    int inserresultaccount=insertuseraccount_ps.executeUpdate();
	    if(insertresultpersonal==1&&inserresultaccount==1)
	    	userid=user.getUserid();
	    return userid;
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
	public int addNewAdmin(Admin admin)
	 {
	  int userid=0;
	  Connection con =null;
	  PreparedStatement selectemployee_ps = null;
	  PreparedStatement insertuser_ps = null;
	  try
	  {
	   con=ConnectionFactory.getMYSQLSeedbankConnection();
	   String selectqry="select * from admin where adminid=?";   
	   selectemployee_ps  = con.prepareStatement(selectqry);
	   selectemployee_ps.setInt(1, admin.getAdminid());
	   selectemployee_ps.executeQuery();
	   ResultSet rs = selectemployee_ps.getResultSet();
	   if (rs.next())
	   {
	    userid=0;
	    return userid;
	   }
	   else
	   {
	    String insertqrypersonal="insert into admin values(?,?,?,?,?,?,?,?)";
	    insertuser_ps= con.prepareStatement(insertqrypersonal);
	    insertuser_ps.setInt(1, admin.getAdminid());
	    insertuser_ps.setString(2, admin.getAdminname());
	    insertuser_ps.setString(3, admin.getAdminemail());  
	    insertuser_ps.setDouble(4, admin.getAdminphone());
	    insertuser_ps.setString(5, admin.getAdminaddress()); 
	    insertuser_ps.setString(6, admin.getAdmincity()); 
	    insertuser_ps.setInt(7, admin.getAdminpincode()); 
	    insertuser_ps.setString(8, admin.getAdminpassword()); 
	    int insertresultpersonal = insertuser_ps.executeUpdate();
	   
	    if(insertresultpersonal==1)
	    	userid=admin.getAdminid();
	    return userid;
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
	public int deleteUser(int userid) throws Exception {
		int deleteresultpersonal=0;
		int deleteresultaccount=0;
		  Connection con =null;
		  PreparedStatement selectuser_ps = null;
		  PreparedStatement deleteuser_ps = null;
		  PreparedStatement deleteuseraccount_ps=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="select * from user where userid=?";
		   selectuser_ps  = con.prepareStatement(selectqry);
		   selectuser_ps.setInt(1, userid);
		   selectuser_ps.executeQuery();
		   ResultSet rs = selectuser_ps.getResultSet();
		   if (!rs.next())
		   {
		    deleteresultpersonal=0;// Record NOT FOUND TO DELETE in Table
		    return deleteresultpersonal;
		   }
		   else
		   {
			   String deleteqryaccount="delete from seedbank.useraccount where userid=?";
			    deleteuseraccount_ps= con.prepareStatement(deleteqryaccount);
			    deleteuseraccount_ps.setInt(1, userid);
			    deleteresultaccount = deleteuseraccount_ps.executeUpdate();
			    System.out.println(deleteresultaccount);
			    String deleteqry="delete from seedbank.user where userid=?";
			    deleteuser_ps= con.prepareStatement(deleteqry);
			    deleteuser_ps.setInt(1, userid);
			    deleteresultpersonal = deleteuser_ps.executeUpdate();
			    if(deleteresultaccount==1&&deleteresultpersonal==1)
			    return userid;
			    else
			    	return 0;
		   }
		   }catch (SQLException sqe)
		   {
			   sqe.printStackTrace();
			   throw new Exception(sqe);
		   }
		   catch (Exception e2)
		   {
			   e2.printStackTrace();
			   throw new Exception(e2); 
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectuser_ps != null)    selectuser_ps.close();
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    	throw new Exception(e);
		       }
		    }
		  
	}
	public int updateUserbyAdmin(User user)
	 {
	  int userid=0;
	  Connection con =null;
	  PreparedStatement selectemployee_ps = null;
	  PreparedStatement updateuser_ps = null;
	  PreparedStatement insertuseraccount_ps = null;
	  try
	  {
	   con=ConnectionFactory.getMYSQLSeedbankConnection();
	   String selectqry="select * from user where userid=?";   
	   selectemployee_ps  = con.prepareStatement(selectqry);
	   selectemployee_ps.setInt(1, user.getUserid());
	   selectemployee_ps.executeQuery();
	   ResultSet rs = selectemployee_ps.getResultSet();
	   if (rs.next())
	   {
	    userid=0;// Record already in Table
	    return userid;
	   }
	   else
	   {
		    String insertqryaccount="update useraccount set accountnumber=?,upiid=?,ifsc=?,branchname=?,usercity=? where userid=?)";
		    insertuseraccount_ps= con.prepareStatement(insertqryaccount);
		    insertuseraccount_ps.setDouble(1,user.getAccountnumber());
		    insertuseraccount_ps.setString(2,user.getUserupiid());
		    insertuseraccount_ps.setString(3,user.getUserifsc());
		    insertuseraccount_ps.setString(4,user.getUserbranch());
		    insertuseraccount_ps.setInt(5,user.getUserid());
		    int inserresultaccount=insertuseraccount_ps.executeUpdate();
		    String insertqrypersonal="update user set username=?,useremail=?,userphone=?,useraddress=?,usercity=?,userpincode=? where userid=?)";
		    updateuser_ps= con.prepareStatement(insertqrypersonal);
		    updateuser_ps.setString(1, user.getUsername());
		    updateuser_ps.setString(2, user.getUseremail());  
		    updateuser_ps.setDouble(3, user.getUserphone());
		    updateuser_ps.setString(4, user.getUseraddress()); 
		    updateuser_ps.setString(5, user.getUsercity()); 
		    updateuser_ps.setInt(6, user.getUserpincode()); 
		    updateuser_ps.setInt(7, user.getUserid());
		    int insertresultpersonal = updateuser_ps.executeUpdate();
		    if(insertresultpersonal==1&&inserresultaccount==1)
		    	userid=user.getUserid();
		    return userid;
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
}
