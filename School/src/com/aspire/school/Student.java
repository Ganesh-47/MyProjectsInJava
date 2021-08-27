package com.aspire.school;

import java.time.LocalDate;

public class Student {
	int age;
	String name;
	int sslcmark;
	LocalDate date;
	long mobileNo;
	String address;
	String group;
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSslcmark() {
		return sslcmark;
	}
	public void setSslcmark(int sslcmark) {
		this.sslcmark = sslcmark;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
