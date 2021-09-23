package com.aspire.streaming;

import java.io.IOException;

public class StreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 /*System.out.println(System.in.getClass().getName());
		   System.out.println(System.out.getClass().getName());
		   System.out.println("Please Enter a Char:");
		   int c1=System.in.read();
		      System.out.println(c1);
		      char c2=(char)c1;
		      System.out.println(c2);*/

		int c=0;
      System.out.println("Enter a character, 'q' to quit.");
      do
     {
    try
    {
     c=System.in.read();
     System.out.println(c+"-"+(char)c);
    }catch(IOException err)
    {
     err.printStackTrace();
    }
    catch(Exception err)
    {
    err.printStackTrace();
    }
  } while(c !=(int)'q');      
     System.out.println("************Exit");   



	}

}
