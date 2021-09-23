package com.aspire.streaming;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sstringdata="99% is approx equal to 100. But it is still not enough";
		  byte buffer[]=sstringdata.getBytes();
		  ByteArrayInputStream inputstream=new ByteArrayInputStream(buffer);
		  BufferedInputStream bufferedinputstream=new BufferedInputStream(inputstream);
		  int c;
		  try
		  {
		   while((c=bufferedinputstream.read())!=-1)
		   {
		    System.out.print((char) c);   
		   }
		  }catch(IOException ex)
		  {
		   ex.printStackTrace();
		  }
		  finally
		  {
		   try {
		    bufferedinputstream.close();
		    inputstream.close();
		   } catch (IOException e) {
		    e.printStackTrace();
		   }
		  }
	}
}
