package com.aspire.seedbank.entity;

import java.io.Serializable;
import java.sql.Date;
public class DepositViewer implements Serializable, Comparable<DepositViewer>{
/**
	 * 
	 */
	private static final long serialVersionUID = 6260803151855049255L;
private final int depositid;
private int userid=0;
private String username="";
private int seedid=0;
private String seedname="";
private int categoryid=0;
private String categoryname="";
private int quantity=0;
private Date depositdate=null;
private int transactionid=0;
private int amount=0;
private double accountnumber=0;
private Date dateoftransaction=null;
private String ifsc="";
public DepositViewer(int id) {
	this.depositid=id;
}
public int getDepositid() {
	return depositid;
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
public Date getDepositdate() {
	return depositdate;
}
public void setDepositdate(Date date) {
	this.depositdate = date;
}
public int getTransactionid() {
	return transactionid;
}
public void setTransactionid(int transactionid) {
	this.transactionid = transactionid;
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
@Override
public int compareTo(DepositViewer object) {
	if(object.depositid==this.depositid)
	return 0;
	else	return 1;
}

}
