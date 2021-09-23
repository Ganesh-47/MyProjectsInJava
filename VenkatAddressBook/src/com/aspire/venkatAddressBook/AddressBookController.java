package com.aspire.venkatAddressBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddressBookController {	
	private static final  String path="c:/temp/";
	private static final String filename="AddressBook.csv";
	HashMap<Integer,AddressBook> contactmap=null;
	public AddressBookController()
	{
		AddreaaBookFAC contactfileaccesscontrol=
				new AddreaaBookFAC();	
		createFileifNotfound(contactfileaccesscontrol);
		try {
			contactmap=contactfileaccesscontrol.getContactMapFromFile(path, filename);
		} catch (IOException e) {
			LogManager.logMessage(
					"AddressBookController Constructor", 
					e.getMessage());	
		}
	}
	private boolean createFileifNotfound(AddreaaBookFAC contactfileaccesscontrol)
	{
		boolean doesfileexist=false;
		try {
			doesfileexist = contactfileaccesscontrol.isFileExist(path, filename);
			if(!doesfileexist)
			{
				doesfileexist=contactfileaccesscontrol.createFile(path, filename);
			}
		} catch (IOException e) {
			LogManager.logMessage(
					"AddressBookController.addNewContact", 
					e.getMessage());			
		}
		return doesfileexist;
	}
	public boolean addNewContact(AddressBook contact) {
		AddreaaBookFAC contactfileaccesscontrol=
				new AddreaaBookFAC();
		boolean iscontactadded=false;
		boolean iscontactduplicate=false;
		if(contactmap==null)
			contactmap=new HashMap<Integer, AddressBook>();
		iscontactduplicate=contactmap.containsKey(contact.getContactid());
		if(iscontactduplicate)
		{
			return false;
		}
		else
			contactmap.put(contact.getContactid(),contact);
		String row= contact.toString();
		try {
			
			iscontactadded=contactfileaccesscontrol.appendToFile(path, filename, row);
		} catch (IOException e) {
			LogManager.logMessage(
					"AddressBookController.addNewContact", 
					e.getMessage());	
		}		
		return iscontactadded;
	}
	public Set<AddressBook> getAllContacts() 
	{
		Set<AddressBook> contactset=new HashSet<>();
		Set<Map.Entry<Integer, AddressBook>> contactentryset=null;
		if(contactmap!=null)
		{
			contactentryset=contactmap.entrySet();
		}
		Iterator<Map.Entry<Integer, AddressBook>> iterator 
				= contactentryset.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, AddressBook> element=
					iterator.next();
			contactset.add(element.getValue());
		}
		return contactset;
	}
	public AddressBook findContactByID(int contactId)
	{
		AddressBook contact=null;
		if(contactmap!=null)
			contact=contactmap.get(contactId);
		return contact;
	}
	public AddressBook findContactByEmail(String emailaddress)
	{
		 Set<AddressBook> contactset=getAllContacts();
		 AddressBook contact=null;
		 Iterator<AddressBook> iterator=contactset.iterator();
			while(iterator.hasNext())
			{
				 contact=iterator.next();
				if(contact.getEmailAddress().equals(emailaddress))
				{
					return contact;
				}
				else
					contact=null;
			}
		return null;
	}
	public List<AddressBook> findContactsByCityName(String city) 
	{
		 Set<AddressBook> contactset=getAllContacts();
		 List<AddressBook> citywisecontactlist=new ArrayList<AddressBook>();
		 Iterator<AddressBook> iterator=contactset.iterator();
		while(iterator.hasNext())
		{
			AddressBook contact=iterator.next();
			if(contact.getAddress().equals(city))
			{
				citywisecontactlist.add(contact);
			}				
		}
		return citywisecontactlist;
	}
	public boolean modifyContactInformation(AddressBook contact) {
		boolean flag=false;
		AddressBook oldContact=findContactByID(contact.getContactid());
		if(oldContact!=null)
		{
			oldContact.setName(contact.getName());
			oldContact.setAddress(contact.getAddress());
			oldContact.setEmailAddress(contact.getEmailAddress());
			flag=true;
		}
		return flag;
	}
	public boolean saveChanges() {
		boolean flag=false;
		AddreaaBookFAC contactfileaccesscontrol=
				new AddreaaBookFAC();
		flag=contactfileaccesscontrol.saveChanges(path, filename, contactmap);
		return flag;
	}
	public boolean undoChanges(){
		return false;
	}
	public boolean removeContactFromBook(){
		return false;
	}
	public int getContactCount(){
		int count=0;
		if(contactmap!=null)count=contactmap.size();
		return count;
	}
}
