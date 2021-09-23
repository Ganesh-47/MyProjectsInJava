package com.aspire.fileassignment;

import java.io.BufferedWriter;
import java.io.File;
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
		  err.printStackTrace();
		 }
		 finally
		 {
		   try {
			bfr.close();
			fwriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}   
  	}
	}
	public static boolean createContactAddressBook(String fileName){
		boolean flag=false;
		File contactAddressBook=new File(fileName);
		try {
			if(contactAddressBook.createNewFile()){
				return flag;
			}else{
				fileName=ContactAddressBookUI.pathGetter();
				return flag;
			}
		} catch (IOException e) {
			e.printStackTrace();
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
}
