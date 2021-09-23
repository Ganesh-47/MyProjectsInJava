package com.aspire.seedbank.control;
import com.aspire.seedbank.dac.UserDataAccessController;
import com.aspire.seedbank.entity.Deposit;
import com.aspire.seedbank.entity.Feedback;
import com.aspire.seedbank.entity.Login;
import com.aspire.seedbank.entity.Order;

public class UserController extends Controller{
	public String[] userLogin(Login login) throws Exception {
		UserDataAccessController seedbankdac=new UserDataAccessController();
		return seedbankdac.userLogin(login);
	}
	public int addNewFeedBack(Feedback feedback) throws Exception {
		UserDataAccessController seedbankdac=new UserDataAccessController();
		return seedbankdac.addNewFeedBack(feedback);
	}
	public int[] depositSeed(Deposit deposit) throws Exception {
		UserDataAccessController seedbankdac=new UserDataAccessController();
		return seedbankdac.depositSeed(deposit);
	}
	public int[] orderSeed(Order order) throws Exception {
		UserDataAccessController seedbankdac=new UserDataAccessController();
		return seedbankdac.orderSeed(order);
	
	}
}
