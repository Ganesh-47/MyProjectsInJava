package com.aspire.fieoperations;

import java.io.File;

public class FileOperationExample {

	public static void main(String[] args) {

		String dirname = "c:\\temp";  
		File file = new File(dirname);
		String filenamelistindirectory[]=null;
		if (file.isDirectory())
		    {
		      System.out.println(dirname+" is a Directory");
		      filenamelistindirectory = file.list();
		      for (int i=0; i < filenamelistindirectory.length; i++)
		      {
		        File f = new File(dirname + "/" + filenamelistindirectory[i]);
		        if (f.isDirectory())
		        {
		          System.out.println("\t<"+f.getName() + "> is a sub directory");
		        }
		        else
		        {
		          System.out.println("\t"+f.getName() + " is a file");
		        }
		      }
		    }
	    else
		    {
		      System.out.println(dirname + " is not a directory");
		    }
		}

	}
