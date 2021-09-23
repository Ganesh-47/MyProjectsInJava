package com.aspire.seedbank.entity;

import java.io.Serializable;

public class Seed implements Serializable, Comparable<Seed>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -748794619411938813L;
	private final int seedid;
	private int categoryid=0;
	private String seedname="";
	private int temperature=0;
	private String image="";
	private int kilogramsinstock=0;
	private int priceperkilogramdeposite=0;
	private int priceperkilogramwithdraw=0;
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getSeedname() {
		
		return seedname;
	}
	public void setSeedname(String seedname) throws Exception {
		String lowername=seedname.toLowerCase();
		char letterarray[]=lowername.toCharArray();
		for(char character: letterarray) {
			int ascii=(int)character;
		if(((ascii<(int)'a'||ascii>(int)'z')&&character!=' ')||lowername.length()<=2||lowername.length()>30)
			throw new Exception("Seed Name is Invalid!!! Name contains only Alphabates not special character and legths should be greataer than 2 and lessthan 30\nCheck Spelling Once and Try Again!   ");
		}
			
			for(int indexvalue=0;indexvalue<seedname.length()-2;indexvalue++){
			if(seedname.charAt(indexvalue)==seedname.charAt(indexvalue+1)&&seedname.charAt(indexvalue)==seedname.charAt(indexvalue+2)){
				throw new Exception("Seed Name is Invalid!!!  Characters shouls not repeat 3 times continuesly\nCheck the spelling once and try again ! ");
			}
			}
		this.seedname = seedname;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) throws Exception {
		if(temperature<50)
		this.temperature = temperature;
		else	throw new Exception("Temperature will not be more than 50");
			
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
	public void setKilogramsinstock(int kilogramsinstock) throws Exception {
		if(kilogramsinstock<1000)
		this.kilogramsinstock = kilogramsinstock;
		else	throw new Exception("Kilograms should be less than 1000");
	}
	public int getPriceperkilogramdeposite() {
		return priceperkilogramdeposite;
	}
	public void setPriceperkilogramdeposite(int priceperkilogramdeposite) throws Exception {
		if(priceperkilogramdeposite<1000)
		this.priceperkilogramdeposite = priceperkilogramdeposite;
		else	throw new Exception("Price should be less than 1000");
	}
	public int getPriceperkilogramwithdraw() {
		return priceperkilogramwithdraw;
	}
	public void setPriceperkilogramwithdraw(int priceperkilogramwithdraw) throws Exception {
		if(priceperkilogramwithdraw<1000)
		this.priceperkilogramwithdraw = priceperkilogramwithdraw;
		else	throw new Exception("Price should be less than 1000");
	}
	public int getSeedid() {
		return seedid;
	}
	public Seed(int id) {
		this.seedid=id;
	}
	@Override
	public int compareTo(Seed object) {
		if(object.seedid==this.seedid)
		return 0;
		else	return 1;
	}
}
