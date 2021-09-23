package com.aspire.venkatAddressBook;

public class AddressBook implements Comparable<AddressBook>
{
	private final int contactid; 
	private String name ; 
	private String address ;
	private long phonenumber ; 
	private String emailAddress;
	public AddressBook(int contactno)
	{
		this.contactid=contactno;
	}
	public int getContactid() {
		return contactid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public boolean equals(Object otherObject)
	{
		@SuppressWarnings("unchecked")
		Class<AddressBook> c1=(Class<AddressBook>) otherObject.getClass();
		boolean flag=false;
		if(c1==this.getClass())
		{
			AddressBook other=(AddressBook)otherObject;
			if(this.hashCode()==other.hashCode()) flag=true;
		}
		return flag;
	}
	@Override
	public int hashCode()
	{
		return this.contactid;
	}
	@Override
	public String toString()
	{
		return this.contactid+","+this.name+","+this.address+","+this.phonenumber+","+this.emailAddress;
	}
	@Override
	public int compareTo(AddressBook o) {
		int result=-1;
		if(this.contactid==o.contactid)	result=0;
		else if(this.contactid>o.contactid) result=1;
		else result=-1;		
		return result;
	}
}
