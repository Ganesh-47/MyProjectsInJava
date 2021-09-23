package com.aspire.seedbank.entity;

import java.io.Serializable;
import java.util.Date;

public class Deposit implements Serializable, Comparable<Deposit> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3741068624435092819L;
	private final int depositid;
	private int userid=0;
	private int seedid=0;
	private int quantity=0;
	private Date depositedate=null;
	private int transactionid=0;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public Deposit(int id) {
		this.depositid=id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getSeedid() {
		return seedid;
	}
	public void setSeedid(int seedid) {
		this.seedid = seedid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDepositedate() {
		return depositedate;
	}
	public void setDepositedate(Date depositedate) {
		this.depositedate = depositedate;
	}
	public int getDepositid() {
		return depositid;
	}
	@Override
	public int compareTo(Deposit object) {
		if(object.depositid==this.depositid)
		return 0;
		else	return 1;
	}
	}
