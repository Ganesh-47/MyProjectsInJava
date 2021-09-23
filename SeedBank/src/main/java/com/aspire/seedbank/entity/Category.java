package com.aspire.seedbank.entity;

import java.io.Serializable;

public class Category implements Serializable, Comparable<Category>{
/**
	 * 
	 */
	private static final long serialVersionUID = 4541697901934799535L;
private final int categoryid;
private String categoryname="";
public String getCategoryname() {
	return categoryname;
}
public void setCategoryname(String categoryname) throws Exception {
	String lowername=categoryname.toLowerCase();
	char letterarray[]=lowername.toCharArray();
	for(char character: letterarray) {
		int ascii=(int)character;
	if(((ascii<(int)'a'||ascii>(int)'z')&&character!=' ')||lowername.length()<=2||lowername.length()>30)
		throw new Exception("Category Name is Invalid!!! Name contains only Alphabates not special character and legths should be greataer than 2 and lessthan 30\nCheck Spelling Once and Try Again!   ");
	}
		
		for(int indexvalue=0;indexvalue<categoryname.length()-2;indexvalue++){
		if(categoryname.charAt(indexvalue)==categoryname.charAt(indexvalue+1)&&categoryname.charAt(indexvalue)==categoryname.charAt(indexvalue+2)){
			throw new Exception("Category Name is Invalid!!!  Characters shouls not repeat 3 times continuesly\nCheck the spelling once and try again ! ");
		}
		}
	this.categoryname = categoryname;
}
public int getCategoryid() {
	return categoryid;
}
public Category(int id) {
	this.categoryid=id;
}
@Override
public int compareTo(Category object) {
	if(object.categoryid==this.categoryid)
	return 0;
	else	return 1;
}
}
