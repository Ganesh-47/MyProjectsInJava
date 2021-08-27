package com.aspire.interviewhelper;
public class Applicant {
	private int id;
	private String applicanName="";
	private String interviewDate="";
	private String status="";
	public int getId() {
		return id;
	}
	public void setId(int id) throws Exception {
		if(id <= 0 && id>=1000) {
			throw new Exception("ID shouldn't be less than 1 and not more than 1000");
		}
		this.id = id;
	}
	public String getName() {
		return applicanName;
	}
	public void setName(String name) throws Exception {
		int nameLength=name.length();
		String lowercaseName=name.toLowerCase();
		char[] chars = lowercaseName.toCharArray();
		if(nameLength<2&&nameLength>15) {
			throw new Exception("Name Shouldn't be have minimum 2 character and not more than 15");
		}
	      for(char c : chars){
	    	  int ascii=c;
	         if(ascii<97 || ascii>122){
	            throw new Exception("Name Shouldn't contains Numbers");
	         }
	      }
		this.applicanName = name;
	}
	public String getDate() {
		return interviewDate;
	}
	public void setDate(String date) throws Exception {
		if(date==null || date=="") {
			throw new Exception("Date shouldn't be NULL or Empty");
		}
		this.interviewDate = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) throws Exception {
		if(status==null || status=="") {
			throw new Exception("Status shouldn't be NULL or Empty");
		}
		this.status = status;
	}
	

}
