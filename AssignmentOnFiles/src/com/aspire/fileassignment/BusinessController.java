package com.aspire.fileassignment;
import java.util.HashSet;


public class BusinessController {
	public static AddressBook setValues(String path,int id){
		AddressBook addressbook=new AddressBook(id);
		addressbook.setName(ContactAddressBookUI.nameGetter(),path);
		addressbook.setAddress(ContactAddressBookUI.addressGetter(),path);
		addressbook.setPhonenumber(ContactAddressBookUI.mobilenumberGetter(),path);
		FileManipulator.fileWrite(path,"Name          : "+addressbook.getName()+"\nAddress       : "+addressbook.getAddress()+"\nPhone Number  : "+addressbook.getPhonenumber()+"\n---------------------------------------");
		return addressbook;
	}
	public static void insert(HashSet<AddressBook> hashsetforaddressbook, String path,int id){
		hashsetforaddressbook.add(BusinessController.setValues(path,id));
	}
	public static void edit(HashSet<AddressBook> hashsetforaddressbook,String path){
		boolean check=false;
		int id=0;
		String nameToEditContact=ContactAddressBookUI.nameGetter();
		
		for(AddressBook addressbook:hashsetforaddressbook){
			if(nameToEditContact.equals(addressbook.getName())){
				id=addressbook.getId();
				hashsetforaddressbook.remove(addressbook);
				check=true;
				break;
			}
		}
		if(check==false)	System.out.println("!!!! No Records Found !!!! ");else{
			System.out.println("----For Editing----");
			hashsetforaddressbook.add(BusinessController.setValues(path,id));
		}
	}
	public static AddressBook search(HashSet<AddressBook> hashsetforaddressbook,String path){
		String nameToSearch=ContactAddressBookUI.nameGetter();
		boolean check=false;
		AddressBook result=null;
		for(AddressBook addressbook:hashsetforaddressbook){
			if(nameToSearch.equals(addressbook.getName())){
				result= addressbook;
			}
		}
		if(check==false)	System.out.println("!!!! No Records Found !!!! ");
		return result;
	}
	public static void delete(HashSet<AddressBook> hashsetforaddressbook,String path){
		boolean check=false;
		String nameToDelete=ContactAddressBookUI.nameGetter();
		for(AddressBook addressbook:hashsetforaddressbook){
			if(nameToDelete.equals(addressbook.getName())){
				hashsetforaddressbook.remove(addressbook);
				check=true;
				System.out.println("!!! Contact Deleted Successfully !!!");
				break;
			}
		}
		if(check==false)	System.out.println("!!!! No Contact Matched !!!! ");
	}
	public static String getName(){
		
	}
	
}
