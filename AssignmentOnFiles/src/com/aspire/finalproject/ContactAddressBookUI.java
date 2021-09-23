package com.aspire.finalproject;

import java.util.HashSet;
import java.util.Scanner;

public class ContactAddressBookUI {
	
	public static void ui(){
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int id=1;
		String path="c:/temp/AddressBook";
		HashSet<AddressBook> hashsetforaddressbook=new HashSet<AddressBook>();
		System.out.println("------------ Contact Address Book ------------\n");
		while(true){
			System.out.println("--------------------- Menu ---------------------\n1. Add New Contact\n2. Edit Contact by Name\n3 .Retrive the Contact Details By Name\n4 .Delete Contact By Name\n5 .View All The Records\n6. Create New Contact Address Book\n7. Delete the File\n****************************************\nChoose Your Option (1/2/3/4/5): ");
			String switchparameter=scanner.nextLine();
			switch(switchparameter){
			case "1":{
				insert(hashsetforaddressbook,path,id);
				System.out.println("!!! Contact Saved Successfully !!!\nThe Contact ID is: "+id);
				ErrorLog.log("!!! Contact Saved Successfully !!!");
				id++;
				break;
			}
			case "2":{
				String nameToEditContact=scanner.nextLine();
				if(BusinessController.edit(hashsetforaddressbook,path,nameToEditContact)){
					insert(hashsetforaddressbook,path,id);
				}
				break;
			}
			case "3":{
				String nameToSearch=scanner.nextLine();
				AddressBook obj=BusinessController.search(hashsetforaddressbook,path,nameToSearch);
				if(obj!=null)
				System.out.println(obj);
				else {
					System.out.println("No Data Found!!!!");
					ErrorLog.log("!!! No Data Found !!!");
				}
				break;
			}
			case "4":{
				String nameToDelete=scanner.nextLine();
				if(BusinessController.delete(hashsetforaddressbook,path,nameToDelete)){
					System.out.println("Contact Deleted Successfully!!!");
					ErrorLog.log("Contact Deleted Successfully!!!");
				}
					
				else	{
					System.out.println("No Data Available to Delete!!!!");
					ErrorLog.log("No Data Available to Delete!!!!");
				}
				break;
			}
			case "5":{
				if(hashsetforaddressbook.size()==0) {
					System.out.println("!!!! No Records Found !!!! ");
					ErrorLog.log("!!!! No Records Found !!!! ");
				}else{
				for(AddressBook addressbook:hashsetforaddressbook){
						System.out.println("ID            : "+addressbook.getId());
						System.out.println("Name          : "+addressbook.getName());
						System.out.println("Address       : "+addressbook.getAddress());
						System.out.println("Phone Number  : "+addressbook.getPhonenumber());
						System.out.println("\n---------------------------------------");
				}
				}
				break;
			}
			case"6":{
				path=pathGetter();
				if(FileManipulator.createContactAddressBook(path)) {
					System.out.println("New AddressBook Created !!!!");
					ErrorLog.log("New AddressBook Created !!!!");
				}
				break;
			}
			case "7":{
				path=pathGetter();
				if(FileManipulator.createContactAddressBook(path)) {
					System.out.println("AddressBook deleted !!!!");
					ErrorLog.log("AddressBook deleted !!!!");
				}
				break;
			}
			default:{
				System.out.println("Enter Valid Choice!!!\n");
				ErrorLog.log("Entered choise is invalid!!!");
			}
			}
		}
   }
	public static String nameGetter(){
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Correct Name : ");
		String name=scanner.nextLine();
		return name;
	}
	public static String addressGetter(){
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Correct Address");
		String address=scanner.nextLine();
		return address;
		
	}
	@SuppressWarnings("resource")
	public static String mobilenumberGetter(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Correct 10 Digit Mobile Number: ");
		String mobileNumber=scanner.nextLine();
		return mobileNumber;
	}
	public static String pathGetter(){
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Correct path: ");
		String path=scanner.nextLine();
		return path;
		
	}
	public static AddressBook setValues(String path,int id){
		AddressBook addressbook=new AddressBook(id);
		do{}
		while(addressbook.setName(nameGetter())== false);
		do{}
		while(addressbook.setAddress(addressGetter())==false);
		do{}
		while(addressbook.setPhonenumber(mobilenumberGetter())==false);
		FileManipulator.fileWrite(path,"Id            : "+addressbook.getId()+"/nName          : "+addressbook.getName()+"\nAddress       : "+addressbook.getAddress()+"\nPhone Number  : "+addressbook.getPhonenumber()+"\n---------------------------------------");
		return addressbook;
	}
	public static void insert(HashSet<AddressBook> hashsetforaddressbook, String path,int id){
		hashsetforaddressbook.add(setValues(path,id));
	}
}
