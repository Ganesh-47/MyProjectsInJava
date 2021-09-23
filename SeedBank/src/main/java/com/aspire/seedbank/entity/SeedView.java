package com.aspire.seedbank.entity;

import java.io.Serializable;

public class SeedView implements Serializable, Comparable<SeedView>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2806629989709259495L;
	private final int seedid;
	private int categoryid=0;
	private String categoryname="";
	private String seedname="";
	private int temperature=0;
	private String image="";
	private int kilogramsinstock=0;
	private int priceperkilogramdeposit=0;
	private int priceperkilogramwithdraw=0;
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getSeedname() {
		return seedname;
	}
	public void setSeedname(String seedname) {
		this.seedname = seedname;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getKilogramsinstock() {
		return kilogramsinstock;
	}
	public void setKilogramsinstock(int kilogramsinstock) {
		this.kilogramsinstock = kilogramsinstock;
	}
	public int getPriceperkilogramdeposite() {
		return priceperkilogramdeposit;
	}
	public void setPriceperkilogramdeposite(int priceperkilogramdeposite) {
		this.priceperkilogramdeposit = priceperkilogramdeposite;
	}
	public int getPriceperkilogramwithdraw() {
		return priceperkilogramwithdraw;
	}
	public void setPriceperkilogramwithdraw(int priceperkilogramwithdraw) {
		this.priceperkilogramwithdraw = priceperkilogramwithdraw;
	}
	public int getSeedid() {
		return seedid;
	}
	public SeedView(int id) {
		this.seedid=id;
	}
	@Override
	public int compareTo(SeedView object) {
		if(object.seedid==this.seedid)
		return 0;
		else	return 1;
	}
}
