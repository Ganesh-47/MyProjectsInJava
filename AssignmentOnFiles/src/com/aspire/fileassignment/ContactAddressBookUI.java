package com.aspire.fileassignment;

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
				BusinessController.insert(hashsetforaddressbook,path,id);
				System.out.println("!!! Contact Saved Successfully !!!");
				id++;
				break;
			}
			case "2":{
				BusinessController.edit(hashsetforaddressbook,path);
				break;
			}
			case "3":{
				System.out.println(BusinessController.search(hashsetforaddressbook,path));
				break;
			}
			case "4":{
				BusinessController.delete(hashsetforaddressbook,path);
				break;
			}
			case "5":{
				if(hashsetforaddressbook.size()==0) {
					System.out.println("!!!! No Records Found !!!! ");
				}else{
				for(AddressBook addressbook:hashsetforaddressbook){
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
				}
				break;
			}
			case "7":{
				path=pathGetter();
				if(FileManipulator.createContactAddressBook(path)) {
					System.out.println("AddressBook deleted !!!!");
				}
				break;
			}
			default:{
				System.out.println("Enter Valid Choice!!!\n");
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
}
