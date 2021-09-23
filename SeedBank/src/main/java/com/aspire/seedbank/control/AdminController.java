package com.aspire.seedbank.control;

import java.util.HashSet;

import com.aspire.seedbank.dac.AdminDataAccessController;
import com.aspire.seedbank.dac.UserDataAccessController;
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

public class AdminController extends Controller{
	public String adminLogin(Login login) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.adminLogin(login);
	}
	public int addNewUser(User user) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.addNewUser(user);
	}
	public int addNewAdmin(Admin admin) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.addNewAdmin(admin);
	}
	public int deleteUser(int userid) throws Exception {
		
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.deleteUser(userid);
	}
	public int updateUserByAdmin(User user) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.updateUserbyAdmin(user);
	}
	public int updateAdmin(Admin admin) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.updateAdmin(admin);
	}
	public int deleteAdmin(int adminid) throws Exception {

		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.deleteAdmin(adminid);
	}
	public int addNewCategory(Category category) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.addNewCategory(category);
	
	}
	public int addNewSeed(Seed seed) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.addNewSeed(seed);
	}
	public int updateCategory(Category category) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.updateCategory(category);
	}
	public int updateSeed(Seed seed) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.updateSeed(seed);
	}
	public int deleteSeed(int seedid) throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.deleteSeed(seedid);
	
	}
	//pending
	public HashSet<User> viewAllUser() throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.viewAllUser();
	}
	public HashSet<SeedView> viewAllSeed() throws Exception{
		UserDataAccessController seedbankdac=new UserDataAccessController();
		return seedbankdac.viewAllSeed();
	}
	public HashSet<Admin> viewAllAdmin() throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.viewAllAdmin();
	}
	public HashSet<DepositViewer> viewAllDeposits() throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.viewAllDeposits();
	}
	public HashSet<OrderViewer> viewAllOrders() throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.viewAllOrders();
	}
	public HashSet<DepositViewer> findUserDeposits(int userid) throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.findUserDeposits(userid);
	}
	public HashSet<OrderViewer> findUserOrders(int userid) throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.findUserOrders(userid);
	}
	
	public HashSet<Feedback> viewAllFeedback() throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.viewAllFeedback();
	}
	public User findUserById(int userid) throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.findUserById(userid);
	}
	public Admin findAdminById(int adminid) throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.findAdminById(adminid);
	}
	public SeedView findSeedById(int seedid) throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.findSeedById(seedid);
	}
	public HashSet<Category> viewAllCategory() throws Exception{
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.viewAllCategory();
	}
	public HashSet<Transaction> viewAllTransactions() throws Exception {
		AdminDataAccessController seedbankdac=new AdminDataAccessController();
		return seedbankdac.viewAllTransactions();
	}

}

