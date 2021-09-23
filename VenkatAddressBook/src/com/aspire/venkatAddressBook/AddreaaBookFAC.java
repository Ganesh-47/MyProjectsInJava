package com.aspire.venkatAddressBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddreaaBookFAC implements IAddressBookFileAccessController {
	public  boolean isFileExist( String path, String filename) throws IOException
	{
		File file=null;		
		// TODO Validate path 
		// TODO validate filename		
		file=new File(path.concat(filename));		
		return file.exists();
	}
	public  boolean createFile( String path, String filename) throws IOException
	{
		File file=null;		
		boolean flag=false;
		// TODO Validate path 
		// TODO validate filename		
		file=new File(path.concat(path+filename));
		flag=file.createNewFile();			
		return flag; 
	}
	public  boolean appendToFile(String path, String filename,String row) throws IOException
	{
		// TODO  Validate path
		// TODO validate filename	
		
		boolean flag=false;
		FileWriter filewriter=null;
	    BufferedWriter bufferwriter=null;
	    try
	    {
		 filewriter=new FileWriter(path.concat(filename),true);

		 bufferwriter=new BufferedWriter(filewriter);

		 bufferwriter.write(row);
		 bufferwriter.newLine();	
		 flag = true;
		}
		finally
		{
			try
			{
			 bufferwriter.close();
			 filewriter.close();			
			}catch(IOException err)
			{  
				LogManager.logMessage(
						"AddreaaBookFAC.appendToFile", 
						err.getMessage());	
			}
			catch(Exception err)
			{  
				LogManager.logMessage(
						"AddreaaBookFAC.appendToFile", 
						err.getMessage());	
			}
		}
		return flag ;
	}
	public  HashMap<Integer,AddressBook> getContactMapFromFile(String path, String filename) throws IOException
	{
		HashMap<Integer,AddressBook> addressbookmap=
				new HashMap<>(50);
		String data=null;
		FileReader filereader=null;
		BufferedReader bufferreader=null;
		File filetoreadfrom=null;
		try{
			
			filetoreadfrom = new File(path.concat(filename));
			filereader = new FileReader(filetoreadfrom);
		
			bufferreader = new BufferedReader(filereader);
			String[] addressdetails=null;
			while((data=bufferreader.readLine())!=null)
			{
				addressdetails=data.split(",");
				int id=Integer.parseInt(addressdetails[0]);
				AddressBook contact=new AddressBook(id);
				contact.setName(addressdetails[1]);
				contact.setAddress(addressdetails[2]);
				long pno=Long.parseLong(addressdetails[3]);
				contact.setPhonenumber(pno);
				contact.setEmailAddress(addressdetails[4]);
				addressbookmap.put(contact.getContactid(),contact);
			}
		}
		finally
		{
			try
			{				
				bufferreader.close();
				filereader.close();
			}
			catch(IOException err)
			{
				LogManager.logMessage(
						"AddreaaBookFAC.getContactMapFromFile", 
						err.getMessage());	
			}
			catch(Exception err)
			{
				LogManager.logMessage(
						"AddreaaBookFAC.getContactMapFromFile", 
						err.getMessage());	
			}
		}
		return addressbookmap;
	}
	public  boolean saveChanges(String path, String filename,HashMap<Integer,AddressBook> data) 
	{
		boolean flag=false;
		// TODO Validate file name, and path
		if(data==null)
		{
			return false;
		}
		FileWriter filewriter=null;
	    BufferedWriter bufferwriter=null;
		try{
			filewriter=new FileWriter(path.concat(filename),false);
			bufferwriter=new BufferedWriter(filewriter);
			///
			Set<Map.Entry<Integer, AddressBook>> contactentryset=data.entrySet();
			Iterator<Map.Entry<Integer, AddressBook>> iterator 
					= contactentryset.iterator();
			while(iterator.hasNext())
			{
				Map.Entry<Integer, AddressBook> element=
						iterator.next();
				AddressBook contact=element.getValue();
				bufferwriter.write(contact.toString());
				bufferwriter.newLine();
			}
			flag=true;
		}catch(Exception e)
		{
		  LogManager.logMessage(
					"AddreaaBookFAC.saveChanges", 
					e.getMessage());	
		}
		finally
		{
			try
			{
			 bufferwriter.close();
			 filewriter.close();
			}catch(IOException e)
			{ 
			  LogManager.logMessage(
							"AddreaaBookFAC.saveChanges", 
							e.getMessage());	
			}
		}
		return flag;
	}
	public  boolean deleteFile(String path, String filename) 
	{
		return false;
	}

}
