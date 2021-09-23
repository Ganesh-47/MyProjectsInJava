package com.aspire.finalproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorLog {
	public static void log(String source){
		String fname="c:/temp/log.txt";
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
}
