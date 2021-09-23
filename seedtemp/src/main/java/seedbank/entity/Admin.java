package seedbank.entity;

public class Admin {
	private final int adminid;
	private String adminname;
	private String adminemail;
	private double adminphone;
	private String adminaddress;
	private String admincity;
	private int adminpincode;
	private String adminpassword;
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}
	public double getAdminphone() {
		return adminphone;
	}
	public void setAdminphone(double adminphone) {
		this.adminphone = adminphone;
	}
	public String getAdminaddress() {
		return adminaddress;
	}
	public void setAdminaddress(String adminaddress) {
		this.adminaddress = adminaddress;
	}
	public String getAdmincity() {
		return admincity;
	}
	public void setAdmincity(String admincity) {
		this.admincity = admincity;
	}
	public int getAdminpincode() {
		return adminpincode;
	}
	public void setAdminpincode(int adminpincode) {
		this.adminpincode = adminpincode;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	public int getAdminid() {
		return adminid;
	}
	public Admin(int id) {
		this.adminid=id;
		
	}
	
}
