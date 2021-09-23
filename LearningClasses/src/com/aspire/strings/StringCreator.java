package com.aspire.strings;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
public class StringCreator {
	public static void create(){
		String f="Hello World";
		String d="Hello Worldjhgu";
		String firstString=new String(f+"\n"+d);
		char data[]={'a','b','c'};
		String secondString=new String(data);
		char data1[]={'a','b','c','d','e','f'};
		String thirdString=new String(data1,2,3);
		System.out.println(firstString+"\n"+secondString+"\n"+thirdString);
		//String s1=new String(firstString);
		byte bt[]={65,66,67,68};
		String s2=new String(bt);
		System.out.println(s2);
	}
	public static void compare(){
		String s1="football";
		String s2="footBall";
		System.out.println("Football".equals(s1));//Case sensitive
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("Football".endsWith("ball"));
		System.out.println("Football".startsWith("Foot"));
		System.out.println("Football".startsWith("ball",4));
	}
	public static void convertCharArray(){
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter new String");
		String s1="HelloWorld";
		int stringLength=s1.length();
		System.out.println("String length is "+stringLength);
		char d[]=s1.toCharArray();
		int arrayLength=d.length;
		System.out.println("Array length is "+arrayLength);
		for(int i=0;i<arrayLength;i++){
			System.out.println(d[i]);
		}
		//scanner.close();
	}
	public static void changeCase(){
		String s="HelloWorld";
		String s1=s.toUpperCase();
		String s2=s.toLowerCase();
		String s3=s.substring(3);
		String s4=s.substring(1, 3);
		String s5=s.replace('o', 'a');
		System.out.println("Upper: "+s1);
		System.out.println("Lower: "+s2);
		System.out.println("Substring from intex 3: "+s3);
		System.out.println("Substring between intex 1 to intex 3: "+s4);
		System.out.println("String after replace of characters 'o' to 'a': "+s5);
	}
	public static void splitAndTrim(){
		Scanner scanner=new Scanner(System.in);
		String s="";
		s=scanner.nextLine();
		//scanner.close();
		s=s.trim();
		String data[]=s.split(" ");
		int wordCount=0;
		for(int malini=0;malini<data.length;malini++){
			if(data[malini].length()>0){
				wordCount++;
				System.out.println(data[malini]);
			}
		}
		System.out.println("the number of words are: "+wordCount);
		scanner.close();
	}
	public static void stringTokenize(){
		String s="ganesh      is      a      pilot";
		StringTokenizer stringtokenizer=new StringTokenizer(s," ");
		System.out.println("Count: "+stringtokenizer.countTokens());
		while(stringtokenizer.hasMoreTokens()){
			System.out.println(stringtokenizer.nextToken());
		}
		//System.out.println("Count: "+stringtokenizer.countTokens());
	}
	public static void stringJoiner(){
		String PREFIX="[",SUFIX="]";
		StringJoiner joiner=new StringJoiner(",",PREFIX,SUFIX);
		joiner.add("RED").add("GREEN").add("BLACK");
		//joiner.add("GREEN");
		//joiner.add("BLACK");
		System.out.println(joiner.toString());
		
	}
}
