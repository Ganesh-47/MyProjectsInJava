package com.aspire.seedbank.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import com.aspire.seedbank.entity.Admin;
import com.aspire.seedbank.entity.Category;
import com.aspire.seedbank.entity.DepositViewer;
import com.aspire.seedbank.entity.Feedback;
import com.aspire.seedbank.entity.Login;
import com.aspire.seedbank.entity.OrderViewer;
import com.aspire.seedbank.entity.Seed;
import com.aspire.seedbank.entity.SeedView;
import com.aspire.seedbank.entity.Transaction;
import com.aspire.seedbank.entity.User;
import com.aspire.seedbank.utilities.Query;

import java.sql.CallableStatement;

public class AdminDataAccessController {
	public String adminLogin(Login login) throws Exception {
			String adminname=null;
		   Connection conection =null;
		   PreparedStatement preparestatement = null; 
		   ResultSet resultset=null;
		   try
		   {
		    conection=ConnectionFactory.getMYSQLSeedbankConnection();
		    preparestatement  = conection.prepareStatement(Query.SELECT_ADMIN_PASSWORD);
		    preparestatement.setString(1, login.getEmail());
		    preparestatement.executeQuery();
		    resultset = preparestatement.getResultSet();
		    while (resultset.next())
		    {
			    if(	resultset.getString(1).equals(login.getPassword())) {
			    	adminname=resultset.getString(2);
			    }else	
			    	adminname=null;  
		    }
		    return adminname;
		    }catch (SQLException sqlexception)
		    {
		    	throw new Exception(sqlexception);
		    }
		    catch (Exception exception)
		    {
		    	throw new Exception(exception);
		    }
		    finally
		    	{
		    try
		    {
		     if (conection != null)
		      {
		       if(!conection.isClosed()) conection.close();
		      }
		     if (preparestatement != null)    preparestatement.close();
		     	adminname=null;
				conection =null;
				preparestatement = null; 
				resultset=null;
		    }
		    catch (Exception exception)
		    {
		    	throw new Exception(exception);

		       }
		    }
	}

	@SuppressWarnings("resource")
	public int addNewUser(User user) throws Exception
	 {
	  int userid=0;
	  Connection conection =null;
	  PreparedStatement preparedstatement = null;
	  ResultSet resultset=null;
	  int insertresultperesultsetonal =0;
	  int inserresultaccount=0;
	  try
	  {
	   conection=ConnectionFactory.getMYSQLSeedbankConnection();
	   preparedstatement  = conection.prepareStatement(Query.SELECT_USER);
	   preparedstatement.setInt(1, user.getUserid());
	   preparedstatement.executeQuery();
	   resultset = preparedstatement.getResultSet();
	   if (resultset.next())
	   {
	    return 0;
	   }
	   else
	   {
	    preparedstatement= conection.prepareStatement(Query.INSERT_USER_PERSONAL_DETAILS);
	    preparedstatement.setInt(1, user.getUserid());
	    preparedstatement.setString(2, user.getUsername());
	    preparedstatement.setString(3, user.getUseremail());  
	    preparedstatement.setDouble(4, user.getUserphone());
	    preparedstatement.setString(5, user.getUseraddress()); 
	    preparedstatement.setString(6, user.getUsercity()); 
	    preparedstatement.setInt(7, user.getUserpincode()); 
	    preparedstatement.setString(8, user.getUserpassword()); 
	    insertresultperesultsetonal = preparedstatement.executeUpdate();
	    preparedstatement= conection.prepareStatement(Query.INSERT_USER_ACCOUNT_DETAILS);
	    preparedstatement.setInt(1,user.getUserid());
	    preparedstatement.setDouble(2,user.getAccountnumber());
	    preparedstatement.setString(3,user.getUserupiid());
	    preparedstatement.setString(4,user.getUserifsc());
	    preparedstatement.setString(5,user.getUserbranch());
	    inserresultaccount=preparedstatement.executeUpdate();
	    if(insertresultperesultsetonal==1&&inserresultaccount==1)
	    	userid=user.getUserid();
	    return userid;
	   }
	   }catch (SQLException sqlexception)
	   {
		   throw new Exception(sqlexception);
	   }
	   catch (Exception sqlexception)
	   {
		   sqlexception.printStackTrace();
		   throw new Exception(sqlexception);
	   }
	    finally
	   {
	    try
	    {
	     if (conection != null)
	      {
	       if(!conection.isClosed()) conection.close();
	      }
	     if (preparedstatement != null)    preparedstatement.close();
	      conection =null;
		  preparedstatement = null;
		  resultset=null;
	    }
	    catch (Exception sqlexception)
	    {
	    	sqlexception.printStackTrace();
	    	throw new Exception(sqlexception);
	       }
	    }
	 }
	@SuppressWarnings("resource")
	public int addNewAdmin(Admin admin) throws Exception
	 {
	  int adindid=0;
	  Connection connection =null;
	  PreparedStatement preparedstatement = null;
	  ResultSet resultset=null;
	  try
	  {
	   connection=ConnectionFactory.getMYSQLSeedbankConnection();
	      
	   preparedstatement  = connection.prepareStatement(Query.SELECT_ADMIN);
	   preparedstatement.setInt(1, admin.getAdminid());
	   preparedstatement.executeQuery();
	   resultset = preparedstatement.getResultSet();
	   if (resultset.next())
	   {
	    return 0;
	   }
	   else
	   {
	    preparedstatement= connection.prepareStatement(Query.INSERT_ADMIN);
	    preparedstatement.setInt(1, admin.getAdminid());
	    preparedstatement.setString(2, admin.getAdminname());
	    preparedstatement.setString(3, admin.getAdminemail());  
	    preparedstatement.setDouble(4, admin.getAdminphone());
	    preparedstatement.setString(5, admin.getAdminaddress()); 
	    preparedstatement.setString(6, admin.getAdmincity()); 
	    preparedstatement.setInt(7, admin.getAdminpincode()); 
	    preparedstatement.setString(8, admin.getAdminpassword()); 
	    int insertresultperesultsetonal = preparedstatement.executeUpdate();
	   
	    if(insertresultperesultsetonal==1)
	    	adindid=admin.getAdminid();
	    return adindid;
	   }
	   }catch (SQLException sqlexception)
	   {
		   throw new Exception(sqlexception);
	   }
	   catch (Exception sqlexception)
	   {
		   throw new Exception(sqlexception);
	   }
	    finally
	   {
	    try
	    {
	     if (connection != null)
	      {
	       if(!connection.isClosed()) connection.close();
	      }
	     if (preparedstatement != null)    preparedstatement.close();
	     adindid=0;
		 connection =null;
		 preparedstatement = null;
		 resultset=null;
	    }
	    catch (Exception sqlexception)
	    {
	    	throw new Exception(sqlexception);
	       }
	    }
	 }
	@SuppressWarnings("resource")
	public int deleteUser(int userid) throws Exception {
		int deleteresultperesultsetonal=0;
		int deleteresultaccount=0;
		  Connection connection =null;
		  PreparedStatement preparedstatement = null;
		  ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		   preparedstatement  = connection.prepareStatement(Query.SELECT_USER);
		   preparedstatement.setInt(1, userid);
		   preparedstatement.executeQuery();
		  resultset = preparedstatement.getResultSet();
		   if (!resultset.next())
		   {
		    return 0;
		   }
		   else
		   {
			    preparedstatement= connection.prepareStatement(Query.DELETE_USER_ACCOUNT);
			    preparedstatement.setInt(1, userid);
			    deleteresultaccount = preparedstatement.executeUpdate();
			    preparedstatement= connection.prepareStatement(Query.DELETE_USER_PERSONAL_DETAILS);
			    preparedstatement.setInt(1, userid);
			    deleteresultperesultsetonal = preparedstatement.executeUpdate();
			    if(deleteresultaccount==1&&deleteresultperesultsetonal==1)
			    return userid;
			    else
			    	throw new Exception("Faild to delete!!!");
		   }
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception); 
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedstatement != null)    preparedstatement.close();
		     	deleteresultperesultsetonal=0;
		     	deleteresultaccount=0;
		     	connection =null;
				preparedstatement = null;
				resultset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
		  
	}
	@SuppressWarnings("resource")
	public int updateUserbyAdmin(User user) throws Exception
	 {
	  int userid=0;
	  int insertresultperesultsetonal =0;
	  Connection connection =null;
	  PreparedStatement preparedStatement = null;
	  ResultSet resultset=null;
	  try
	  {
	   connection=ConnectionFactory.getMYSQLSeedbankConnection();  
	   preparedStatement  = connection.prepareStatement(Query.SELECT_USER);
	   preparedStatement.setInt(1, user.getUserid());
	   preparedStatement.executeQuery();
	   resultset = preparedStatement.getResultSet();
	   if (!resultset.next())
	   {
	    return 0;
	   }
	   else
	   {
		    preparedStatement= connection.prepareStatement(Query.UPDATE_USER);
		    preparedStatement.setString(1, user.getUsername());
		    preparedStatement.setString(2, user.getUseremail());  
		    preparedStatement.setDouble(3, user.getUserphone());
		    preparedStatement.setString(4, user.getUseraddress()); 
		    preparedStatement.setString(5, user.getUsercity()); 
		    preparedStatement.setInt(6, user.getUserpincode()); 
		    preparedStatement.setInt(7, user.getUserid());
		    insertresultperesultsetonal = preparedStatement.executeUpdate();
		    if(insertresultperesultsetonal==1)
		    	userid=user.getUserid();
		    return userid;
	   }
	   }catch (SQLException sqlexception)
	   {
		   sqlexception.printStackTrace();
		   throw new Exception(sqlexception);
	   }
	   catch (Exception sqlexception)
	  		
	   {
		   sqlexception.printStackTrace();
		   throw new Exception(sqlexception);
	   }
	    finally
	   {
	    try
	    {
	     if (connection != null)
	      {
	       if(!connection.isClosed()) connection.close();
	      }
	     if (preparedStatement != null)    preparedStatement.close();
	     	userid=0;
		 	insertresultperesultsetonal =0;
		 	connection =null;
		 	preparedStatement = null;
		 	resultset=null;
	    }
	    catch (Exception sqlexception)
	    {
	    	sqlexception.printStackTrace();
	    	throw new Exception(sqlexception);
	       }
	    }
	 }
	@SuppressWarnings("resource")
	public int updateAdmin(Admin admin) throws Exception {
		
		int adminid=0;
		int insertresultperesultsetonal =0;
		  Connection connection =null;
		  PreparedStatement preparedStatement = null;
		  ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();  
		   preparedStatement  = connection.prepareStatement(Query.SELECT_ADMIN);
		   preparedStatement.setInt(1, admin.getAdminid());
		   preparedStatement.executeQuery();
		   resultset = preparedStatement.getResultSet();
		   if (!resultset.next())
		   {
		    adminid=0;
		    return adminid;
		   }
		   else
		   {
			    
			    preparedStatement= connection.prepareStatement(Query.UPDATE_ADMIN);
			    preparedStatement.setString(1, admin.getAdminname());
			    preparedStatement.setString(2, admin.getAdminemail());  
			    preparedStatement.setDouble(3, admin.getAdminphone());
			    preparedStatement.setString(4, admin.getAdminaddress()); 
			    preparedStatement.setString(5, admin.getAdmincity()); 
			    preparedStatement.setInt(6, admin.getAdminpincode()); 
			    preparedStatement.setInt(7, admin.getAdminid());
			    insertresultperesultsetonal = preparedStatement.executeUpdate();
			    if(insertresultperesultsetonal==1)
			    	adminid=admin.getAdminid();
			    return adminid;
		   }
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		  		
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedStatement != null)    preparedStatement.close();
		     		adminid=0;
		     		insertresultperesultsetonal =0;
		     		connection =null;
				  	preparedStatement = null;
				  	resultset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	@SuppressWarnings("resource")
	public int deleteAdmin(int adminid) throws Exception {
			int deleteresult=0;
			Connection connection =null;
			PreparedStatement preparedstatement = null;
			ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		   preparedstatement  = connection.prepareStatement(Query.SELECT_ADMIN);
		   preparedstatement.setInt(1, adminid);
		   preparedstatement.executeQuery();
		   resultset = preparedstatement.getResultSet();
		   if (!resultset.next())
		   {
		    deleteresult=0;// Record NOT FOUND TO DELETE in Table
		    return deleteresult;
		   }
		   else
		   {
			    preparedstatement= connection.prepareStatement(Query.DELETE_ADMIN);
			    preparedstatement.setInt(1, adminid);
			    deleteresult = preparedstatement.executeUpdate();
			    if(deleteresult==1)
			    return adminid;
			    else
			    	throw new Exception("Faild to Remove!");
		   }
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception); 
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedstatement != null)    preparedstatement.close();
		     	deleteresult=0;
				connection =null;
				preparedstatement = null;
				resultset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	@SuppressWarnings("resource")
	public int addNewCategory(Category category) throws Exception {
			int categoryid=0;
			int insertresult =0;
		  Connection connection =null;
		  PreparedStatement preparedStateent = null;
		  ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		      
		   preparedStateent  = connection.prepareStatement(Query.SELECT_CATEGORY);
		   preparedStateent.setInt(1, category.getCategoryid());
		   preparedStateent.executeQuery();
		   resultset = preparedStateent.getResultSet();
		   if (resultset.next())
		   {
		    categoryid=0;
		    return categoryid;
		   }
		   else
		   {
		    
		    preparedStateent= connection.prepareStatement(Query.INSERT_CATEGORY);
		    preparedStateent.setInt(1, category.getCategoryid());
		    preparedStateent.setString(2, category.getCategoryname()); 
		    insertresult = preparedStateent.executeUpdate();
		   
		    if(insertresult==1)
		    	categoryid=category.getCategoryid();
		    return categoryid;
		   }
		   }catch (SQLException sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedStateent != null)    preparedStateent.close();
		     		categoryid=0;
					insertresult =0;
					connection =null;
					preparedStateent = null;
					preparedStateent = null;
					resultset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	@SuppressWarnings("resource")
	public int addNewSeed(Seed seed) throws Exception {
			int seedid=0;
			int insertresult =0;
		  Connection connection =null;
		  PreparedStatement preparedstatement = null;
		  ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		     
		   preparedstatement  = connection.prepareStatement(Query.SELECT_SEED);
		   preparedstatement.setInt(1, seed.getSeedid());
		   preparedstatement.executeQuery();
		   resultset = preparedstatement.getResultSet();
		   if (resultset.next())
		   {
		    seedid=0;
		    return seedid;
		   }
		   else
		   {
		    preparedstatement= connection.prepareStatement(Query.INSERT_SEED);
		    preparedstatement.setInt(1, seed.getSeedid());
		    preparedstatement.setInt(2, seed.getCategoryid());
		    preparedstatement.setString(3, seed.getSeedname());  
		    preparedstatement.setInt(4, seed.getTemperature());
		    preparedstatement.setString(5, seed.getImage()); 
		    preparedstatement.setInt(6, seed.getKilogramsinstock()); 
		    preparedstatement.setInt(7, seed.getPriceperkilogramdeposite()); 
		    preparedstatement.setInt(8, seed.getPriceperkilogramwithdraw()); 
		    insertresult = preparedstatement.executeUpdate();
		   
		    if(insertresult==1)
		    	seedid=seed.getSeedid();
		    return seedid;
		   }
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedstatement != null)    preparedstatement.close();
		     seedid=0;
		     insertresult =0;
			 connection =null;
			 preparedstatement = null;
			 resultset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	@SuppressWarnings("resource")
	public int updateCategory(Category category) throws Exception {
			int categoryid=0;
			int updateresult =0;
		    Connection connection =null;
		    PreparedStatement preparestatement = null;
		    ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();  
		   preparestatement  = connection.prepareStatement(Query.SELECT_CATEGORY);
		   preparestatement.setInt(1, category.getCategoryid());
		   preparestatement.executeQuery();
		   resultset = preparestatement.getResultSet();
		   if (!resultset.next())
		   {
		    categoryid=0;
		    return categoryid;
		   }
		   else
		   {
			    preparestatement= connection.prepareStatement(Query.UPDATE_CATEGORY);
			    preparestatement.setString(1, category.getCategoryname());
			    preparestatement.setInt(2, category.getCategoryid());
			    updateresult = preparestatement.executeUpdate();
			    if(updateresult==1)
			    	categoryid=category.getCategoryid();
			    return categoryid;
		   }
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		  		
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparestatement != null)    preparestatement.close();
		     	categoryid=0;
				updateresult =0;
			    connection =null;
			    preparestatement = null;
			    resultset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
		  }
	@SuppressWarnings("resource")
	public int updateSeed(Seed seed) throws Exception {
		  int seedid=0;
		  int updateresult =0;
		  Connection connection =null;
		  PreparedStatement preparedstatement = null;
		  ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection(); 
		   preparedstatement  = connection.prepareStatement(Query.SELECT_SEED);
		   preparedstatement.setInt(1, seed.getSeedid());
		   preparedstatement.executeQuery();
		   resultset = preparedstatement.getResultSet();
		   if (!resultset.next())
		   {
		    seedid=0;
		    return seedid;
		   }
		   else
		   {
			   
			preparedstatement= connection.prepareStatement(Query.UPDATE_SEED);
		    preparedstatement.setInt(1, seed.getCategoryid());
		    preparedstatement.setString(2, seed.getSeedname());  
		    preparedstatement.setInt(3, seed.getTemperature());
		    preparedstatement.setString(4, seed.getImage()); 
		    preparedstatement.setInt(5, seed.getKilogramsinstock()); 
		    preparedstatement.setInt(6, seed.getPriceperkilogramdeposite()); 
		    preparedstatement.setInt(7, seed.getPriceperkilogramwithdraw());
		    preparedstatement.setInt(8, seed.getSeedid());
		    updateresult = preparedstatement.executeUpdate();
		   
		    if(updateresult==1)
		    	seedid=seed.getSeedid();
		    return seedid;
		   }
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedstatement != null)    preparedstatement.close();
		      seedid=0;
			  connection =null;
			  preparedstatement = null;
			  resultset=null;
			  updateresult =0;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
		  }
	@SuppressWarnings("resource")
	public int deleteSeed(int seedid) throws Exception {
		int deleteresult=0;
		  Connection connection =null;
		  PreparedStatement preparedstatement = null;
		  ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		   preparedstatement  = connection.prepareStatement(Query.SELECT_SEED);
		   preparedstatement.setInt(1, seedid);
		   preparedstatement.executeQuery();
		   resultset = preparedstatement.getResultSet();
		   if (!resultset.next())
		   {
		    deleteresult=0;// Record NOT FOUND TO DELETE in Table
		    return deleteresult;
		   }
		   else
		   {
			   
			    
			    preparedstatement= connection.prepareStatement(Query.DELETE_SEED);
			    preparedstatement.setInt(1, seedid);
			    deleteresult = preparedstatement.executeUpdate();
			    if(deleteresult==1)
			    return seedid;
			    else
			    	throw new Exception("Faild to delete");
		   }
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception); 
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedstatement != null)    preparedstatement.close();
		      deleteresult=0;
			  connection =null;
			  preparedstatement = null;
			  resultset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
		  }
	public HashSet<User> viewAllUser() throws Exception{
		HashSet<User> userhashset=new HashSet<User>();
		  Connection connection =null;
		  CallableStatement callablestatement = null;
		  ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		   callablestatement  = connection.prepareCall(Query.VIEW_ALL_USER);
		   callablestatement.execute();
		   resultset = callablestatement.getResultSet();
		   while(resultset.next())
		   {
			   User user=new User(resultset.getInt(1));
			   user.setUsername(resultset.getString(2));
			   user.setUseremail(resultset.getString(3));;
			   user.setUserphone(resultset.getDouble(4));
			   user.setUseraddress(resultset.getString(5));
			   user.setUsercity(resultset.getString(6));
			   user.setUserpincode(resultset.getInt(7));
			   user.setAccountnumber(resultset.getDouble(8));
			   user.setUserupiid(resultset.getString(9));
			   user.setUserifsc(resultset.getString(10));
			   user.setUserbranch(resultset.getString(11));
			   userhashset.add(user);
		   }
		   return userhashset;
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (callablestatement != null)    callablestatement.close();
		      connection =null;
			  callablestatement = null;
			  resultset=null;
			  userhashset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
		
	}
	public HashSet<Admin> viewAllAdmin() throws Exception{
		HashSet<Admin> adminhashset=new HashSet<Admin>();
		Connection connection =null;
		PreparedStatement preparedstatement = null;
		ResultSet resultset=null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		      
		   preparedstatement  = connection.prepareStatement(Query.VIEW_ALL_ADMIN);
		   preparedstatement.executeQuery();
		   resultset = preparedstatement.getResultSet();
		   while(resultset.next())
		   {
			   Admin admin=new Admin(resultset.getInt(1));
			   admin.setAdminname(resultset.getString(2));
			   admin.setAdminemail(resultset.getString(3));;
			   admin.setAdminphone(resultset.getDouble(4));
			   admin.setAdminaddress(resultset.getString(5));
			   admin.setAdmincity(resultset.getString(6));
			   admin.setAdminpincode(resultset.getInt(7));
			   adminhashset.add(admin);
		   }
		   return adminhashset;
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (connection != null)
		      {
		       if(!connection.isClosed()) connection.close();
		      }
		     if (preparedstatement != null)    preparedstatement.close();
		     	connection =null;
				preparedstatement = null;
				resultset=null;
				adminhashset=null;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
		
	} 
	public HashSet<DepositViewer> viewAllDeposits() throws Exception{
		HashSet<DepositViewer> deposithashset=new HashSet<DepositViewer>();;
		Connection con =null;
		  CallableStatement selectdeposit = null;
		  ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="call viewalldeposits";   
		   selectdeposit  = con.prepareCall(selectqry);
		   selectdeposit.execute();
		   resultset = selectdeposit.getResultSet();
		   while(resultset.next())
		   {
			   DepositViewer deposit=new DepositViewer(resultset.getInt(1));
			   deposit.setUserid(resultset.getInt(2));
			   deposit.setUsername(resultset.getString(3));
			   deposit.setSeedid(resultset.getInt(4));
			   deposit.setSeedname(resultset.getString(5));
			   deposit.setCategoryid(resultset.getInt(6));
			   deposit.setCategoryname(resultset.getString(7));
			   deposit.setQuantity(resultset.getInt(8));
			   deposit.setDepositdate(resultset.getDate(9));
			   deposit.setTransactionid(resultset.getInt(10));
			   deposit.setAmount(resultset.getInt(11));
			   deposit.setAccountnumber(resultset.getDouble(12));
			   deposit.setDateoftransaction(resultset.getDate(13));
			   deposit.setIfsc(resultset.getString(14));
			   deposithashset.add(deposit);
		   }
		   return deposithashset;
		   }catch (SQLException sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectdeposit != null)    selectdeposit.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	public HashSet<OrderViewer> viewAllOrders() throws Exception{
		HashSet<OrderViewer> orderhashset=new HashSet<OrderViewer>();
		Connection con =null;
		  CallableStatement selectorder = null;
		  ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="call viewallwithdraw";   
		   selectorder  = con.prepareCall(selectqry);
		   selectorder.execute();
		   resultset = selectorder.getResultSet();
		   while(resultset.next())
		   {
			   OrderViewer order=new OrderViewer(resultset.getInt(1));
			   order.setUserid(resultset.getInt(2));
			   order.setUsername(resultset.getString(3));
			   order.setUseraddress(resultset.getString(4));
			   order.setUsercity(resultset.getString(5));
			   order.setUserpincode(resultset.getInt(6));
			   order.setUserphone(resultset.getDouble(7));
			   order.setSeedid(resultset.getInt(8));
			   order.setSeedname(resultset.getString(9));
			   order.setCategoryid(resultset.getInt(10));
			   order.setCategoryname(resultset.getString(11));
			   order.setQuantity(resultset.getInt(12));
			   order.setOrdereddate(resultset.getDate(13));
			   order.setTransacionid(resultset.getInt(14));
			   order.setAmount(resultset.getInt(15));
			   order.setAccountnumber(resultset.getDouble(16));
			   order.setDateoftransaction(resultset.getDate(17));
			   order.setIfsc(resultset.getString(18));
			   orderhashset.add(order);
		   }
		   return orderhashset;
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectorder != null)    selectorder.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	public HashSet<DepositViewer> findUserDeposits(int userid) throws Exception{
		HashSet<DepositViewer> deposithashset=new HashSet<DepositViewer>();
		Connection con =null;
		  CallableStatement selectdepositofuser = null;
		  ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="call finduserdeposit(?)";   
		   selectdepositofuser  = con.prepareCall(selectqry);
		   selectdepositofuser.setInt(1, userid);
		   selectdepositofuser.execute();
		   resultset = selectdepositofuser.getResultSet();
		   while(resultset.next())
		   {
			   DepositViewer deposit=new DepositViewer(resultset.getInt(1));
			   deposit.setUserid(resultset.getInt(2));
			   deposit.setUsername(resultset.getString(3));
			   deposit.setSeedid(resultset.getInt(4));
			   deposit.setSeedname(resultset.getString(5));
			   deposit.setCategoryid(resultset.getInt(6));
			   deposit.setCategoryname(resultset.getString(7));
			   deposit.setQuantity(resultset.getInt(8));
			   deposit.setDepositdate(resultset.getDate(9));
			   deposit.setTransactionid(resultset.getInt(10));
			   deposit.setAmount(resultset.getInt(11));
			   deposit.setAccountnumber(resultset.getDouble(12));
			   deposit.setDateoftransaction(resultset.getDate(13));
			   deposit.setIfsc(resultset.getString(14));
			   deposithashset.add(deposit);
		   }
		   return deposithashset;
		   }catch (SQLException sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectdepositofuser != null)    selectdepositofuser.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	public HashSet<OrderViewer> findUserOrders(int userid) throws Exception{
		HashSet<OrderViewer> orderhashset=new HashSet<OrderViewer>();
		Connection con =null;
		  CallableStatement selectorderesultsetofuser = null;
		  ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="call finduserwithdraw(?)";  
		   selectorderesultsetofuser  = con.prepareCall(selectqry);
		   selectorderesultsetofuser.setInt(1, userid);
		   selectorderesultsetofuser.execute();
		  resultset = selectorderesultsetofuser.getResultSet();
		   while(resultset.next())
		   {
			   OrderViewer order=new OrderViewer(resultset.getInt(1));
			   order.setUserid(resultset.getInt(2));
			   order.setUsername(resultset.getString(3));
			   order.setUseraddress(resultset.getString(4));
			   order.setUsercity(resultset.getString(5));
			   order.setUserpincode(resultset.getInt(6));
			   order.setUserphone(resultset.getDouble(7));
			   order.setSeedid(resultset.getInt(8));
			   order.setSeedname(resultset.getString(9));
			   order.setCategoryid(resultset.getInt(10));
			   order.setCategoryname(resultset.getString(11));
			   order.setQuantity(resultset.getInt(12));
			   order.setOrdereddate(resultset.getDate(13));
			   order.setTransacionid(resultset.getInt(14));
			   order.setAmount(resultset.getInt(15));
			   order.setAccountnumber(resultset.getDouble(16));
			   order.setDateoftransaction(resultset.getDate(17));
			   order.setIfsc(resultset.getString(18));
			   orderhashset.add(order);
		   }
		   return orderhashset;
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectorderesultsetofuser != null)    selectorderesultsetofuser.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	public HashSet<Feedback> viewAllFeedback() throws Exception{
		HashSet<Feedback> feedbackhashset=new HashSet<Feedback>();
		Connection con =null;
		PreparedStatement selectfeedback = null;
		ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="select * from feedback";   
		   selectfeedback  = con.prepareStatement(selectqry);
		   selectfeedback.executeQuery();
		   resultset = selectfeedback.getResultSet();
		   while(resultset.next())
		   {
			   Feedback feedback=new Feedback(resultset.getInt(1));
			   feedback.setUserid(resultset.getInt(2));
			   feedback.setOrderid(resultset.getInt(3));;
			   feedback.setFeedback(resultset.getString(4));
			   feedback.setDateoffeedback(resultset.getDate(5));
			   feedbackhashset.add(feedback);
		   }
		   return feedbackhashset;
		   }catch (SQLException sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectfeedback != null)    selectfeedback.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	throw new Exception(sqlexception);
		       }
		    }
		
	} 
	public User findUserById(int userid) throws Exception{
		User user=null;
		Connection con =null;
		  CallableStatement selectuser = null;
		  ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="call finduser(?)";   
		   selectuser  = con.prepareCall(selectqry);
		   selectuser.setInt(1, userid);
		   selectuser.execute();
		   resultset = selectuser.getResultSet();
		   while(resultset.next())
		   {
			   user=new User(resultset.getInt(1));
			   user.setUsername(resultset.getString(2));
			   user.setUseremail(resultset.getString(3));;
			   user.setUserphone(resultset.getDouble(4));
			   user.setUseraddress(resultset.getString(5));
			   user.setUsercity(resultset.getString(6));
			   user.setUserpincode(resultset.getInt(7));
			   user.setAccountnumber(resultset.getDouble(8));
			   user.setUserupiid(resultset.getString(9));
			   user.setUserifsc(resultset.getString(10));
			   user.setUserbranch(resultset.getString(11));
		   }
		   return user;
		   }catch (SQLException sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectuser != null)    selectuser.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	throw new Exception(sqlexception);
		       }
		    }
		
	}
	public Admin findAdminById(int adminid) throws Exception{
		Admin admin=null;
		Connection con =null;
		PreparedStatement selectadmin = null;
		ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="select * from admin where adminid=?";   
		   selectadmin  = con.prepareStatement(selectqry);
		   selectadmin.setInt(1, adminid);
		   selectadmin.executeQuery();
		   resultset = selectadmin.getResultSet();
		   while(resultset.next())
		   {
			   admin=new Admin(resultset.getInt(1));
			   admin.setAdminname(resultset.getString(2));
			   admin.setAdminemail(resultset.getString(3));;
			   admin.setAdminphone(resultset.getDouble(4));
			   admin.setAdminaddress(resultset.getString(5));
			   admin.setAdmincity(resultset.getString(6));
			   admin.setAdminpincode(resultset.getInt(7));
		   }
		   return admin;
		   }catch (SQLException sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectadmin != null)    selectadmin.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	throw new Exception(sqlexception);
		       }
		    }
		
	} 
	public SeedView findSeedById(int seedid) throws Exception{
		SeedView seed=null;
		Connection con =null;
		  CallableStatement selectseed = null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="call findseed(?)";   
		   selectseed  = con.prepareCall(selectqry);
		   selectseed.setInt(1, seedid);
		   selectseed.execute();
		   ResultSet resultset = selectseed.getResultSet();
		   while(resultset.next())
		   {
			   seed=new SeedView(resultset.getInt(1));
			   seed.setCategoryid(resultset.getInt(2));
			   seed.setCategoryname(resultset.getString(3));
			   seed.setSeedname(resultset.getString(4));;
			   seed.setTemperature(resultset.getInt(5));
			   seed.setImage(resultset.getString(6));
			   seed.setKilogramsinstock(resultset.getInt(7));
			   seed.setPriceperkilogramdeposite(resultset.getInt(8));
			   seed.setPriceperkilogramwithdraw(resultset.getInt(9));
		   }
		   return seed;
		   }catch (SQLException sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectseed != null)    selectseed.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	public HashSet<Category> viewAllCategory() throws Exception {
		HashSet<Category> categoryhashset=new HashSet<Category>();
		Connection con =null;
		PreparedStatement selectcategory = null;
		ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="select * from category";   
		   selectcategory  = con.prepareStatement(selectqry);
		   selectcategory.executeQuery();
		   resultset = selectcategory.getResultSet();
		   while(resultset.next())
		   {
			   Category admin=new Category(resultset.getInt(1));
			   admin.setCategoryname(resultset.getString(2));
			   categoryhashset.add(admin);
		   }
		   return categoryhashset;
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selectcategory != null)    selectcategory.close();
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
	}
	public HashSet<Transaction> viewAllTransactions() throws Exception {
		HashSet<Transaction> transactionhashset=new HashSet<Transaction>();
		Connection con =null;
		PreparedStatement selecttransaction = null;
		ResultSet resultset=null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="select * from transaction";   
		   selecttransaction  = con.prepareStatement(selectqry);
		   selecttransaction.executeQuery();
		   resultset = selecttransaction.getResultSet();
		   while(resultset.next())
		   {
			   Transaction transaction=new Transaction(resultset.getInt(1));
			   transaction.setAmount(resultset.getInt(2));
			   transaction.setAccountnumber(resultset.getDouble(3));;
			   transaction.setDateoftransaction(resultset.getDate(4));
			   transaction.setIfsc(resultset.getString(5));
			   transaction.setStatus(resultset.getString(6));
			   transactionhashset.add(transaction);
		   }
		   return transactionhashset;
		   }catch (SQLException sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		   catch (Exception sqlexception)
		   {
			   sqlexception.printStackTrace();
			   throw new Exception(sqlexception);
		   }
		    finally
		   {
		    try
		    {
		     if (con != null)
		      {
		       if(!con.isClosed()) con.close();
		      }
		     if (selecttransaction != null)    selecttransaction.close();
		    }
		    catch (Exception exception)
		    {
		    	exception.printStackTrace();
		    	throw new Exception(exception);
		       }
		    }
	}

}

