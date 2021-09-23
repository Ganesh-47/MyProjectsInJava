package com.aspire.finalproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulator {
	public static void fileWrite(String fname,String source){
		 char buffer[] = new char[source.length()];
		    source.getChars(0, source.length(), buffer, 0);
		    FileWriter fwriter =null;
		    BufferedWriter bfr=null;
		    try
		    {
		   fwriter=new FileWriter(fname,true);
		   bfr=new BufferedWriter(fwriter);
		   for (int i=0; i < buffer.length; i ++)
		   {
		   bfr.write(buffer[i]);
		   }
		   bfr.newLine();
		 }catch(Exception err)
		 {
		  ErrorLog.log("Exception Occurs!!!");
		 }
		 finally
		 {
		   try {
			bfr.close();
			fwriter.close();
		} catch (IOException e) {
			
			ErrorLog.log("IO Exception Occurs!!!");
		}   
  	}
	}
	public static boolean createContactAddressBook(String fileName){
		boolean flag=false;
		while(flag==false){
		File contactAddressBook=new File(fileName);
			try {
				if(contactAddressBook.createNewFile()){
					flag=true;
				}
				else{
					flag=false;
					fileName=ContactAddressBookUI.pathGetter();
				}
			} catch (IOException e) {
				ErrorLog.log("IO Exception Occurs!!!");
			}
		
	}
		return flag;
	}
	public static boolean deleteContactAddressBook(String fileName){
		boolean flag=false;
		while(flag==false){
		File contactAddressBook=new File(fileName);
		if(contactAddressBook.delete()){
			flag=true;
		}
		else{
			flag=false;
			fileName=ContactAddressBookUI.pathGetter();
		}
	}
		return flag;
	}
	@SuppressWarnings("null")
	public static String[] readDataFromFile(String filename)
	 {
	  String data=null;
	  FileReader filereader=null;
	  BufferedReader bufferreader=null;
	  File filetoreadfrom=null;
	  String[] output = null;
	  
	  try{
		  int index=0;
	   filetoreadfrom = new File(filename);
	   try {
		filereader = new FileReader(filetoreadfrom);
	} catch (FileNotFoundException e1) {
		ErrorLog.log("File Not Found Exception Occurs!!!");
	}
	   bufferreader = new BufferedReader(filereader);
	   try {
		while((data=bufferreader.readLine())!=null)
		   {
			   output[index]=data;
			   index++;
		   }
	} catch (IOException e) {
		ErrorLog.log("IO Exception Occurs!!!");
	}
	  }
	  finally
	  {
	   try
	   {
		bufferreader.close();
	    filereader.close(); 
	   }
	   catch(IOException e1)
	   {
		   ErrorLog.log("IO Exception Occurs!!!");
	   }
	  }
	  return output;
	 }

}
