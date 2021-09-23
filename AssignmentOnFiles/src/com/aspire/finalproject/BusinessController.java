package com.aspire.finalproject;
import java.util.HashSet;


public class BusinessController {
	
	public static boolean edit(HashSet<AddressBook> hashsetforaddressbook,String path,String nameToEditContact){
		boolean check=false;
		for(AddressBook addressbook:hashsetforaddressbook){
			if(nameToEditContact.equals(addressbook.getName())){
				hashsetforaddressbook.remove(addressbook);
				check=true;
				break;
			}
		}
		return check;
	}
	public static AddressBook search(HashSet<AddressBook> hashsetforaddressbook,String path,String nameToSearch){
		AddressBook result=null;
		for(AddressBook addressbook:hashsetforaddressbook){
			if(nameToSearch.equals(addressbook.getName())){
				result= addressbook;
			}
		}
		return result;
	}
	public static boolean delete(HashSet<AddressBook> hashsetforaddressbook,String path,String nameToDelete){
		boolean check=false;
		for(AddressBook addressbook:hashsetforaddressbook){
			if(nameToDelete.equals(addressbook.getName())){
				hashsetforaddressbook.remove(addressbook);
				check=true;
				break;
			}
		}
		return check;
	}
	
}
