package com.aspire.fieoperations;
import java.io.*;
import java.util.*;
public class FileOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createFileUsingFileClass();
		//renameFile();
		readDataFromFile();

	}

public static void createFileUsingFileClass()
 {
 File file=null;
 Scanner scanner=null;
 boolean flag=false;
 String filename=null;
 try{
  scanner=new Scanner(System.in);
  System.out.println("Give a name for the new file" );
  filename=scanner.nextLine(); 
  file=new File(filename);
  flag=file.createNewFile();
  System.out.println("The file is created "+flag);
 }
 catch (IOException e1) 
 {
  e1.printStackTrace();
 }
 finally
 {
  scanner.close();
 }
}
public static void renameFile()
{
  String fileNewName = null;
  String oldfilename=null;  
  BufferedReader bufferreader=null;
	File newFile=null;
	File file = null;
	try{
	bufferreader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the current file name");  
	oldfilename=bufferreader.readLine();
	file=new File(oldfilename);
	
	try {
	 System.out.println("Enter the new file name");  
	 fileNewName=bufferreader.readLine();
	 newFile = new File(fileNewName);
	} catch (Exception e1) {
	 e1.printStackTrace();
	}
	try {
	 if(file.renameTo(newFile))
	 {
	  System.out.println("File rename successfully");
	 }
	 else
	 {
	  System.out.println("File name is not changed");
	 }
	} catch (Exception e) {
	 e.printStackTrace();
	}
	}catch(Exception e)
	{
	e.printStackTrace();   
	}
	finally
	{
	try
	{
	 bufferreader.close();
	}catch(Exception err){err.printStackTrace();}
	}
 }

public static void readDataFromFile()
 {
  String filename=null;
  String data=null;
  Scanner scanner=null;
  FileReader filereader=null;
  BufferedReader bufferreader=null;
  File filetoreadfrom=null;
  try{
   scanner=new Scanner(System.in);
   System.out.println("Give the name of the file to read data from" );
   filename=scanner.nextLine(); 
   filetoreadfrom = new File(filename);
   filereader = new FileReader(filetoreadfrom);
   bufferreader = new BufferedReader(filereader);
   while((data=bufferreader.readLine())!=null)
   {
    System.out.println(data);
   }
  }catch(Exception e)
  {
   e.printStackTrace();
  }
  finally
  {
   try
   {
    filereader.close();
    bufferreader.close();
    scanner.close();
   }
   catch(IOException e1)
   {
    e1.printStackTrace();
   }
  }
 }

public static boolean deleteFile()
 {
  boolean flag=false;
  String filename=null;
  Scanner scanner=null;
  File filetodelete=null;
  try{
   scanner=new Scanner(System.in);
   System.out.println("Give the name of the file to DELETE!!!" );
   filename=scanner.nextLine(); 
   filetodelete=new File(filename);
   flag=filetodelete.delete();
   if(flag)
   {
    System.out.println("File was successfully deleted");
   }
   else
   {
    System.out.println("File was not deleted");
   }
  }catch(Exception e)
  {
   e.printStackTrace();
  }
  finally
  {
   scanner.close();
  }
  return flag;

 }

public boolean moveFile()
 {
  boolean flag=false;
  String filename=null;
  String newfilelocation=null;
  Scanner scanner=null;
  File filetomove=null;
  try{
   scanner=new Scanner(System.in);
   //c:/Temp/readme.txt
   System.out.println("Give the name of the file to MOVE" );
   filename=scanner.nextLine(); 
   filetomove=new File(filename);
   ////c:/Temp/food/readme.txt
   System.out.println("Give the new path with filename to MOVE" );
   newfilelocation=scanner.nextLine(); 
   File fileinnewloc = new File(newfilelocation);   
   if(filetomove.renameTo(fileinnewloc))
   {
    System.out.println("File Moved successfully");
    filetomove.delete();
   }   
  }catch(Exception e)
  {
   e.printStackTrace();
  }
  finally
  {
   scanner.close();
  }
  return flag;
 }

 }



