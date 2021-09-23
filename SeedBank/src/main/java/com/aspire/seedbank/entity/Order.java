package com.aspire.seedbank.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable, Comparable<Order>{

		/**
	 * 
	 */
	private static final long serialVersionUID = -3000617900274485009L;
		private final int orderid;
		private int userid=0;
		private int seedid=0;
		private int quantity=0;
		private Date ordereddate=null;
		private int transactionid=0;
		public int getTransactionid() {
			return transactionid;
		}
		public void setTransactionid(int transactionid) {
			this.transactionid = transactionid;
		}
		public Order(int id) {
			this.orderid=id;
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
		public Date getOrdereddate() {
			return ordereddate;
		}
		public void setOrdereddate(Date ordereddate) {
			this.ordereddate = ordereddate;
		}
		public int getOrderid() {
			return orderid;
		}
		@Override
		public int compareTo(Order object) {
			if(object.orderid==this.orderid)
			return 0;
			else	return 1;
		}

}
