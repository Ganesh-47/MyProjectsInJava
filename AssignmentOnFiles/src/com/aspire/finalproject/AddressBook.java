package com.aspire.finalproject;

public class AddressBook implements Comparable<AddressBook>
{
	private final int id; 
	private String name ; 
	private String address ;
	private long phoneNumber ; 
	public AddressBook(int contactno)
	{
		this.id=contactno;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		String lowername=name.toLowerCase();
		boolean flag=true;
		char letterarray[]=lowername.toCharArray();
			for(int i=0;i<name.length();i++){
				char c=letterarray[i];
				int ascii=(int)c;
			if(((ascii<(int)'a'||ascii>(int)'z')&&c!=' ')||lowername.length()<=2||lowername.length()>30){
				flag= false;
				break;
			}
			
			}
			if(flag==true){
				for(int i=0;i<name.length()-2;i++){
					if((letterarray[i]==letterarray[i+1])&&(letterarray[i]==letterarray[i+2])){
						flag=false;
						break;
					}
				}
			}
		if(flag==true){		
		this.name = name;
		}
		return flag;
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
		boolean flag=true;
			for(int i=0;i<address.length()-2;i++){
			if(address.length()<10||(address.charAt(i)==address.charAt(i+1))&&(address.charAt(i)==address.charAt(i+2))){
				flag=false;
				break;
			}
			}
	if(flag==true)
		this.address = address;
	return flag;
	}
	public long getPhonenumber() {
		return phoneNumber;
	}
	public boolean setPhonenumber(String mobileNumber) {
		boolean flag=true;
			char[] mobileNumberDigits=mobileNumber.toCharArray();
			for(char digit:mobileNumberDigits){
				if((int)digit>(int)'9'||(int)digit<(int)'0'||mobileNumber.charAt(0)<'5'){
					flag=false;
					break;
				}
			}
			if(flag==true){
			if(Long.parseLong(mobileNumber)>=0&&mobileNumber.length()==10){
				flag=true;
			}else{
				flag=false;
			}
			
		}
		if(flag==true)
		this.phoneNumber = Long.parseLong(mobileNumber);
		return flag;
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
		return this.id;
	}
	@Override
	public String toString()
	{
		return this.id+","+this.name+","+this.address+","+this.phoneNumber+",";
	}
	public int compareTo(AddressBook o) {
		int result=-1;
		if(this.id==o.id)	result=0;
		else if(this.id>o.id) result=1;
		else result=-1;		
		return result;
	}
}
