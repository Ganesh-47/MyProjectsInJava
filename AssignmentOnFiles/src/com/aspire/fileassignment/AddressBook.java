package com.aspire.fileassignment;

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
	public void setName(String name,String path) {
		String lowername=name.toLowerCase();
		char letterarray[]=lowername.toCharArray();
			for(int i=0;i<name.length();i++){
				char c=letterarray[i];
				int ascii=(int)c;
			if(((ascii<(int)'a'||ascii>(int)'z')&&c!=' ')||lowername.length()<=2||lowername.length()>30){
				BusinessController.setValues(path, this.id);
				break;
			}
			}
				for(int i=0;i<name.length()-2;i++){
					if((letterarray[i]==letterarray[i+1])&&(letterarray[i]==letterarray[i+2])){
						this.name=BusinessController.setValues(path, this.id).getName();
						break;
					}else{
						this.name =name;
					}
				}
			
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address,String path) {
			for(int i=0;i<address.length()-2;i++){
			if(address.length()<10||(address.charAt(i)==address.charAt(i+1))&&(address.charAt(i)==address.charAt(i+2))){
				this.address=BusinessController.setValues(path, this.id).getAddress();
				break;
			}else{
				this.address = address;
			}
			}
		
	}
	public long getPhonenumber() {
		return phoneNumber;
	}
	public void setPhonenumber(String mobileNumber,String path) {
		 boolean flag=true;
		 AddressBook addressbook=null;
			char[] mobileNumberDigits=mobileNumber.toCharArray();
			for(char digit:mobileNumberDigits){
				if((int)digit>(int)'9'||(int)digit<(int)'0'||(mobileNumber.charAt(0)<'5'&&mobileNumber.charAt(0)>'9')||mobileNumber.length()!=10){
					flag=false;
					addressbook=BusinessController.setValues(path, this.id);
					break;
				}
			}
			if(flag==true){
				this.phoneNumber=Long.parseLong(mobileNumber);
			}else{
				this.phoneNumber=addressbook.getPhonenumber();
			}
			
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
