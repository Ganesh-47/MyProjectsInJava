package com.aspire.seedbank.entity;

import java.io.Serializable;
import java.sql.Date;

public class Feedback implements Serializable, Comparable<Feedback>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3445234438252257204L;
	private final int feedbackid;
	private int userid=0;
	private int orderid=0;
	String feedback="";
	Date dateoffeedback=null;
	public Feedback(int id) {
		this.feedbackid=id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Date getDateoffeedback() {
		return dateoffeedback;
	}
	public void setDateoffeedback(Date dateoffeedback) {
		this.dateoffeedback = dateoffeedback;
	}
	public int getFeedbackid() {
		return feedbackid;
	}
	@Override
	public int compareTo(Feedback object) {
		if(object.feedbackid==this.feedbackid)
		return 0;
		else	return 1;
	}
}
