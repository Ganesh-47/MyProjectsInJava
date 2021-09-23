package com.aspire.fieoperations;
import java.io.*;
public class FileInputStreameExample {

	public static void main(String[] args) {

		int charfromfile;
		FileInputStream fileinstream=null;
		String fname="C:/temp/ganesh.txt";
		 try
		    {
		      fileinstream = new FileInputStream(fname);      
		    }
		 catch(FileNotFoundException e)
		    {
		      System.out.println("File Not Found");
		      return;
		    } 
		 // checking if data isAvailable
		 try
		 {
		  System.out.println("IsData Available "+fileinstream.available());
		 }
		 catch(IOException e)
		    {
		      System.out.println("File is Closed " + e.getMessage());      
		    } 
		 // reading data from the file
		    try
		    {
		  do
		  {
		  charfromfile = fileinstream.read();
		  if(charfromfile != -1) System.out.print((char) charfromfile);
		  } while(charfromfile != -1);
		
		   }catch(IOException e)
		   {
		      System.out.println("Error in read "+e.getMessage());
		   }
		   finally
		   {
		  try
		 {
		  if(null!=fileinstream)   fileinstream.close();
		 }catch(IOException e1)
		 {
		     System.out.println(e1.getMessage());
		 }
	}
		
		
		
	}

}
