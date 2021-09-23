package com.aspire.fieoperations;
import java.io.*;
public class FileWrriterExample {

	public static void main(String[] args) {

		 java.util.Scanner scanner=new java.util.Scanner(System.in);
		 String fname="";
		 String source = "";
		 try {
		  System.out.println("Enter FileName with full path");
		  fname = scanner.nextLine();
		  System.out.println("Enter Data");
		  source = scanner.nextLine();
		 } finally {
		  scanner.close();
		 }
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
		   System.out.println("Data Saved");
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

}
