package com.aspire.venkatAddressBook;

import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AddressBookUI {

	public static void main(String[] args) {	
		
		diaplayAllContacts();
		System.out.println("----------");
		modifyAndSaveChanged();
	}
	public static void addNewContactToBook()
	{
		Scanner scanner = new Scanner(System.in); 
		AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		boolean addnewresult=false;
		try
		{
			System.out.println("Enter new Contact ID");
			int id=scanner.nextInt();
			scanner.nextLine();
			contact=new AddressBook(id);
			System.out.println("Enter new Contact Name");
			String name=scanner.nextLine();
			if(name==null)name="Not Assigned";
			contact.setName(name);
			System.out.println("Enter new Contact Address");
			String address=scanner.nextLine();
			contact.setAddress(address);
			System.out.println("Enter new Contact Email address");
			String email=scanner.nextLine();
			contact.setEmailAddress(email);
			System.out.println("Enter new Contact Phone Number");
			long phone=scanner.nextLong();
			contact.setPhonenumber(phone);
			addnewresult=contactcontroller.addNewContact(contact);
			if(addnewresult)
				System.out.println("New Contact Added");
			else
				System.out.println("FAILED!!! To add New Contact");
		}
		finally
		{
			scanner.close();
		}
	}
	public static void diaplayAllContacts()
	{
		//AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		System.out.println(contactcontroller.getContactCount());
		Set<AddressBook> contactlist=
				contactcontroller.getAllContacts();
		Iterator<AddressBook> iterator=contactlist.iterator();
		while(iterator.hasNext())
		{
			AddressBook contact=iterator.next();
			String output=contact.toString();
			System.out.println(output);
		}
	}
	public static void findContact()
	{
		Scanner scanner = new Scanner(System.in); 
		AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		try
		{
			System.out.println("Enter Contact ID to find");
			int id=scanner.nextInt();
			scanner.nextLine();
			contact=contactcontroller.findContactByID(id);
			if(contact!=null)
				System.out.println(contact.toString());
			else
				System.out.println("Contact NOT FOUND");
			System.out.println("==========");
			System.out.println("Enter Contact EmailID to search");
			String email=scanner.nextLine();
			contact=contactcontroller.findContactByEmail(email);
			if(contact!=null)
				System.out.println(contact.toString());
			else
				System.out.println("Contact NOT FOUND");
			System.out.println("==========");
			System.out.println("Enter Contact City to search");
			String city=scanner.nextLine();
			List<AddressBook> contactlist=
					contactcontroller.findContactsByCityName(city);
			Iterator<AddressBook> contactiterator
			= contactlist.iterator();
			while(contactiterator.hasNext())
			{
				contact=contactiterator.next();
				if(contact!=null)
					System.out.println(contact.toString());
				else
					System.out.println("Contact NOT FOUND");
			}
		}
		finally
		{
			scanner.close();
		}
	}
	public static void modifyAndSaveChanged()
	{
		Scanner scanner = new Scanner(System.in); 
		AddressBook contact=null;
		AddressBookController contactcontroller=
				new AddressBookController();
		try
		{
			System.out.println("Enter Contact ID to find");
			int id=scanner.nextInt();
			scanner.nextLine();
			contact=contactcontroller.findContactByID(id);
			if(contact!=null)
				System.out.println(contact.toString());
			else
				System.out.println("Contact NOT FOUND");
			System.out.println("==========");
			System.out.println("Enter new Contact Name to modify");
			String name=scanner.nextLine();
			if(name!=null)
				contact.setName(name);
			System.out.println("Enter new Contact Address to modify");
			String address=scanner.nextLine();
			if(address!=null)
				contact.setAddress(address);
			System.out.println("Enter new Contact Email address to modify");
			String email=scanner.nextLine();
			if(email!=null)
				contact.setEmailAddress(email);
			System.out.println("Enter new Contact Phone Number to modify");
			long phone=scanner.nextLong();
			contact.setPhonenumber(phone);
			boolean saved=false;
			if(contactcontroller.modifyContactInformation(contact))
			{
				saved=contactcontroller.saveChanges();
				System.out.println("Saved "+saved);
			}
			else
				System.out.println("Modification Failed");
		}finally
		{
			scanner.close();
		}
	}
}
