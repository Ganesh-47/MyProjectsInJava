package com.aspire.streaming;
import java.io.*;
public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader inputstreamreader=new InputStreamReader(System.in);
		  BufferedReader bufferedreader=new BufferedReader(inputstreamreader);
		  String inputstringdata="";
		  System.out.println("Enter lines of Text:");
		  System.out.println("Enter 'stop' to quit:");
		  do{
		   inputstringdata=bufferedreader.readLine();   
		   System.out.println(inputstringdata);
		  }while(!inputstringdata.equals("stop"));


	}

}
