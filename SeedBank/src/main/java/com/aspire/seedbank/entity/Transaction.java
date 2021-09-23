package com.aspire.seedbank.entity;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable, Comparable<Transaction>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7299225376182313815L;
	private final int transactionid;
	private int amount;
	private double accountnumber;
	Date dateoftransaction;
	String ifsc;
	String status;
	public Transaction(int id) {
		this.transactionid=id;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTransactionid() {
		return transactionid;
	}
	@Override
	public int compareTo(Transaction object) {
		if(object.transactionid==this.transactionid)
		return 0;
		else	return 1;
	}
	
}
