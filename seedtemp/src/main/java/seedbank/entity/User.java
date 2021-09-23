package seedbank.entity;

public class User {
	private final int userid;
	private String username;
	private String useremail;
	private double userphone;
	private String useraddress;
	private String usercity;
	private int userpincode;
	private double accountnumber;
	private String userupiid;
	private String userifsc;
	private String userbranch;
	private String userpassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public double getUserphone() {
		return userphone;
	}
	public void setUserphone(double userphone) {
		this.userphone = userphone;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	public int getUserpincode() {
		return userpincode;
	}
	public void setUserpincode(int userpincode) {
		this.userpincode = userpincode;
	}
	public double getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(double accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getUserupiid() {
		return userupiid;
	}
	public void setUserupiid(String userupiid) {
		this.userupiid = userupiid;
	}
	public String getUserifsc() {
		return userifsc;
	}
	public void setUserifsc(String userifsc) {
		this.userifsc = userifsc;
	}
	public String getUserbranch() {
		return userbranch;
	}
	public void setUserbranch(String userbranch) {
		this.userbranch = userbranch;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public User(int userid) {
		this.userid=userid;
	}
	public int getUserid() {
		return userid;
	}
}
