package seedbank.control;

import seedbank.dac.SeedBankDataAccessController;
import seedbank.entity.Admin;
import seedbank.entity.Login;
import seedbank.entity.User;

public class AdminController {
	public String adminLogin(Login login) throws Exception {
		SeedBankDataAccessController seedbankdac=new SeedBankDataAccessController();
		return seedbankdac.adminLogin(login);
	}
	public int addNewUser(User user) {
		SeedBankDataAccessController seedbankdac=new SeedBankDataAccessController();
		return seedbankdac.addNewUser(user);
	}
	public int addNewAdmin(Admin admin) {
		SeedBankDataAccessController seedbankdac=new SeedBankDataAccessController();
		return seedbankdac.addNewAdmin(admin);
	}
	public int deleteUser(int userid) throws Exception {
		
		SeedBankDataAccessController seedbankdac=new SeedBankDataAccessController();
		return seedbankdac.deleteUser(userid);
	}
	public int updateUserByAdmin(User user) {
		SeedBankDataAccessController seedbankdac=new SeedBankDataAccessController();
		return seedbankdac.updateUserbyAdmin(user);
	}
}
