package com.aspire.seedbank.entity;

import java.io.Serializable;

public class User implements Serializable, Comparable<User>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7230323681289356138L;
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
	public void setUsername(String username) throws Exception {
		
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) throws Exception {
		 
		this.useremail = useremail;
		
	}
	public double getUserphone() {
		return userphone;
	}
	public void setUserphone(double userphone) throws Exception {
			this.userphone = userphone;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) throws Exception {
		
		this.useraddress = useraddress;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) throws Exception {
		
		this.usercity = usercity;
	}
	public int getUserpincode() {
		return userpincode;
	}
	public void setUserpincode(int userpincode) throws Exception {
		
		this.userpincode = userpincode;
	}
	public double getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(double accountnumber) throws Exception {
		
		this.accountnumber = accountnumber;
	}
	public String getUserupiid() {
		return userupiid;
	}
	public void setUserupiid(String userupiid) throws Exception {
		 
		this.userupiid = userupiid;
		
	}
	public String getUserifsc() {
		return userifsc;
	}
	public void setUserifsc(String userifsc) throws Exception {
		
		this.userifsc = userifsc;
		
	}
	public String getUserbranch() {
		return userbranch;
	}
	public void setUserbranch(String userbranch) throws Exception {
		
		this.userbranch = userbranch;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) throws Exception {
	
		this.userpassword = userpassword;
	}
	public User(int userid) {
		this.userid=userid;
	}
	public int getUserid() {
		return userid;
	}
	@Override
	public int compareTo(User object) {
		if(object.userid==this.userid)
		return 0;
		else	return 1;
	}
}
