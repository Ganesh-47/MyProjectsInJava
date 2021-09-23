package com.aspire.seedbank.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderViewer implements Serializable, Comparable<OrderViewer>{
/**
	 * 
	 */
	private static final long serialVersionUID = -2470795602392812157L;
private final int orderid;
int userid=0;
String username="";
String useraddress="";
String usercity="";
int userpincode=0;
double userphone=0;
int seedid=0;
String seedname="";
int categoryid=0;
String categoryname="";
int quantity=0;
Date ordereddate=null;
int transacionid=0;
int amount=0;
double accountnumber=0;
Date dateoftransaction=null;
String ifsc="";
public OrderViewer(int id) {
	this.orderid=id;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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
public double getUserphone() {
	return userphone;
}
public void setUserphone(double userphone) {
	this.userphone = userphone;
}
public int getSeedid() {
	return seedid;
}
public void setSeedid(int seedid) {
	this.seedid = seedid;
}
public String getSeedname() {
	return seedname;
}
public void setSeedname(String seedname) {
	this.seedname = seedname;
}
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public Date getOrdereddate() {
	return ordereddate;
}
public void setOrdereddate(Date ordereddate) {
	this.ordereddate = ordereddate;
}
public int getTransacionid() {
	return transacionid;
}
public void setTransacionid(int transacionid) {
	this.transacionid = transacionid;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public double getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(double accountnumber) {
	this.accountnumber = accountnumber;
}
public Date getDateoftransaction() {
	return dateoftransaction;
}
public void setDateoftransaction(Date dateoftransaction) {
	this.dateoftransaction = dateoftransaction;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}
public int getOrderid() {
	return orderid;
}
@Override
public int compareTo(OrderViewer object) {
	if(object.orderid==this.orderid)
	return 0;
	else	return 1;
}

}
