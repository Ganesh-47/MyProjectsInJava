package com.aspire.school;

import java.util.Scanner;

public class GroupSeparator {
	static Scanner scanner=new Scanner(System.in);
	public static String groupSeparate(int mark){
	String group="";
	if(mark>=300){
		System.out.println("The Student Is Eligible To Choose The Following Departments");
		boolean flag=false;
		while(flag==false){
		System.out.println("1. Biology\n2. Computer science\n3. Pure science\n4. arts\nChoose the department(Eg: 1/2/3/4): ");
		String switchlable=scanner.nextLine();
		switch(switchlable){
		case "1":{
			group="Biology";
			flag=true;
			break;
		}
		case "2":{
			group="Computer science";
			flag=true;
			break;
		}
		case "3":{
			group="Pure science";
			flag=true;
			break;
		}
		case "4":{
			group="Arts";
			flag=true;
			break;
		}
		default:{
			System.out.println("Enter valid choise: ");
			flag=false;
		}
		}
		}
	}else if(mark<200){
		System.out.println("The Student can Choose Arts Only!!!");
		group="Arts";
	}else{
		boolean flag=false;
		while(flag==false){
		System.out.println("1. Computer science\n2. Pure science\n3. Arts\nChoose the department(Eg: 1/2/3):");
		String switchlablesecond=scanner.nextLine();
		switch(switchlablesecond){
		case "1":{
			group="Computer science";
			flag=true;
			break;
		}
		case "2":{
			group="Pure science";
			flag=true;
			break;
		}
		case "3":{
			group="Arts";
			flag=true;
			break;
		}
		default:{
			System.out.println("Enter valid choise");
			flag=false;
		}
		}
		}
	}
	
	return group;
	
	}
}
