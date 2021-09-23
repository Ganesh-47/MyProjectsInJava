package com.aspire.fieoperations;
import java.io.*;
public class CreatingTheFile {

	public static void main(String[] args) {

java.util.Scanner scanner=new java.util.Scanner(System.in);
 System.out.println("Enter Data");
    String source = scanner.nextLine();
    System.out.println("Enter FileName ");
    String fname="C:/temp/" + scanner.nextLine();
 OutputStream fileoutstream=null;
 try
 {
  byte buffer[] = source.getBytes();
  System.out.println("Length "+buffer.length);
  fileoutstream= new FileOutputStream(fname);
  for (int i=0; i < buffer.length; i ++)
  {
  fileoutstream.write(buffer[i]);
  }
   System.out.println("File Write Completed");
   }catch(java.io.FileNotFoundException e1)
   {
    System.out.println("FileNotFoundException "+e1.getMessage());
   }
   catch(java.io.IOException e2)
   {
    System.out.println("IOException "+e2.getMessage());
   }
   finally
   {
    try
    {
   if(null!=fileoutstream) fileoutstream.close();
   scanner.close();
    }catch(java.io.IOException e2)
    {
   System.out.println("Inside Finally "+e2.getMessage());
    }
     }


	}

}
