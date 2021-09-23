package seedbank.control;

import seedbank.dac.SeedBankDataAccessController;
import seedbank.entity.Login;

public class UserController {
	public String userLogin(Login login) throws Exception {
		SeedBankDataAccessController seedbankdac=new SeedBankDataAccessController();
		return seedbankdac.userLogin(login);
	}
}
