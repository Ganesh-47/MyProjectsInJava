package com.aspire.seedbank.entity;

import java.io.Serializable;

public class Admin implements Serializable, Comparable<Admin>{
	private static final long serialVersionUID = -5027285493864708640L;
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
	public void setAdminname(String adminname) throws Exception {
		
		this.adminname = adminname;
	}
	public String getAdminemail() {
		return adminemail;
	}
	public void setAdminemail(String adminemail) throws Exception {
		
		this.adminemail = adminemail;
		}
	public double getAdminphone() {
		return adminphone;
	}
	public void setAdminphone(double adminphone) throws Exception {
		this.adminphone = adminphone;
	}
	public String getAdminaddress() {
		return adminaddress;
	}
	public void setAdminaddress(String adminaddress) throws Exception {
			
		this.adminaddress = adminaddress;
		}
	public String getAdmincity() {
		return admincity;
	}
	public void setAdmincity(String admincity) throws Exception {
		
		this.admincity = admincity;
	}
	public int getAdminpincode() {
		return adminpincode;
	}
	public void setAdminpincode(int adminpincode) throws Exception {
		this.adminpincode = adminpincode;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) throws Exception {
		this.adminpassword = adminpassword;
	}
	public int getAdminid() {
		return adminid;
	}
	public Admin(int id) {
		this.adminid=id;
		
	}
	@Override
	public int compareTo(Admin object) {
		if(object.adminid==this.adminid)	return 0;
		else return 1;
	}
	
}
