package com.aspire.seedbank.dac;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import com.aspire.seedbank.entity.Deposit;
import com.aspire.seedbank.entity.Feedback;
import com.aspire.seedbank.entity.Login;
import com.aspire.seedbank.entity.Order;
import com.aspire.seedbank.entity.SeedView;
import com.aspire.seedbank.utilities.Query;

public class UserDataAccessController {
	public String[] userLogin(Login login) throws Exception {
		String username=null;
		String userid=null;
		String[] result=new String[2];
	   Connection connection =null;
	   PreparedStatement preparestatement = null;
	   ResultSet resultset =null;
	   try
	   {
	    connection=ConnectionFactory.getMYSQLSeedbankConnection();
	    preparestatement  = connection.prepareStatement(Query.SELECT_USER_FOR_LOGIN);
	    preparestatement.setString(1, login.getEmail());
	    preparestatement.executeQuery();
	    resultset = preparestatement.getResultSet();
	    while (resultset.next())
	    {
		    if(	resultset.getString(1).equals(login.getPassword())) {
		    	username=resultset.getString(2);
		    	userid=String.valueOf(resultset.getInt(3));
		    	result[0]=username;
		    	result[1]=userid;
		    } 
	    }
	    return result;
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
	     if (preparestatement != null)    preparestatement.close();
	     	username=null;
			userid=null;
			result=new String[2];
		    connection =null;
		    preparestatement = null;
		    resultset =null;
	    }
	    catch (Exception sqlexception)
	    {
	    	throw new Exception(sqlexception);

	       }
	    }
	}
	@SuppressWarnings("resource")
	public int addNewFeedBack(Feedback feedback) throws Exception
	 {
		int insertresult =0;
		int userid=0;
		Connection connection =null;
		PreparedStatement preparedstatement = null;
		ResultSet resultset =null;
	  try
	  {
	   connection=ConnectionFactory.getMYSQLSeedbankConnection();
	   preparedstatement  = connection.prepareStatement(Query.SELECT_FEEDBACK);
	   preparedstatement.setInt(1, feedback.getFeedbackid());
	   preparedstatement.executeQuery();
	   resultset = preparedstatement.getResultSet();
	   if (resultset.next())
	   {
	    userid=0;
	    return userid;
	   }
	   else
	   {
	    
	    preparedstatement= connection.prepareStatement(Query.INSERT_FEEDBACK);
	    preparedstatement.setInt(1, feedback.getFeedbackid());
	    preparedstatement.setInt(2, feedback.getUserid());
	    preparedstatement.setInt(3, feedback.getOrderid());  
	    preparedstatement.setString(4, feedback.getFeedback()); 
	    preparedstatement.setDate(5, (Date) feedback.getDateoffeedback()); 
	    insertresult = preparedstatement.executeUpdate();
	   
	    if(insertresult==1)
	    	userid=feedback.getFeedbackid();
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
	     if (preparedstatement != null)    preparedstatement.close();
	     	insertresult =0;
			userid=0;
			connection =null;
			preparedstatement = null;
			resultset =null;
	    }
	    catch (Exception sqlexception)
	    {
	    	sqlexception.printStackTrace();
	    	throw new Exception(sqlexception);
	       }
	    }
	 }
	@SuppressWarnings("resource")
	public int[] depositSeed(Deposit deposit) throws Exception {
			int[] result=new int[2];
			int transactionid=0;
			Connection connection =null;
			PreparedStatement preparedstatement = null;
			ResultSet resultset =null;
			int previousquantity=0;
		    int pricedeposit=0;
		    int updatedquantity=0;
		    int findupdate=0;
		    int amount=0;
		    int insertresultpersonal =0;
		    double accountnumber=0;
		    String ifsc=null;
		    String status=null;
		    int inserresultransaction=0;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();   
		   preparedstatement  = connection.prepareStatement(Query.SELECT_DEPOSIT);
		   preparedstatement.setInt(1, deposit.getDepositid());
		   preparedstatement.executeQuery();
		   resultset = preparedstatement.getResultSet();
		   if (resultset.next())
		   {
		    transactionid=0;// Record already in Table
		    throw new Exception("Record is already in table!");
		   }
		   else
		   {
		    
		    preparedstatement=connection.prepareStatement(Query.SELECT_DEPOSIT_RATE);
		    preparedstatement.setInt(1, deposit.getSeedid());
		    resultset=preparedstatement.executeQuery();
		    if(resultset.next()) {
		   	previousquantity=resultset.getInt(1);
		   	pricedeposit=resultset.getInt(2);
		    updatedquantity=previousquantity+deposit.getQuantity();
		    preparedstatement=connection.prepareStatement(Query.UPDATE_QUANTITY);
		    preparedstatement.setInt(1,updatedquantity );
		    preparedstatement.setInt(2, deposit.getSeedid());
		    findupdate=preparedstatement.executeUpdate();
		    amount=deposit.getQuantity()*pricedeposit;
		    result[0]=amount;
		    preparedstatement= connection.prepareStatement(Query.INSERT_DEPOSIT);
		    preparedstatement.setInt(1, deposit.getDepositid());
		    preparedstatement.setInt(2, deposit.getUserid());
		    preparedstatement.setInt(3, deposit.getSeedid());  
		    preparedstatement.setInt(4, deposit.getQuantity());
		    preparedstatement.setDate(5, (Date) deposit.getDepositedate()); 
		    insertresultpersonal = preparedstatement.executeUpdate();
		    preparedstatement=connection.prepareStatement(Query.SELECT_ACCOUNT_DETAILS);
		    preparedstatement.setInt(1, deposit.getUserid());
		    resultset=preparedstatement.executeQuery();
		    if(resultset.next()) {
		    accountnumber=resultset.getDouble(1);
		    ifsc=resultset.getString(2);
		    status="deposit";
		    preparedstatement= connection.prepareStatement(Query.INSERT_TRANSACTION);
		    preparedstatement.setInt(1,deposit.getTransactionid());
		    preparedstatement.setInt(2,amount);
		    preparedstatement.setDouble(3,accountnumber);
		    preparedstatement.setDate(4,(Date) deposit.getDepositedate());
		    preparedstatement.setString(5,ifsc);
		    preparedstatement.setString(6,status);
		    inserresultransaction=preparedstatement.executeUpdate();
			preparedstatement= connection.prepareStatement(Query.INSER_DEPOSIT_TRANSACTION);
			preparedstatement.setInt(1,deposit.getDepositid());
		    preparedstatement.setDouble(2,deposit.getTransactionid());
		    int inserresultaccount=preparedstatement.executeUpdate();
		   
		    if(insertresultpersonal==1&&inserresultaccount==1&&findupdate==1&&inserresultransaction==1) {
		    	transactionid=deposit.getTransactionid();
		    	result[1]=transactionid;
		    }
		   }
		    }
		    return result;
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
		     	result=null;
				transactionid=0;
				connection =null;
				preparedstatement = null;
				resultset =null;
				previousquantity=0;
			    pricedeposit=0;
			    updatedquantity=0;
			    findupdate=0;
			    amount=0;
			    insertresultpersonal =0;
			    accountnumber=0;
			    ifsc=null;
			    status=null;
			    inserresultransaction=0;
		    }
		    catch (Exception sqlexception)
		    {
		    	sqlexception.printStackTrace();
		    	throw new Exception(sqlexception);
		       }
		    }
		
	}
	@SuppressWarnings("resource")
	public int[] orderSeed(Order order) throws Exception {
			int[] result=new int[2];
			int transactionid=0;
			int previousquantity=0;
		    int pricewithdraw=0;
		    int updatedquantity=0;
		    int findupdate=0;
		    int amount=0;
		    int insertresultpersonal =0;
		    double accountnumber=0;
		    String ifsc=null;
		    String status=null;
		    int inserresultransaction=0;
		    int inserresultaccount=0;
		  Connection connection =null;
		  PreparedStatement preparedstatement = null;
		  ResultSet resultset =null;
		  try
		  {
		   connection=ConnectionFactory.getMYSQLSeedbankConnection();
		      
		   preparedstatement  = connection.prepareStatement(Query.SELECT_ORDER);
		   preparedstatement.setInt(1, order.getOrderid());
		   preparedstatement.executeQuery();
		   resultset = preparedstatement.getResultSet();
		   if (resultset.next())
		   {
		    transactionid=0;
		    throw new Exception("Detail Already in the Database");
		   }
		   else
		   {
		    
		    preparedstatement=connection.prepareStatement(Query.SELECT_PRICE_WITHDRAW);
		    preparedstatement.setInt(1, order.getSeedid());
		    resultset=preparedstatement.executeQuery();
		    if(resultset.next()) {
		    previousquantity=resultset.getInt(1);
		    pricewithdraw=resultset.getInt(2);
		    updatedquantity=previousquantity-order.getQuantity();
		    if(updatedquantity<0)
		    	throw new Exception("Faild to withdraw entered quantity!");
		    
		    preparedstatement=connection.prepareStatement(Query.UPDATE_QUANTITY);
		    preparedstatement.setInt(1,updatedquantity );
		    preparedstatement.setInt(2, order.getSeedid());
		    findupdate=preparedstatement.executeUpdate();
		    amount=order.getQuantity()*pricewithdraw;
		    result[0]=amount;
		    
		    preparedstatement= connection.prepareStatement(Query.INSERT_ORDER);
		    preparedstatement.setInt(1, order.getOrderid());
		    preparedstatement.setInt(2, order.getUserid());
		    preparedstatement.setInt(3, order.getSeedid());  
		    preparedstatement.setInt(4, order.getQuantity());
		    preparedstatement.setDate(5, (Date) order.getOrdereddate()); 
		    insertresultpersonal = preparedstatement.executeUpdate();
		    
		    preparedstatement=connection.prepareStatement(Query.SELECT_ACCOUNT_DETAILS);
		    preparedstatement.setInt(1, order.getUserid());
		    resultset=preparedstatement.executeQuery();
		    if(resultset.next()) {
		    accountnumber=resultset.getDouble(1);
		    ifsc=resultset.getString(2);
		    status="withdraw";
		    preparedstatement= connection.prepareStatement(Query.INSERT_TRANSACTION);
		    preparedstatement.setInt(1,order.getTransactionid());
		    preparedstatement.setInt(2,amount);
		    preparedstatement.setDouble(3,accountnumber);
		    preparedstatement.setDate(4,(Date) order.getOrdereddate());
		    preparedstatement.setString(5,ifsc);
		    preparedstatement.setString(6,status);
		    inserresultransaction=preparedstatement.executeUpdate();
			preparedstatement= connection.prepareStatement(Query.INSERT_ORDER_TRANSACTION);
			preparedstatement.setInt(1,order.getOrderid());
		    preparedstatement.setDouble(2,order.getTransactionid());
		    inserresultaccount=preparedstatement.executeUpdate();
		   
		    if(insertresultpersonal==1&&inserresultaccount==1&&findupdate==1&&inserresultransaction==1) {
		    	transactionid=order.getTransactionid();
		    	result[1]=transactionid;
		    }
		   }
		    }
		    return result;
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
		     	result=null;
		     	transactionid=0;
				previousquantity=0;
			    pricewithdraw=0;
			    updatedquantity=0;
			    findupdate=0;
			    amount=0;
			    insertresultpersonal =0;
			    accountnumber=0;
			    ifsc=null;
			    status=null;
			    inserresultransaction=0;
			    inserresultaccount=0;
			    connection =null;
			    preparedstatement = null;
			    resultset =null;
		    }
		    catch (Exception exception)
		    {
		    	exception.printStackTrace();
		    	throw new Exception(exception);
		       }
		    }
	}
	public HashSet<SeedView> viewAllSeed() throws Exception{
		HashSet<SeedView> seedhashset=new HashSet<SeedView>();
		Connection con =null;
		  CallableStatement selectseed = null;
		  try
		  {
		   con=ConnectionFactory.getMYSQLSeedbankConnection();
		   String selectqry="call viewallseed";   
		   selectseed  = con.prepareCall(selectqry);
		   selectseed.execute();
		   ResultSet rs = selectseed.getResultSet();
		   while(rs.next())
		   {
			   SeedView seed=new SeedView(rs.getInt(1));
			   seed.setCategoryid(rs.getInt(2));
			   seed.setCategoryname(rs.getString(3));
			   seed.setSeedname(rs.getString(4));;
			   seed.setTemperature(rs.getInt(5));
			   seed.setImage(rs.getString(6));
			   seed.setKilogramsinstock(rs.getInt(7));
			   seed.setPriceperkilogramdeposite(rs.getInt(8));
			   seed.setPriceperkilogramwithdraw(rs.getInt(9));
			   seedhashset.add(seed);
		   }
		   return seedhashset;
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
	
}
